package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ForgotPasswordDaoImpl implements ForgotPasswordDao {
    private static Connection conn;

    static {
        conn = DBUtil.getMyConnection();
    }

    @Override
    public boolean resetPassword(String uname, String email, String newpass) {
        try {
            String query = "UPDATE users SET pass=? WHERE uname=? AND email=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, newpass);
            ps.setString(2, uname);
            ps.setString(3, email);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
