/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloProblema;

/**
 *
 * @author danilus
 */
public class desarrolloproblemaparcial {

    //Atributos
    private double PRIMERNUMERO;
    private double SEGUNDONUMERO;
    private double TERCERNUMERO;
    private double RESULTADOUNO;
    private double PRIMERNUMERO1;
    private double SEGUNDONUMERO2;
    private double TERCERNUMERO3;
    private double RESULTADOUNO1;

    public desarrolloproblemaparcial(double Anumero1, double Bnumero2, double Cnumero3, double Cnumero11, double Cnumero22, double Cnumero33)
    {
        this.PRIMERNUMERO = Anumero1;
        this.SEGUNDONUMERO = Bnumero2;
        this.TERCERNUMERO = Cnumero3;
        this.PRIMERNUMERO1 = Cnumero11;
        this.SEGUNDONUMERO2 = Cnumero22;
        this.TERCERNUMERO3 = Cnumero33;
    }
   public double devolvex(){
       return this.PRIMERNUMERO;
   }
    public double devolvey(){
       return this.TERCERNUMERO;
   }
    
     public double devolvex1(){
       return this.PRIMERNUMERO1;
   }
    
      public double devolvey1(){
       return this.TERCERNUMERO3;
   }
    
    
    
    
    public void resolverproblemaparcial() {
        RESULTADOUNO = (PRIMERNUMERO * SEGUNDONUMERO + TERCERNUMERO);
        RESULTADOUNO1 = (PRIMERNUMERO1 * SEGUNDONUMERO2 + TERCERNUMERO3);
    }

    public double desarrolloproblemaparcial() {
        return RESULTADOUNO;
    }

    public double desarrolloproblemaparcial1() {
        return RESULTADOUNO1;
    }

}
