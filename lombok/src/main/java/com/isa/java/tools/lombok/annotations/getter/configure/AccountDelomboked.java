package com.isa.java.tools.lombok.annotations.getter.configure;

public class AccountDelomboked {

    private String username;
    private int password;

    public String username() {
        return this.username;
    }

    public int password() {
        return this.password;
    }

    public AccountDelomboked username(String username) {
        this.username = username;
        return this;
    }

    public AccountDelomboked password(int password) {
        this.password = password;
        return this;
    }
}