package com.demo.service;

import com.demo.dao.ForgotPasswordDao;
import com.demo.dao.ForgotPasswordDaoImpl;

public class ForgotPasswordServiceImpl implements ForgotPasswordService {
    private ForgotPasswordDao fdao;

    public ForgotPasswordServiceImpl() {
        fdao = new ForgotPasswordDaoImpl();
    }

    @Override
    public boolean resetPassword(String uname, String email, String newpass) {
        return fdao.resetPassword(uname, email, newpass);
    }
}
