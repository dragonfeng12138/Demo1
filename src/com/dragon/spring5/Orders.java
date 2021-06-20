package com.dragon.spring5;

/**
 * @author dragon
 * @create 2021-06-20 14:37
 */
public class Orders {
    private String name;
    private String address;
    //有参构造
    public Orders(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void test(){
        System.out.println(name+"::"+address);
    }

}
