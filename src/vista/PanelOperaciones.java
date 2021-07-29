/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author danilus
 */
public class PanelOperaciones extends JPanel {

    public JButton solucion;
    public JButton borrar;

    public PanelOperaciones() {

        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);

        TitledBorder borde = BorderFactory.createTitledBorder("OPERACIONES");
        borde.setTitleColor(Color.RED);
        setBorder(borde);

        //Creación y adicion de los botones
        solucion = new JButton("generar");
        solucion.setFont(new Font("Arial", BOLD, 12));
        solucion.setBounds(10, 20, 90, 20);
        add(solucion);
        solucion.setActionCommand("generar");

        borrar = new JButton("borrar");
        borrar.setFont(new Font("Arial", BOLD, 12));
        borrar.setBounds(10, 90, 90, 20);
        add(borrar);
        borrar.setActionCommand("borrar");

    }

    public void escucharlosbotones(ActionListener hello)
    {
        solucion.addActionListener(hello);
        borrar.addActionListener(hello);
    }
      public void activarBotones()
    {
        solucion.setEnabled(true);
        borrar.setEnabled(true);
      
    }

}
