/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author migue
 */
public class Producto {
    
    
    private String nombre;
    private int precio;
    private int tiempo;

    public Producto(String nombre, int precio, int tiempo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", precio=" + precio + ", tiempo=" + tiempo ;
    }
    
    
    
    
    
    
}
