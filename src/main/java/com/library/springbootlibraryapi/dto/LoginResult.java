package com.library.springbootlibraryapi.dto;

// import lombok.Data;
// import lombok.NonNull;
// import lombok.RequiredArgsConstructor;

// @Data
// @RequiredArgsConstructor
public class LoginResult {

    public LoginResult(String token) {
        this.token = token;
    }

    // @NonNull
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
