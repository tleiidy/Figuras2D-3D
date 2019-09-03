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
public class Inicio {
    
    private double x, y, z;
    private Scanner teclado;
    Figura2D figura2D;
    Figura3D figura3D;
    Regla figuras [] = new Regla [1];
    Regla figura;  
    
    public Inicio(){
        teclado = new Scanner(System.in);
        menu();
    }
    
    private void menu(){
        int contador = 0;
        String respuesta;
        do{
            System.out.println("---BIENVENIDO---");
            System.out.println("ESCOJA UNA OPCION");
            System.out.println("1.Figuras 2D");
            System.out.println("2.Figuras 3D");
            System.out.println("3.Salir");
            int opcion =  teclado.nextInt();
            switch (opcion){
                case 1: 
                    figura2D();
                break;
                case 2:
                    figura3D();
                break;
            }
            System.out.print("Desea ingresar otra figura? (si/no):");
            respuesta = teclado.nextLine();
        }while (respuesta.equals("si"));
    }
        
    
    
    private void figura2D(){
        String respuesta1;
        do{
            System.out.println("---FIGURAS 2D---");
            System.out.println("ESCOJA UNA OPCION");
            System.out.println("1.Cuadrado/Rectangulo");
            System.out.println("2.Circulo");
            System.out.println("3.Triangulo");
            System.out.println("4.Salir");
            int opcion =  teclado.nextInt();
            switch (opcion){
                case 1: 
                    figura = new Cuadrado();
                    evaluaFiguras2D();
                break;
                case 2:
                    figura = new Circulo();
                    evaluaFiguras2D();
                break;
                case 3:
                    figura = new Triangulo();
                    evaluaFiguras2D();
                break;
            } 
            System.out.print("Desea ingresar otra figura? (si/no):");
            respuesta1 = teclado.nextLine();
        }while(respuesta1.equals("si"));
    }
    
    private void figura3D(){
        String respuesta2;
        do{
            System.out.println("---FIGURAS 3D---");
            System.out.println("ESCOJA UNA OPCION");
            System.out.println("1.Cubo");
            System.out.println("2.Esfera");
            System.out.println("3.Piramide");
            System.out.println("4.Salir");
            int opcion =  teclado.nextInt();
            switch (opcion){
                case 1: 
                       figura = new Cubo();
                       evaluaFiguras3D();
                break;
                case 2:
                       figura = new Esfera();
                       evaluaFiguras3D();
                break;
                case 3:
                       figura = new Piramide();
                       evaluaFiguras3D();
                break;
            }System.out.print("Desea ingresar otra figura? (si/no):");
            respuesta2 = teclado.nextLine();
        }while(respuesta2.equals("si"));
    }
    
    private void evaluaFiguras2D(){ 
        
        for (int i = 0; i < figuras.length; i ++) {
            if (figura instanceof Circulo){
                ((Circulo) figura).iniciaCirculo();
            }else if ( figura instanceof Cuadrado){
                ((Cuadrado) figura).iniciaCuadrado();
            }else {
                ((Triangulo) figura).iniciaTriangulo();
            }
        }
    } 
    
    private void evaluaFiguras3D(){
        
        for (int i = 0; i < figuras.length; i++) {
            if (figura instanceof Cubo){
                ((Cubo) figura).iniciaCubo();
            }else if ( figura instanceof Esfera){
                ((Esfera) figura).iniciaEsfera();
            }else {
                ((Piramide) figura).iniciaPiramide();
            }
        }
    }

    
 

}

