/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_1_clases_objetos;

/**
 *
 * @author jesus
 */
public class EVA1_1_CLASES_OBJETOS {

    public static void main(String[] args) {
        //INSTANCIAR--> ASIGNAR MEMORIA AL CODIGO DE UNA CLASE
        //PARA CREAR UN OBJETO
        //CREAR UN IDENTIFICADOR (VARIABLE)
        Persona persol;//declaramos pero no creamos
        //asignar memoria --> new
        //referencia: direccion en memoria 
        persol = new Persona();
        persol.edad = 50;
        persol.genero = "H";
        persol.nombre = "juan perez";
        //persol.imprimirDatos();
        System.out.println(persol);
    }
    
}
class Persona{//TIPO DE DATO ABSTRACTO
    //DATOS - ESTADO - ATRIBUTOS
    String nombre;
    int edad;
    String genero;
    //COMPORTAMIENTO - METODOS 
    void imprimirDatos(){
        System.out.println("Nombre="+nombre);
        System.out.println("Edad="+ edad);
        System.out.println("Genero="+ genero);
    }
    
}
