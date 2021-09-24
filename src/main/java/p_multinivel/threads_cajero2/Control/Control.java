package p_multinivel.threads_cajero2.Control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import View.Principalview;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import p_multinivel.threads_cajero2.Model.CajeroThread;
import p_multinivel.threads_cajero2.Model.Cliente;

/**
 *
 * @author migue
 */
public class Control implements ActionListener{
    
    private Principalview objPview;
    private Cliente cliente1, cliente2;
    private CajeroThread cajero1, cajero2;

    public Control(Principalview objPview, Cliente cliente1, Cliente cliente2, CajeroThread cajero1, CajeroThread cajero2) {
        objPview = new Principalview();
        cliente1 = new Cliente();
        cliente2 = new Cliente();
        cajero1 = new CajeroThread();
        cajero2 = new CajeroThread();
    }
    
    public Control() {
        objPview = new Principalview();
        cliente1 = new Cliente();
        cliente2 = new Cliente();
        cajero1 = new CajeroThread();
        cajero2 = new CajeroThread();
    }
    
    
    public void init(){
        objPview.setVisible(true);
    }

    
    public void play(){
        
        cliente1.setNombre("Cliente 1");
        cliente1.setCarroCompra(new int[] {2,2,1,5,2,3});
        
        cliente2.setNombre("Cliente 2");
        cliente2.setCarroCompra(new int[] {1,3,5,1,1});
        
        //Cliente cliente1 = new Cliente("Cliente 1", new int[] {2,2,1,5,2,3});
        //Cliente cliente2 = new Cliente("Cliente 2", new int[] {1,3,5,1,1});
        
        cajero1.setNombre("Cajera 1");
        cajero1.setCliente(cliente1);
        cajero1.setInitialTime(System.currentTimeMillis());
        
        cajero2.setNombre("Cajera 2");
        cajero2.setCliente(cliente2);
        cajero2.setInitialTime(System.currentTimeMillis());
        
        
        //CajeroThread cajero1 = new CajeroThread("Cajera 1", cliente1, System.currentTimeMillis());
        //CajeroThread cajero2 = new CajeroThread("Cajera 2", cliente2, System.currentTimeMillis());
        
        cajero1.start();
        cajero2.start();
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
