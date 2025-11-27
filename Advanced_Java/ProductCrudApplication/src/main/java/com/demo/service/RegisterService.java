package com.demo.service;

import com.demo.bean.MyUser;

public interface RegisterService {
    boolean registerUser(MyUser user, String pass);
}
