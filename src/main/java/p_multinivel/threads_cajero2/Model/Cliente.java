/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_multinivel.threads_cajero2.Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class Cliente {
    
    private String nombre;
    private int[] carroCompra;

    public Cliente(String nombre, int[] carroCompra) {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }

    public Cliente() {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }
    
    public void cargarinf(){
        String nombreFichero = "Fila.txt";  
        BufferedReader br = null;
        ArrayList<String> productos = new ArrayList<String>();
              
        try {
           //Crear un objeto BufferedReader al que se le pasa 
           //   un objeto FileReader con el nombre del fichero
           br = new BufferedReader(new FileReader(nombreFichero));
           //Leer la primera línea, guardando en un String
           String texto = br.readLine();
           //Repetir mientras no se llegue al final del fichero
           while(texto != null)
           {
               //Hacer lo que sea con la línea leída
               //System.out.println(texto);
               productos.add(texto);
               //Leer la siguiente línea
               texto = br.readLine();
           }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
