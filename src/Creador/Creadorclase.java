/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creador;

import Controlador.Controladorparcial;
import DesarrolloProblema.desarrolloproblemaparcial;
import vista.ventanaprincipalParcialPOO_DaniloRincon;

/**
 *
 * @author danilus
 */
public class Creadorclase {
    
     public static void main(String[] args)
    {
        ventanaprincipalParcialPOO_DaniloRincon miVentanaaa = new ventanaprincipalParcialPOO_DaniloRincon();
        desarrolloproblemaparcial midesarollooo=null;
         Controladorparcial miControlador = new Controladorparcial(miVentanaaa, midesarollooo); 
    }
}
