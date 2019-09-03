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
public class Piramide extends Figura3D implements Regla{
    
Scanner teclado = new Scanner(System.in);
    /**
     * Constructor que inicializa las variables del padre
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Piramide(Ejes punto1, Ejes punto2, Ejes punto3) {
        super(punto1, punto2, punto3);
    }

    /**
     * Constructor vacio
     */
    public Piramide(){
        super();
    }
    /**
     * Metodo que pide las coordenadas de una piramide
     */
    public void iniciaPiramide(){
        System.out.print("Digite lado x1 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y1 : ");
        y = teclado.nextDouble();
        System.out.print("Digite lado z1 : ");
        z = teclado.nextDouble();
        Ejes punto1 = new Ejes(x, y, z);
        System.out.print("Digite lado x2 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y2 : ");
        y = teclado.nextDouble();
        System.out.print("Digite lado z2 : ");
        z = teclado.nextDouble();
        Ejes punto2 = new Ejes(x, y, z);
        System.out.print("Digite lado x3 : ");
        x = teclado.nextDouble();
        System.out.print("Digite lado y3 : ");
        y = teclado.nextDouble();
        System.out.print("Digite lado z3 : ");
        z = teclado.nextDouble();
        Ejes punto3 = new Ejes(x, y, z);
        Piramide piramide = new Piramide(punto1, punto2, punto3);
        piramide.imprimirResultados();
    }
    /**
     * Metodoq ue imprime los resultados de una piramide(lados, area, volumen)
     */
    @Override
    public void imprimirResultados() {
        System.out.println("Lado1: " + lado1Piramide());
        System.out.println("Lado2: " + lado2Piramide());
        System.out.println("Lado3: " + lado3Piramide());
        System.out.println("Área: " + areaTotalPiramide());
        System.out.println("Volumen: " + volumenPiramide());
    }
    
    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double lado1Piramide(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double lado2Piramide(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CA
     * @return 
     */
    private double lado3Piramide(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /** 
     * Metodo que calcula y retorna el area total de la piramide
     * @return 
     */
    private double areaTotalPiramide (){
        double altura = Math.pow(lado3Piramide(),2) - (lado2Piramide() / 2);
        double perimetro = lado1Piramide() + lado2Piramide() + lado3Piramide();
        double areaLateral = ((perimetro * altura) / 2);
        double areaBase = ( lado2Piramide() * altura ) / 2;
        double areaTotal = areaLateral + areaBase ;
        return areaTotal;
    }
    /**
     * Metodo que calcula y retorna el valor del volumen
     */
    public double volumenPiramide(){
        double altura = Math.pow(lado3Piramide(),2) - (lado2Piramide() / 2);
        double areaBase = ( lado2Piramide() * altura ) / 2;
        double alturaPiramide = Math.sqrt(altura);
        double volumenPiramide = (areaBase * alturaPiramide) / 3;
        return volumenPiramide;
    }
    
    
}
