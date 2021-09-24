
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class Cliente {
    
    private ArrayList<Producto> productos ;
    
    public Cliente() {
        
        this.productos = new ArrayList<Producto>();
        
    }
    

    public Cliente(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    
    public String toString(){
        
        return "productos"+productos;
    }
    
    
    
    
    
}
