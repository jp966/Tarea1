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
public class TableroAjedrezM {
    private ArrayList<Pieza> piezas;
    private Casilla [][] casillas;

    public TableroAjedrezM(ArrayList<Pieza> piezas, Casilla[][] casillas) {
        this.piezas=new ArrayList<Pieza>();
        this.casillas=new Casilla[8][8];
        
    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Pieza> piezas) {
        this.piezas = piezas;
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }
    
    
    
}
