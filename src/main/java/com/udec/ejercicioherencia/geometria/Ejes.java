/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejercicioherencia.geometria;

/**
 *
 * @author Leidy Torres
 */
public class Ejes {
    
    private double x;
    private double y;
    private double z;

    /**
     * Constructor que inicializa las variables
     * @param x
     * @param y
     * @param z 
     */
    public Ejes(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Constructor que inicialliza las variables
     * @param x
     * @param y 
     */
    public Ejes(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Retorna el valor del eje X 
     * @return 
     */
    public double getX() {
        return x;
    }

    /**
     * Modifica el valor del eje X
     * @param x 
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Retorna el valor del eje Y
     * @return 
     */
    public double getY() {
        return y;
    }

    /**
     * Modifica el valor del eje Y
     * @param y 
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Retorna el valor del eje Z
     * @return 
     */
    public double getZ() {
        return z;
    }

    /**
     * Modifica el valor del eje Z
     * @param z 
     */
    public void setZ(double z) {
        this.z = z;
    }
    
    
}
