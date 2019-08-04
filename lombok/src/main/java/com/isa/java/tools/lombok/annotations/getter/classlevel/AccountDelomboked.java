package com.isa.java.tools.lombok.annotations.getter.classlevel;

public class AccountDelomboked {

    private String username;
    private int password;

    public String getUsername() {
        return this.username;
    }

    public int getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}