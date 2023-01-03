package com.day03.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl01")
public class userDaoImpl implements userDao{
    @Override
    public void addDao() {
        System.out.println("this is userDao------");
    }
}
