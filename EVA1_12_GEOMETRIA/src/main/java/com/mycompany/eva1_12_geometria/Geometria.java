/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_12_geometria;

/**
 *
 * @author jesus
 */
public class Geometria {
    private Geometria(){
        
    }
    public static double calcularAreaCuadrado(double lado){
        return lado*lado;
        }
    public static double calcularPerimetroCuadrado(double lado){
        return lado*4;
    }
    public static double calcularAreaRectangulo(double base, double altura){
        return base*altura;
    }
    public static double calcularPerimetroRectangulo(double base, double altura){
        return (base+altura)*2;
    }
    public static double calcularAreaTriangulo(double base, double altura){
        return (base+altura)/2;
    }
    public static double calcularPerimetroTriangulo(double lado){
        return lado*3;
    }
}
