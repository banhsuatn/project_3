package com.vhviet.demo.model;

public class Function {
    private int id;
    private String name;

    public void login(){
        System.out.println("login ko tham so");
    }

    public void login(String username, String password){
        System.out.println("login co tham so");
    }

    public void login(String username, int id){
        System.out.println("login co tham so id");
    }

    public void register(){

    }
}
