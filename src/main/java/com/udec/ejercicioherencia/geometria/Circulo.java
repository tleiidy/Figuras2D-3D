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
public class Circulo extends Figura2D{

    Scanner teclado = new Scanner(System.in);
    
    private double pi;
    protected double radio;
    private static final double PI = 3.14159;

    /**
     * Constructor que inicializa las variables constantes
     */
    public Circulo(){
        super();
        this.radio = radio;
        this.pi = PI;
    }
    
    /**
     * Constructor que inicializa las variable de la clase padre
     * @param punto1
     * @param punto2 
     */
    public Circulo(Ejes punto1, Ejes punto2) {
        super(punto1, punto2);
    }

    /**
     * Metodo que pide las coordenadas del circulo
     */
    public void iniciaCirculo(){
        System.out.print("Digite lado x1 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y1 : ");
        y = teclado.nextDouble();
        Ejes punto1 = new Ejes (x,y);
        System.out.print("Digite lado x2 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y2 : ");
        y = teclado.nextDouble();
        Ejes punto2 = new Ejes(x,y);
        Circulo circulo = new Circulo(punto1, punto2);
        circulo.imprimirResultados();
    }

    /**
     * Metodo que imprime los resultados del circulo (radio, perimetro, area)
     */
    @Override
    public void imprimirResultados(){
        
        System.out.println("Radio : "+radio());
        System.out.println("Perimetro : "+perimetro());
        System.out.println("Area : "+area());
    }
    
    /**
     * Metodo que calcula y retorna el radio
     * @return 
     */
    private double radio(){
        double auxiliarX=Math.pow((punto1.getX()-punto2.getX()), 2);
        double auxiliarY=Math.pow((punto1.getY()-punto2.getY()), 2);
        radio = Math.sqrt( auxiliarX + auxiliarY );
        return radio;
    }
 
    /**
     * Metodo que calcula y retorna el perimetro
     * @return 
     */
    private double perimetro(){
        double perimetro = 2* (PI * this.radio);
        return perimetro;
    }
    /**
     *  Metodo que calcula y retorna el area
     * @return 
     */
    private double area(){
        double area = PI * Math.pow(this.radio,2);
        return area;
    }   
    
    
    
}
