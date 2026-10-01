/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int empleados;
        double salario;
        double SEM;
        double IVM;
        double rebajaTotal;

        empleados = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad de empleados:")
        );

        salario = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el salario:")
        );

        SEM = salario * 9.25 / 100;
        IVM = salario * 5.08 / 100;

        rebajaTotal = SEM + IVM;

        JOptionPane.showMessageDialog(null,
                "SEM: " + SEM
                + "\nIVM: " + IVM
                + "\nRebaja total: " + rebajaTotal); 
        
    }
    
}
