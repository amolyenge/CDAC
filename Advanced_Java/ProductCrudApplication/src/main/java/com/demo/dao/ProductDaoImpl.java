package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.demo.bean.Product;

public class ProductDaoImpl implements ProductDao {
    private static Connection conn;
    private static PreparedStatement selproduct, insproduct, selById, updateById, deleteById;

    static {
        conn = DBUtil.getMyConnection();
        try {
            // Use products5 as requested
            selproduct  = conn.prepareStatement("SELECT * FROM products5");
            insproduct  = conn.prepareStatement("INSERT INTO products5 (pid, pname, qty, price, expdate, cid) VALUES (?,?,?,?,?,?)");
            selById     = conn.prepareStatement("SELECT * FROM products5 WHERE pid=?");
            updateById  = conn.prepareStatement("UPDATE products5 SET pname=?, qty=?, price=?, expdate=?, cid=? WHERE pid=?");
            deleteById  = conn.prepareStatement("DELETE FROM products5 WHERE pid=?");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> findAllProducts() {
        List<Product> plist = new ArrayList<>();
        try (ResultSet rs = selproduct.executeQuery()) {
            while (rs.next()) {
                plist.add(new Product(
                    rs.getInt("pid"),
                    rs.getString("pname"),
                    rs.getInt("qty"),
                    rs.getDouble("price"),
                    rs.getDate("expdate").toLocalDate(),
                    rs.getInt("cid")
                ));
            }
            return plist;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return plist;
    }

    @Override
    public boolean save(Product p) {
        try {
            insproduct.setInt(1, p.getPid());
            insproduct.setString(2, p.getPname());
            insproduct.setInt(3, p.getQty());
            insproduct.setDouble(4, p.getPrice());
            insproduct.setDate(5, java.sql.Date.valueOf(p.getExpdate()));
            insproduct.setInt(6, p.getCid());
            int n = insproduct.executeUpdate();
            return n > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Product findById(int pid) {
        try {
            selById.setInt(1, pid);
            try (ResultSet rs = selById.executeQuery()) {
                if (rs.next()) {
                    return new Product(
                        rs.getInt("pid"),
                        rs.getString("pname"),
                        rs.getInt("qty"),
                        rs.getDouble("price"),
                        rs.getDate("expdate").toLocalDate(),
                        rs.getInt("cid")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean modifyproduct(Product p) {
        try {
            updateById.setString(1, p.getPname());
            updateById.setInt(2, p.getQty());
            updateById.setDouble(3, p.getPrice());
            updateById.setDate(4, java.sql.Date.valueOf(p.getExpdate()));
            updateById.setInt(5, p.getCid());
            updateById.setInt(6, p.getPid());
            int n = updateById.executeUpdate();
            return n > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean removeById(int pid) {
        try {
            deleteById.setInt(1, pid);
            int n = deleteById.executeUpdate();
            return n > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
