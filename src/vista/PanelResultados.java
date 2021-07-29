/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author danilus
 */
public class PanelResultados extends JPanel {

    private JTextArea respuesta;
    private JScrollPane respuestita;

    public PanelResultados() {

        setLayout(null);

        setBackground(Color.WHITE);

        TitledBorder borde = BorderFactory.createTitledBorder("RESULTADOS");
        borde.setTitleColor(Color.RED);
        setBorder(borde);

        respuesta = new JTextArea("");
        respuesta.setFont(new Font("Arial", Font.BOLD, 20));
        respuesta.setForeground(Color.RED);

        respuestita = new JScrollPane(respuesta);
        add(respuestita);
        respuestita.setBounds(2, 20, 490, 140);

    }

    public void mostrarResultados(String msj) {
        respuesta.append(msj + "\n");
    }

    public void borrartodoslosdatospanelresultados() {
        respuesta.setText(" ");
    }

}
