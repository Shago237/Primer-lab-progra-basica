/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primera.monda.java;

import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class PrimeraMondaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String nombre ="";
   int peso=0;
   String variableTemporal="";
   
    nombre=JOptionPane.showInputDialog("dime tu nombre");
    JOptionPane.showMessageDialog(null,"este es tu nombre"+nombre);
    
    variableTemporal=JOptionPane.showInputDialog(" dime tu peso");
    peso=Integer.parseInt(variableTemporal);
    peso=peso-5;
    JOptionPane.showMessageDialog(null," mi peso es"+peso);
    
    
    
            
   
    }
   
   
}
