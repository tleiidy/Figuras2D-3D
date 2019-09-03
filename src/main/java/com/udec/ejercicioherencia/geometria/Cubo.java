/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejercicioherencia.geometria;

import java.util.Scanner;

/**
 *
 * @author Leidy Torres
 */
public class Cubo extends Figura3D{
    
    Scanner teclado = new Scanner(System.in);
    Ejes punto4;

    public Cubo(){
        super();
        this.punto4 = punto4;
    }
    /**
     * Metodo que inicializa las variables del padre y la hija
     * @param punto1
     * @param punto2
     * @param punto3
     * @param punto4 
     */
    public Cubo(Ejes punto1, Ejes punto2, Ejes punto3, Ejes punto4) {
        super(punto1, punto2, punto3);
        this.punto4 = punto4;
    }
    /**
     * Metodo que pide las coordenadas del cubo
     */
    public void iniciaCubo(){
        System.out.print("Digite lado x1 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y1 : ");
        y = teclado.nextDouble();
        System.out.println("Digite lado z1 :");
        z = teclado.nextDouble();
        Ejes punto1 = new Ejes(x, y, z);
        System.out.print("Digite lado x2 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y2 : ");
        y = teclado.nextDouble();
        System.out.println("Digite lado z2: ");
        z = teclado.nextDouble();
        Ejes punto2 = new Ejes(x, y, z);
        System.out.print("Digite lado x3 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y3 : ");
        y = teclado.nextDouble();
        System.out.println("Digite lado z3: ");
        z = teclado.nextDouble();
        Ejes punto3 = new Ejes(x, y, z);
        System.out.print("Digite lado x4 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y4 : ");
        y = teclado.nextDouble();
        System.out.println("Digite lado z4: ");
        z = teclado.nextDouble();
        Ejes punto4 = new Ejes(x, y, z);
        Cubo cubo = new Cubo(punto1, punto2, punto3, punto4);
        cubo.imprimirResultados();
    }

    /**
     * Metodo que imprime los resultados del Cubo ( area, volumen)
     */
    @Override
    public void imprimirResultados() {
        System.out.println("Area : "+areaCubo());
        System.out.println("Volumen : "+volumenCubo());
    }
    
    
    /**
     * Metodo que retorna la longitud del lado  AB
     * @return 
     */
    private double lado1Cubo(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
     /**
     * Metodo que retorna la longitud del lado BC
     * @return 
     */
    private double lado2Cubo(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }

    /**
     * Metodo que retorna la longitud del lado CA
     * @return 
     */
    private double lado3Cubo(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
   /**
    * Metodo que retorna la longitud del lado DA
    * @return 
    */
    private double lado4Cubo(){
        double auxiliarX = Math.pow(punto3.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto4.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Metodo que calcula y retorna el area
     * @return 
     */
    private double areaCubo(){
        double area = 6 * Math.pow(lado2Cubo(), 2);
        return area;
    }
    /**
     * Metodo que calcula y retorna el volumen
     * @return 
     */
    private double volumenCubo(){
        double volumen = Math.pow(lado2Cubo(), 3);
        return volumen;
    }

    /**
     * Retorna el valor del punto 4 en los ejes X & Y
     * @return 
     */
    public Ejes getPunto4() {
        return punto4;
    }

    /**
     * Modifica el valor del punto 4 en los ejes X & Y
     * @param punto4 
     */
    public void setPunto4(Ejes punto4) {
        this.punto4 = punto4;
    }
    
}
