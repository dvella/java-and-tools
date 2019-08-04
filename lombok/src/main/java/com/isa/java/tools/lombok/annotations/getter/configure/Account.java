package com.isa.java.tools.lombok.annotations.getter.configure;

import lombok.experimental.Accessors;

@Accessors(fluent = true, chain = true)
public class Account {

    private String username;
    private String password;

    public String username() {
        return this.username;
    }

    public String password() {
        return this.password;
    }

    public Account username(String username) {
        this.username = username;
        return this;
    }

    public Account password(String password) {
        this.password = password;
        return this;
    }
}
