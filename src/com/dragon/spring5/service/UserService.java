package com.dragon.spring5.service;

import com.dragon.spring5.dao.UserDao;

/**
 * @author dragon
 * @create 2021-06-20 15:19
 */
public class UserService {


    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add......");
        userDao.update();
    }
}
