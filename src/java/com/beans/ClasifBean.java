/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author manito
 */
@Named(value = "clasifBean")
@RequestScoped
public class ClasifBean {

    private int age;
    /**
     * Creates a new instance of ClasifBean
     */
    public ClasifBean() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
