package com.demo.ProductCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ProductCrud.beans.MyUser;

@Repository
public interface LoginDao extends JpaRepository<MyUser,Integer>{

}
