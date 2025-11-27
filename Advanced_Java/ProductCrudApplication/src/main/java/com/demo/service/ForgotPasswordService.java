package com.demo.service;

public interface ForgotPasswordService {
    boolean resetPassword(String uname, String email, String newpass);
}
