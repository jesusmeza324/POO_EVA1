/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_sobrecarga_metodos;

/**
 *
 * @author jesus
 */
public class EVA1_13_SOBRECARGA_METODOS {

 
    public static void main(String[] args) {
        System.out.println("hola mundo");
        System.out.println(100);
        System.out.println(5<4);
        System.out.println('c');
        System.out.println(new EVA1_13_SOBRECARGA_METODOS() );
        mostrarMensaje();
        mostrarMensaje("hola");
    }
    //header--encabezado------------------|
    //                  FIRMA
    //                  nombre+parametro
    public static void mostrarMensaje(){
    System.out.println("hola mundo");
}
    public static void mostrarMensaje(String mensaje){
    System.out.println(mensaje);
}
}


