package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.demo.bean.MyUser;

public class RegisterDaoImpl implements RegisterDao {
    private static Connection conn;

    static {
        conn = DBUtil.getMyConnection();
    }

    @Override
    public boolean addUser(MyUser user, String pass) {
        try {
            String query = "INSERT INTO users(uname, email, role, pass) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user.getUname());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getRole());
            ps.setString(4, pass);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
