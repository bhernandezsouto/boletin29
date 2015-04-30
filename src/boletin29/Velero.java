/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import javax.swing.JOptionPane;

public class Velero extends Barco{
    private int nMastiles;
    private float precioMastil;

    public Velero(int nMastiles,float precioMastil, int diasDeOcupacion, float longitud, String matricula, float alquiler) {
        super(diasDeOcupacion, longitud, matricula, alquiler);
        this.nMastiles = nMastiles;
        this.precioMastil=precioMastil;
    }

    public int getnMastiles() {
        return nMastiles;
    }

    public void setnMastiles(int nMastiles) {
        this.nMastiles = nMastiles;
    }

    public float getPrecioMastil() {
        return precioMastil;
    }

    public void setPrecioMastil(float precioMastil) {
        this.precioMastil = precioMastil;
    }

    @Override
    public void modulo() {
       alquiler=(float) (super.alquiler()+(precioMastil*nMastiles));
    }
    @Override
      public void factura (){
        JOptionPane.showMessageDialog(null, "***FACTURA***\n"
                + "Velero\n"
                + "Alquiler: " + alquiler + "\n"
                + "Longitud: " + longitud + "\n"
                + "Matricula: " + matricula + "\n"
                + "Numero De Mastiles: " + nMastiles + "\n" 
                + "***FIN FACTURA***");
    }
    
    
}
