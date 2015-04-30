/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import javax.swing.JOptionPane;

/**
    public Barco(int diasDeOcupacion, float longitud, String ma
 *
 * @author Bea
 */
public abstract class Barco implements IBarcos {
       public int diasDeOcupacion;
       public float longitud;
       public String matricula;
       public float alquiler;

    public Barco(int diasDeOcupacion, float longitud, String matricula, float alquiler) {
        this.diasDeOcupacion = diasDeOcupacion;
        this.longitud = longitud;
        this.matricula = matricula;
        this.alquiler = alquiler;
    }      
    public float alquiler(){
        alquiler=(float)(10*longitud);
        return alquiler;
    } 
    public void factura (){
        JOptionPane.showMessageDialog(null, "***FACTURA***\n"
                + "Alquiler: " + alquiler + "\n"
                + "Longitud: " + longitud + "\n"
                + "Matricula: " + matricula + "\n"
                + "***FIN FACTURA***");
    }
}
