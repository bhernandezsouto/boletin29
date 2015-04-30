/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

/**
 *
 * @author Bea
 */
public class Yate extends Barco {
    private float potencia;
    private int nCamarotes;
    private float precioPo;
    private float precioCamarote;

    public Yate(float potencia, int nCamarotes, float precioPo, float precioCamarote, int diasDeOcupacion, float longitud, String matricula, float alquiler) {
        super(diasDeOcupacion, longitud, matricula, alquiler);
        this.potencia = potencia;
        this.nCamarotes = nCamarotes;
        this.precioPo = precioPo;
        this.precioCamarote = precioCamarote;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getnCamarotes() {
        return nCamarotes;
    }

    public void setnCamarotes(int nCamarotes) {
        this.nCamarotes = nCamarotes;
    }

    public float getPrecioPo() {
        return precioPo;
    }

    public void setPrecioPo(float precioPo) {
        this.precioPo = precioPo;
    }

    public float getPrecioCamarote() {
        return precioCamarote;
    }

    public void setPrecioCamarote(float precioCamarote) {
        this.precioCamarote = precioCamarote;
    }

    @Override
    public void modulo() {
        alquiler=(float)(super.alquiler()+(precioPo*potencia)+(nCamarotes*precioCamarote));
    }
    

}
