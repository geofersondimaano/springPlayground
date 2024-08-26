package com.example.demo.data;

public class UserInfo {

    private String userName;
    private String password;
    private String errortxt;
    public UserInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getErrortxt() {
        return errortxt;
    }

    public void setErrortxt(String errortxt) {
        this.errortxt = errortxt;
    }
}
