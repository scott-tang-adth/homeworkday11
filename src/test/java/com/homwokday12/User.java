package com.homwokday12;

/**
 * @author by Scott.Tang
 * @Description ADTH
 * @date 2020/9/7.
 * @Copyright 精宇（上海）电子科技有限公司。 All rights reserved
 */
public class User {

    //register(String username,String password,String type,String sex)

    private String username;

    private String password;

    private String type;

    private String sex;

    public User() {
    }

    public User( String username, String password, String type, String sex ) {
        this.username = username;
        this.password = password;
        this.type = type;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername( String username ) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex( String sex ) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
