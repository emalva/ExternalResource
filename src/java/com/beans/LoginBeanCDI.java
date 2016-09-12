/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.entities.User;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;

/**
 *
 * @author manito
 */
@Named(value = "loginBeanCDI")
@SessionScoped
public class LoginBeanCDI implements Serializable {

    private User user;
    /**
     * Creates a new instance of LoginBeanCDI
     */
    public LoginBeanCDI() {
    }
    
    @PostConstruct
    public void init(){
        user = new User();
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public String login(){
        return (validateUser())?"success":"fail";
    }

    private boolean validateUser() {
        return this.user.getUsername().equals("emalva")?true:false;
    }

}
