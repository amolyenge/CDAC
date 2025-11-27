package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.bean.MyUser;

public class LoginDaoImpl implements LoginDao {
    private static Connection conn = null;
    private static PreparedStatement seluser;

    static {
        try {
            conn = DBUtil.getMyConnection();
            // Table name must be 'users'; column is 'pass'
            seluser = conn.prepareStatement(
                "SELECT uname, email, role FROM users WHERE uname=? AND pass=?"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MyUser checkUser(String uname, String pass) {
        try {
            seluser.setString(1, uname);
            seluser.setString(2, pass);
            ResultSet rs = seluser.executeQuery();
            if (rs.next()) {
                return new MyUser(
                    rs.getString("uname"),
                    rs.getString("email"),
                    rs.getString("role")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
