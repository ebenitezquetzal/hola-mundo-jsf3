/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.mbeans;

import com.qualitas.entities.Cliente;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author ebenitez
 */
@Named(value = "newJSFManagedBean")
@Dependent
public class NewJSFManagedBean {
    private String cadena = "Hola desde el MB";
    private Cliente cliente;
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public NewJSFManagedBean() {
    }
    
    @PostConstruct
    private void inicializar(){
       cliente = new Cliente("Edgar Benitez","347889ASDF9787"
                , "Ford", 2016);
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
