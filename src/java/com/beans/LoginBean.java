/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.entities.User;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ealvarado
 */
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{
    
    private User user;
    
    @PostConstruct
    public void init(){
        user = new User();
    }
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public String goToWelcome(){
        return "/pages/welcome?faces-redirect=true";
    }
    

}
