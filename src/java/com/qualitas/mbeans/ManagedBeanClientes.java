/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.mbeans;

import com.qualitas.entities.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

/**
 * @author ebenitez
 */
@ManagedBean
public class ManagedBeanClientes {
    private List<Cliente> regresaclientes;
    private int numeroElementos;
    
    public ManagedBeanClientes() {
    }
        
    @PostConstruct
    private void inicializar(){ 
        setRegresaclientes(new ArrayList<>());
        
        getRegresaclientes().add(new Cliente("Edgar Benitez1","347889ASDF9787"
                , "Ford", 2016));
        getRegresaclientes().add(new Cliente("Edgar Benitez2","347889ASDF9787"
                , "Ford", 2017));
        getRegresaclientes().add(new Cliente("Edgar Benitez3","347889ASDF9787"
                , "Ford", 2018));
        getRegresaclientes().add(new Cliente("Edgar Benitez4","347889ASDF9787"
                , "Ford", 2019));        
    }        
    
    public String navegar(){
        
        return "regresaclientes";
    }
        
    /**
     * @return the numeroElementos
     */
    public int getNumeroElementos() {
        numeroElementos = getRegresaclientes().size();
        return numeroElementos;
    }

    /**
     * @param numeroElementos the numeroElementos to set
     */
    public void setNumeroElementos(int numeroElementos) {
        this.numeroElementos = numeroElementos;
    }

    /**
     * @return the regresaclientes
     */
    public List<Cliente> getRegresaclientes() {
        return regresaclientes;
    }

    /**
     * @param regresaclientes the regresaclientes to set
     */
    public void setRegresaclientes(List<Cliente> regresaclientes) {
        this.regresaclientes = regresaclientes;
    }

   
   
}
