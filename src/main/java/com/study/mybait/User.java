package com.study.mybait;

/**
 * Created by chaoxueling on 2015/12/9.
 */
public class User {

    public int Id;
    public String UserName;
    public String Password;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }


    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public  String toString(){
        return "User{id="+Id+"userName="+UserName+"password="+Password+"}";

    }

}
