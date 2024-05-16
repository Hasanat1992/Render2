package com.SoringBoot.TestProject.dto;


import com.SoringBoot.TestProject.entity.User;

public class JwtResponse {

    private User user;
    private String jwtToken;


//    constructor
    public JwtResponse(User user, String jwtToken) {
        this.user = user;
        this.jwtToken = jwtToken;
    }


//    constructor

    public JwtResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }


//    gettter and setter
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    //    gettter and setter
    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
