package com.demo.dao;

public interface ForgotPasswordDao {
    boolean resetPassword(String uname, String email, String newpass);
}
