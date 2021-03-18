package com.sso.login.pojo;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author Lenovo
 * @Date 2021/3/17 18:32
 */
public class User {
    private Integer id;
    private String UserName;
    private String passWord;

    public User(Integer id, String userName, String passWord) {
        this.id = id;
        UserName = userName;
        this.passWord = passWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
