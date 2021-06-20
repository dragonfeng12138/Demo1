package com.dragon.spring5;

/**
 * @author dragon
 * @create 2021-06-20 14:14
 */
public class Book {

    //创建属性
    private String name;
    private String author;
    private String address;
    //创建属性对应的set方法注入
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void test(){
        System.out.println(name+"::"+ author+"::"+address);
    }
    
}
