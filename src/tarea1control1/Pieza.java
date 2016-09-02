/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1control1;

/**
 *
 * @author juan pablo
 */
public class Pieza {
    
    private String color;
    private String tipo;
    private Casilla x;
    private Casilla y;

 
    public Pieza(String color, String tipo, Casilla x, Casilla y) {
        this.color = color;
        this.tipo = tipo;
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public Casilla getX() {
        return x;
    }

    public void setX(Casilla x) {
        this.x = x;
    }

    public Casilla getY() {
        return y;
    }

    public void setY(Casilla y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
