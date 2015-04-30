/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import javax.swing.JOptionPane;

/**
 *
 * @author Bea
 */
public class Deportivo extends Barco {
    private float potencia;
    private float precioPo;

    public Deportivo(float potencia, float precioPo, int diasDeOcupacion, float longitud, String matricula, float alquiler) {
        super(diasDeOcupacion, longitud, matricula, alquiler);
        this.potencia = potencia;
        this.precioPo = precioPo;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getPrecioPo() {
        return precioPo;
    }

    public void setPrecioPo(float precioPo) {
        this.precioPo = precioPo;
    }

    @Override
    public void modulo() {
        alquiler=(float)(super.alquiler()+(precioPo*potencia));
    }
    @Override
      public void factura (){
        JOptionPane.showMessageDialog(null, "***FACTURA***\n"
                + "Deportivo\n"
                + "Alquiler: " + alquiler + "\n"
                + "Longitud: " + longitud + "\n"
                + "Matricula: " + matricula + "\n"
                + "Potencia: " + potencia + "\n" 
                + "***FIN FACTURA***");
    }
}
