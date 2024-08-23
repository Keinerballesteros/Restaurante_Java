
package com.mycompany.restaurante;

import javax.swing.JOptionPane;


public class Menú {
    
    String platos[]; 
    int datos[][];
    String dias[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
    
    public void crearMenu(int cantidad){
        platos = new String[cantidad];
        
        int i = 0;
        
        while(i<cantidad){
            platos[i] = JOptionPane.showInputDialog("Ingrese el nombre del plato "+ (i+1) +":");
            i++;
        }
    }
    
    public void consultarMenu(){
        
        String plato = "";
        for (String plato1 : platos) {
            plato += plato1 + ",";
            plato += "\n";
        }
        JOptionPane.showMessageDialog(null, "Platos :" +plato);
    }
    
    public void ingresarDatos(){
        datos = new int[6][platos.length];
        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < platos.length; c++) {
                datos[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Ventas para el dia "+dias[f]+" de "+platos[c])+": ");
            }
        }
    }
}
