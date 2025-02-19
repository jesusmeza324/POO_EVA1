/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_suma_sobrecarga;

/**
 *
 * @author jesus
 */
public class EVA1_14_SUMA_SOBRECARGA {

    public static void main(String[] args) {
    suma(1,2);
    suma("hola ","mundo");
    suma(5.9,7.8);
    suma();
    suma(true,false);
    }
    public static void suma(int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void suma(String num1,String num2){
         System.out.println(num1+num2);
    }
    public static void suma(double num1,double num2){
        System.out.println(num1+num2);
    }
    public static void suma(){
        System.out.println("algo");
    }
    public static void suma(boolean num1, boolean num2){
        System.out.println(num1&&num2);
    }
}
