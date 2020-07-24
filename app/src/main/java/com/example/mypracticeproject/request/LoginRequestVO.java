package com.example.mypracticeproject.request;

public class LoginRequestVO {

    /**
     * captcha : string
     * password : string
     * signature : string
     * username : string
     */

    private String captcha;
    private String password;
    private String signature;
    private String username;

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
