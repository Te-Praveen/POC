package com.psl.userservice.service;

import com.psl.userservice.dto.User;
import com.psl.userservice.repo.UserRepository;
import com.psl.userservice.vo.Department;
import com.psl.userservice.vo.ResponseTemplateVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        LOGGER.info(String.format("Request Received at Service %s", user));
        return userRepository.save(user);
    }


    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        LOGGER.info("User Id Object as Request : ", userId);
        User user = userRepository.findByUserId(userId);
        LOGGER.info("User Object From Database", user);
        responseTemplateVO.setUser(user);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
        responseTemplateVO.setDepartment(department);
        LOGGER.info("Department Object From Department Service ", department);
        return responseTemplateVO;
    }
}
