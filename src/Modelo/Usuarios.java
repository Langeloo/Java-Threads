package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Santiago
 */
public class Usuarios {
    public String usuario[];
    public long clave[];

    public Usuarios() {
        usuario = new String[2];
        clave = new long[2];
    }  
    
    public void leerTxt (String direccion){ 
        String texto="";
        try {
            BufferedReader bf= new BufferedReader(new FileReader(direccion));
            String temp="";
            String bfRead;
            while ((bfRead = bf.readLine()) != null){ // se hace el ciclo, mientras bfRead tenga datos
                temp=temp+bfRead;// guardado del texto de archivo
            }
            texto= temp;
            String[]values = texto.split(";");
            for(int i=0;i<4;i++){
                System.out.println(values[i]);
            }
            usuario[0] = values[0];
            clave[0] = Long.parseLong(values[1]);
            usuario[1] = values[2];
            clave[1]= Long.parseLong(values[3]);
            for(int j=0;j<2;j++){
                System.out.println("Usuario "+(j+1)+": "+usuario[j]+", Clave: "+clave[j]);
            }
        }
        catch (IOException e){
            System.out.println("no se encontro archivo");
        }
    }
    public int VerificarDatos(String usu,long cla){
        int retorno = 1;
        for(int i=0;i<2;i++){
            if(usuario[i].equals(usu)){
                retorno = 0;break;
            }else{
                retorno = 1;
            }
            if(clave[i] == cla){
                retorno = 0;break;
            }else{
                retorno = 1;
            }
        }
        return retorno;
    }
    
}
