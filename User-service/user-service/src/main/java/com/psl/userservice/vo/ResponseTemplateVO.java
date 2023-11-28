package com.psl.userservice.vo;

import com.psl.userservice.dto.User;

public class ResponseTemplateVO {

    private User user;
    private Department department;

    @Override
    public String toString() {
        return "ResponseTemplateVO{" +
                "user=" + user +
                ", department=" + department +
                '}';
    }

    public ResponseTemplateVO() {
    }

    public ResponseTemplateVO(User user, Department department) {
        this.user = user;
        this.department = department;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
