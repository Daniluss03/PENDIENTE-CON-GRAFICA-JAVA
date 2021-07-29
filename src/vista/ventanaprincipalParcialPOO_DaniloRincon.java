/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;

/**
 * 
 * @author danilus
 */
public class ventanaprincipalParcialPOO_DaniloRincon extends JFrame {

 
    public PanelEntradaDatos miPanelEntradaDatosparcial;
    public PanelOperaciones miPanelOperacionesparcial;
    public PanelResultados miPanelResultadoparcial;
   public Panelgrafica mipanelgraficaparcial; 
   
        
        
        
    
//Metodo constructor
    public ventanaprincipalParcialPOO_DaniloRincon()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatosparcial = new PanelEntradaDatos();
        miPanelEntradaDatosparcial.setBounds(10,10,380,190);
        add(miPanelEntradaDatosparcial);
       
        
        //Creación y adición del PanelOperaciones
        miPanelOperacionesparcial = new PanelOperaciones();
        miPanelOperacionesparcial.setBounds(400, 10, 110, 190);
        add(miPanelOperacionesparcial);
        
        //Creación y adición del PanelOperaciones
        miPanelResultadoparcial = new PanelResultados();
        miPanelResultadoparcial.setBounds(10, 220, 500, 200);
        add(miPanelResultadoparcial);
        
        mipanelgraficaparcial = new Panelgrafica();
        mipanelgraficaparcial.setBounds(550,10, 400, 530);        
        add(mipanelgraficaparcial);
        
        
        
       //Caracteristicas de la ventana
        setTitle("PARCIAL POO");
        setSize(1000,600);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
    

}
}