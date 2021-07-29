/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author danilus
 */
public class PanelEntradaDatos extends JPanel {
    
    
    //Atributos
    //------------------------
   
   
    private JLabel indicaciones;
    public JTextField numerito1;
    public JTextField numerito2;
    public JTextField numerito3;
     public JTextField numerito11;
    public JTextField numerito22;
    public JTextField numerito33;
    private JLabel lbImagen;
    private ImageIcon imagen;
    //------------------------
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        TitledBorder borde = BorderFactory.createTitledBorder("DATOS DE ENTRADA");
        borde.setTitleColor(Color.RED);
        setBorder(borde);
        
        //vamos   a crear los JTextfield
        numerito1 = new JTextField();
        numerito1.setBounds(300, 40, 60, 20);
        add(numerito1);
        //
        numerito2 = new JTextField();
        numerito2.setBounds(300,60,60,20);
        add(numerito2);
//
        numerito3 = new JTextField();
        numerito3.setBounds(300,80,60,20);
        add(numerito3);
        
        //vamos   a crear los JTextfield
        numerito11 = new JTextField();
        numerito11.setBounds(183, 40, 60, 20);
        add(numerito11);
        
         numerito22= new JTextField();
        numerito22.setBounds(183,60,60,20);
        add(numerito22);

         numerito33 = new JTextField();
        numerito33.setBounds(183,80,60,20);
        add(numerito33);
//

        
        //vamos  agregar  las jlabel
        indicaciones = new JLabel("M  = ");
        indicaciones.setBounds(250, 40, 60, 20);
        add(indicaciones);
        
         indicaciones = new JLabel("X   = ");
        indicaciones.setBounds(250,60,60,20);
        add(indicaciones);
        
         indicaciones = new JLabel("B = ");
        indicaciones.setBounds(250,80,60,20);
        add(indicaciones);
        
        imagen = new ImageIcon(getClass().getResource("/vista/índice.png"));
        lbImagen = new JLabel(imagen);
        lbImagen.setBounds(30,40,140,120);
        add(lbImagen);
      
        
        
}
  public String TEXTO1()
    {
        return  numerito1.getText();
    }
     public String TEXTO2()
    {
        return  numerito2.getText();
    } 
      public String TEXTO3()
    {
        return  numerito3.getText();
    } 
     public String TEXTO11()
    {
        return  numerito11.getText();
    }
    public String TEXTO22()
    {
        return  numerito22.getText();
    } public String TEXTO33()
    {
        return  numerito33.getText();
    }
     //vamos a borrar toda  esta  joda
    public void borrartodolosdatos()
    {
        numerito1.setText("");
        numerito2.setText("");
        numerito3.setText("");
         numerito11.setText("");
          numerito22.setText("");
           numerito33.setText("");
    }

    
}
