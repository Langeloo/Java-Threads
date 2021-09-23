/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class listaClientes {
    
    
    private ArrayList<Cliente> clientes;
       
    
     public listaClientes() {
        this.clientes = new ArrayList<Cliente>();
    }
     
    public listaClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "clientes  " + clientes ;
    }
    
    
    
    
    
    
}
