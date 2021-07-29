/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import static javax.swing.border.TitledBorder.CENTER;

/**
 *
 * @author danilus
 */
 public class Panelgrafica extends JPanel {
    
    public  double PRIMERNUMERO;
    public  double SEGUNDONUMERO;
    public  double TERCERNUMERO;
    private double RESULTADOUNO;
    private double PRIMERNUMERO1;
    private double SEGUNDONUMERO2;
    private double TERCERNUMERO3;
    private double RESULTADOUNO1;
    
    public Panelgrafica(){
         setLayout(null);
        setBackground(Color.WHITE);
    }

    public void setaaapanelgrafica(double Anumero1) {
       PRIMERNUMERO=Anumero1;
    }

    public void setbbbpanelgrafica(double Bnumero2) {
       SEGUNDONUMERO=Bnumero2;
    }

    public void setcccpanelgrafica(double Cnumero3) {
       TERCERNUMERO=Cnumero3;
    }
     public void resolverproblemaparcial(){
        RESULTADOUNO=(PRIMERNUMERO*SEGUNDONUMERO+TERCERNUMERO);
    }
     
    public void set1apanelgrafica(double Cnumero11) {
       PRIMERNUMERO1=Cnumero11;
    }

    public void set2apanelgrafica(double Cnumero11) {
       SEGUNDONUMERO2=Cnumero11;
    }

    public void set3apanelgrafica(double Cnumero11) {
        TERCERNUMERO3=Cnumero11;
    }
    public void resultadoecuacion1(){
         RESULTADOUNO1=(PRIMERNUMERO1*SEGUNDONUMERO2+TERCERNUMERO3);
    }
    
    
    @Override
    public void paintComponent (Graphics g){
      super.paintComponent(g);
      
      //Capturo el ancho y alto del panel
        int w= this.getWidth();
        int h = this.getHeight();
      
            g.setColor(Color.LIGHT_GRAY);
        for(int i=0;i<=w;i= i + 10)
        {
            g.drawLine(10+i, 0, 10+i,w);
        }
       
         g.setColor(Color.LIGHT_GRAY);
        for(int i=0;i<=w;i= i + 10)
        {
            g.drawLine(0, 10+i, w,10+i);
        }
        
        g.setColor(Color.BLACK);
        g.drawLine(0, h/2, w, h/2);
        g.drawLine(w/2, 0, w/2, h);
        g.translate(w/2, h/2);
       
       
         for(int i=-w;i<=w;i=i+1)
        {
            g.setColor(Color.ORANGE);
            g.drawLine(i*10, -((i*(int)PRIMERNUMERO) + (int)SEGUNDONUMERO), (i+3)*10, -(((i+3)*(int)PRIMERNUMERO) + (int)SEGUNDONUMERO));
             g.setColor(Color.BLUE);
            g.drawLine(i*10, -((i*(int)PRIMERNUMERO1) + (int)SEGUNDONUMERO2), (i+3)*10, -(((i+3)*(int)PRIMERNUMERO1) + (int)SEGUNDONUMERO2));
        }
    
     
      
      repaint();
  }
}
