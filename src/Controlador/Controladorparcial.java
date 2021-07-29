/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DesarrolloProblema.desarrolloproblemaparcial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.ventanaprincipalParcialPOO_DaniloRincon;

/**
 *
 * @author danilus
 */
public class Controladorparcial implements ActionListener {
    
    
    private ventanaprincipalParcialPOO_DaniloRincon venPrin;
    private desarrolloproblemaparcial midesarrolloproblemapoo;
    

    public Controladorparcial(ventanaprincipalParcialPOO_DaniloRincon miVentanaaa, desarrolloproblemaparcial midesarollooo) {
        
        
        this.venPrin = miVentanaaa;
        this.midesarrolloproblemapoo = midesarollooo;
        this.venPrin.miPanelOperacionesparcial.escucharlosbotones(this);
     
}


    @Override
    public void actionPerformed(ActionEvent ae) {
        
         String comando = ae.getActionCommand();
    
        if (comando.equals("generar")) {
            try{
               
               
                double Anumero1 = Double.parseDouble(venPrin.miPanelEntradaDatosparcial.TEXTO1());
                double Bnumero2 = Double.parseDouble(venPrin.miPanelEntradaDatosparcial.TEXTO2());
                double Cnumero3 = Double.parseDouble(venPrin.miPanelEntradaDatosparcial.TEXTO3());
                 double Cnumero11 = Double.parseDouble(venPrin.miPanelEntradaDatosparcial.TEXTO11());
                  double Cnumero22= Double.parseDouble(venPrin.miPanelEntradaDatosparcial.TEXTO22());
                   double Cnumero33 = Double.parseDouble(venPrin.miPanelEntradaDatosparcial.TEXTO33());
                midesarrolloproblemapoo= new  desarrolloproblemaparcial(Anumero1,Bnumero2, Cnumero3, Cnumero11, Cnumero22, Cnumero33 );
         
                
                venPrin.miPanelResultadoparcial.mostrarResultados("La pendiente de la primera linea es : " 
                        +midesarrolloproblemapoo.devolvex() +"\nEl desarrollo de la ecuacion 1 es"+
                         "\nEl punto de corte con el eje Y de la primera linea es : "  + midesarrolloproblemapoo.devolvey()+
                        +midesarrolloproblemapoo.desarrolloproblemaparcial()+"\nel desarrollo de la ecuacion 2 es:"
                        +midesarrolloproblemapoo.desarrolloproblemaparcial1());
                
                
                venPrin.mipanelgraficaparcial.setaaapanelgrafica(Anumero1);
                venPrin.mipanelgraficaparcial.setbbbpanelgrafica(Bnumero2);
                venPrin.mipanelgraficaparcial.setcccpanelgrafica(Cnumero3);
                venPrin.mipanelgraficaparcial.set1apanelgrafica(Cnumero11);
                venPrin.mipanelgraficaparcial.set2apanelgrafica(Cnumero11);
               venPrin.mipanelgraficaparcial.set3apanelgrafica(Cnumero11);
                
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error en los datos de entrada", "TEmp. 1.0", JOptionPane.ERROR_MESSAGE);
            }
    }
       
        
        if (comando.equals("borrar")) {

           venPrin.miPanelEntradaDatosparcial.borrartodolosdatos();
           venPrin.miPanelResultadoparcial.borrartodoslosdatospanelresultados();
    }
    
}
}