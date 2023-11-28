package com.psl.userservice.controller;

import com.psl.userservice.dto.User;
import com.psl.userservice.service.UserService;
import com.psl.userservice.vo.ResponseTemplateVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        LOGGER.info(String.format("Request Received at Controller %s", user));
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        LOGGER.info(String.format("Request Received at Controller %s", userId));
        return userService.getUserWithDepartment(userId);
    }
}
