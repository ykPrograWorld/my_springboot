package com.kai.entity;

/**
 * @Author: kai
 * @Date: Created in 下午 10:05 2018/11/16
 */
public class User {

    private int id;
    private String email;
    private String nick_name;
    private String reg_time;
    private String username;

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNick_name() {
        return nick_name;
    }

    public String getReg_time() {
        return reg_time;
    }

    public String getUsername() {
        return username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public void setReg_time(String reg_time) {
        this.reg_time = reg_time;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nick_name='" + nick_name + '\'' +
                ", reg_time='" + reg_time + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
