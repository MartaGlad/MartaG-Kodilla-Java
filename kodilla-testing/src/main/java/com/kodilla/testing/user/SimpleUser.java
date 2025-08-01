package com.kodilla.testing.user;

public class SimpleUser {
    private String username;
    private String realName;

    public SimpleUser(String username){
        this.username = username;
    }

    public SimpleUser(String userName, String realName){
        this.username = userName;
        this.realName = realName;
    }

    public String getUsername(){
        return this.username;
    }

    public String getRealName(){
        return this.realName;
    }
}
