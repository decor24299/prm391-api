package com.example.restful.api.controller;

import com.example.restful.api.dataset.request.User;
import com.example.restful.api.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v0/login")
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public String getUserRoleId(@RequestBody final User user) {
        return loginService.getUserRoleId(user.getEmail(), user.getPassword());
    }

}
