/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin29 {

    static ArrayList<Barco> barcos = new ArrayList<>();

    public static void main(String[] args) {
        int num;
        do {
            num = JOptionPane.showOptionDialog(null, "Seleccione opcion", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Añadir Barco", "Mostrar Factura de un Barco", "Mostrar todos los barcos", "Salir"}, null);
            switch (num) {
                case 0:
                    int opc = JOptionPane.showOptionDialog(null, "Seleccione Barco", "Menu",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Velero", "Deportivo", "Yate"}, null);
                    switch (opc) {
                        case 0:
                            Velero objV = new Velero(Integer.parseInt(JOptionPane.showInputDialog("Introduzca Numero de Mastiles:")),
                                    Float.parseFloat(JOptionPane.showInputDialog("Precio Mastil:")),
                                    Integer.parseInt(JOptionPane.showInputDialog("Introduzca Dias de Ocupacion:")),
                                    Float.parseFloat(JOptionPane.showInputDialog("Introduzca Longitud:")),
                                    JOptionPane.showInputDialog("Introduzca Matricula"),
                                    0);
                            objV.modulo();
                            barcos.add(objV);
                            break;
                        case 1:
                            Deportivo objD = new Deportivo(Float.parseFloat(JOptionPane.showInputDialog("Introduzca la potencia del barco:")),
                                    Float.parseFloat(JOptionPane.showInputDialog("Precio Potencia:")),
                                    Integer.parseInt(JOptionPane.showInputDialog("Introduzca Dias de Ocupacion:")),
                                    Float.parseFloat(JOptionPane.showInputDialog("Introduzca Longitud:")),
                                    JOptionPane.showInputDialog("Introduzca Matricula"),
                                    0);
                            objD.modulo();
                            barcos.add(objD);
                            break;
                        case 2:
                            Yate objY = new Yate(Float.parseFloat(JOptionPane.showInputDialog("Introduzca la potencia del barco:")),
                                    Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de camarotes:")),
                                    Float.parseFloat(JOptionPane.showInputDialog("Precio Potencia:")),
                                    Float.parseFloat(JOptionPane.showInputDialog("Precio Camarote:")),
                                    Integer.parseInt(JOptionPane.showInputDialog("Introduzca Dias de Ocupacion:")),
                                    Float.parseFloat(JOptionPane.showInputDialog("Introduzca Longitud:")),
                                    JOptionPane.showInputDialog("Introduzca Matricula"),
                                    0);
                            objY.modulo();
                            barcos.add(objY);
                            break;
                    }
                    break;
                case 1:
                    if (!barcos.isEmpty()) {
                        for (int i = 0; i < barcos.size(); i++) {
                            Barco imp = barcos.get(i);
                            imp.factura();
                        }

                    }
            }
        } while (num != 3);
    }

}
