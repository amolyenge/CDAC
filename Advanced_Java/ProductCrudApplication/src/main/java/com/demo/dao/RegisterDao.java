package com.demo.dao;

import com.demo.bean.MyUser;

public interface RegisterDao {
    boolean addUser(MyUser user, String pass);
}
