package com.demo.service;

import com.demo.bean.MyUser;
import com.demo.dao.RegisterDao;
import com.demo.dao.RegisterDaoImpl;

public class RegisterServiceImpl implements RegisterService {
    private RegisterDao rdao;

    public RegisterServiceImpl() {
        rdao = new RegisterDaoImpl();
    }

    @Override
    public boolean registerUser(MyUser user, String pass) {
        return rdao.addUser(user, pass);
    }
}
