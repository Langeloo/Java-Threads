package Controlador;

import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


/**
 *
 * @author Santiago
 */
public class Control implements ActionListener{
    public Formulario objVista = new Formulario();
    public Usuarios objUsuario = new Usuarios();
    private listaClientes lista;

    public Control() {
        objVista.setVisible(true);
        objVista.getBtnIngresar().addActionListener(this);
        lista = new listaClientes();
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
        CajeroThread cajero1 = new CajeroThread(productos,lista.getClientes());
        cajero1.run();
        CajeroThread cajero2 = new CajeroThread(productos,lista.getClientes());
        cajero2.run();
        CajeroThread cajero3 = new CajeroThread(productos,lista.getClientes());
        cajero3.run();
        for(int i=0; i<lista.getClientes().size(); i++){
            System.out.println("clientes" + lista.getClientes().get(i));
        }
        
        
    }
    
    /*public ArrayList cargarcliente(){
        
        ArrayList<String[][]> clientes = new ArrayList<String[][]>();
        
        
        return clientes;
    }*/
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== objVista.getBtnIngresar()){
            objUsuario.leerTxt("Usuarios.txt");
            int verificado;
            verificado=objUsuario.VerificarDatos(objVista.getTxtUsuario().getText(),
                    Long.parseLong(objVista.getTxtContrasena().getText()));
            if(verificado == 0){
                int nuevaConfir;
                nuevaConfir = objVista.Exito();
                if(nuevaConfir!=0){
                    // aca se creara el pdf
                    
                }
            }else{
                objVista.ErrorDatos();
            }
        }
        if(ae.getSource() == objVista.getJbtn_empezar()){
            
        }
    }
    
}
