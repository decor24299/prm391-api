package com.example.restful.api.service.impl;

import com.example.restful.api.service.LoginService;
import com.example.restful.lib.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

    private final LoginMapper loginMapper;

    @Autowired
    public LoginServiceImp(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    @Override
    public String getUserRoleId(String email, String password) {
        return loginMapper.getUserRole(email, password);
    }

}
