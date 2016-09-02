/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1control1;

import java.util.ArrayList;

/**
 *
 * @author juan pablo
 */
public class TableroAjedrezP {
    private ArrayList<Pieza> piezas;
    

    public TableroAjedrezP(ArrayList<Pieza> piezas) {
        this.piezas = piezas;

    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Pieza> piezas) {
        this.piezas = piezas;
    }

   
    
    
}
