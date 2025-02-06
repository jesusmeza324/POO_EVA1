/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_3_modificadores;

/**
 *
 * @author jesus
 */
public class persona {
    //atributos 
    private String nombre;
    private String apellido;
    private String curp;
    private String genero;
    private int edad;
    //constructores (metodos)
    //metodos (comportamiento)
    //get y set 
    public String getNombre(){//lectura
        return nombre;
    }
    public void setNombre(String valor){//escritura
        nombre=valor;
    }
    public String getApellidos(){//lectura
        return apellido;
    }
    public void setApellidos(String valor){//escritura
        apellido=valor;
    }
    public String getCurp(){//lectura
        return curp;
    }
    public void setCurp(String valor){//escritura
        curp=valor;
    }
    public String getGenero(){//lectura
        return genero;
    }
    public void setGenero(String valor){//escritura
        genero=valor;
    } 
     public int getEdad(){//lectura
        return edad;
    }
    public void setEdad(int valor){//escritura
        edad=valor;
    }
}
