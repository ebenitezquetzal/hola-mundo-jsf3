/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.mbeans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author ebenitez
 */
@ManagedBean
public class ManagedBeanSaludo {

    /**
     * Creates a new instance of ManagedBeanSaludo
     */
    public ManagedBeanSaludo() {
        
    }
    
    public String saludo(){
        return "saludo";
    }                
}
