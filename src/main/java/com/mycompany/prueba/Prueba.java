/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author brene
 */
public class Prueba {

    public static void main(String[] args) {
        int cont=0;
  
        while (cont==0){
            String nombre = JOptionPane.showInputDialog(null, "Digite su nombre");
            int edad= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su edad"));
            if (edad<=5){
                JOptionPane.showMessageDialog(null, "Ud es un niño");
                int resul = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanto es 5+5?: /n Si responde bien se lleva una paleta de premio"));
                if (resul==10){
                    JOptionPane.showMessageDialog(null, "Correcto, vaya al final de la fila para agarrar la paleta!!");
                    
                    if (resul<10 && cont<3)
                    cont=cont+1;
                    if (cont==1)
                       JOptionPane.showMessageDialog(null, "Vuelva a intentarlo, le quedan 2 intentos");
                    if (cont==2)
                       JOptionPane.showMessageDialog(null, "Vuelva a intentarlo, le queda 1 intento");
                  
                    else
                       JOptionPane.showMessageDialog(null, "Ya no le quedan intentos, no tiene su paleta");
                            break;   
                }                     
            }
        }
    }
}

