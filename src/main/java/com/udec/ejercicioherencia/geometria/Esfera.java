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
public class Esfera extends Figura3D{
    
    Scanner teclado = new Scanner(System.in);
    
    private double pi;
    protected double radio;
    private static final double PI = 3.14159;

    /**
     * Constructor que inicializa las variables constantes
     */
    public Esfera(){
        super();
        this.radio = radio;
        this.pi = PI;
    }
    
    /**
     * Constructor que inicializa las variables del padre y la hija
     */
    public Esfera(Ejes punto1, Ejes punto2, Ejes punto3) {
        super(punto1, punto2, punto3);
    }

    /**
     * Metodo que pide las coordenada de una esfera 
     */
    public void iniciaEsfera(){
        System.out.print("Digite lado x1 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y1 : ");
        y = teclado.nextDouble();
        System.out.println("Digite lado z1");
        z = teclado.nextDouble();
        Ejes punto1 = new Ejes (x, y, z);
        System.out.print("Digite lado x2 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y2 : ");
        y = teclado.nextDouble();
        System.out.println("Digite lado z2");
        z = teclado.nextDouble();
        Ejes punto2 = new Ejes(x, y, z);
        System.out.print("Digite lado x3 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y3 : ");
        y = teclado.nextDouble();
        System.out.println("Digite lado z3");
        z = teclado.nextDouble();
        Ejes punto3 = new Ejes(x, y, z);
        Esfera esfera = new Esfera (punto1, punto2, punto3);
        esfera.imprimirResultados();
    }
    /**
     * Metodoq ue imprime los resultados de una esfera (radio, area, volumen)
     */
    @Override
    public void imprimirResultados() {
        System.out.println("Radio : "+radioEsfera());
        System.out.println("Área : "+areaEsfera());
        System.out.println("Volumen : "+volumenEsfera());
    }
    /**
     * Calcula y retorna el valor del radio
     * @return 
     */
    private double radioEsfera(){
        double auxiliarX = Math.pow((punto1.getX()-punto2.getX()), 2);
        double auxiliarY = Math.pow((punto1.getY()-punto2.getY()), 2);
        double auxiliarZ = Math.pow((punto3.getZ()-punto3.getZ()), 2);
        radio = Math.sqrt( auxiliarX + auxiliarY + auxiliarZ);
        return radio;
    }
    /**
     * Calcula y retorna el valor del area
     * @return 
     */
    private double areaEsfera(){
        double area = 4 *(PI * Math.pow(this.radio,2));
        return area;
    }
    /**
     * Calcula y retorna el volumen
     * @return 
     */
    private double volumenEsfera(){
        double volumen = 4/3 *(PI* Math.pow(this.radio, 3));
        return volumen;
    }
}
