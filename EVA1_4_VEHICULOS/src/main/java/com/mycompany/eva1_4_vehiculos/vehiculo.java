/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_4_vehiculos;

/**
 *
 * @author jesus
 */
public class vehiculo {
    //atributos-privados
    //constructores - metodos especiales
  
    private String marca;
    private String modelo;
    private String color;
    private int year;
    private double precio;
      //metodos get y set
    public String getMarca(){
    return marca;
}
    public void setMarca(String valor){
        marca=valor;
    }
    public String getModelo(){
    return modelo;
}
    public void setModelo(String valor){
        modelo=valor;
    }
    public String getColor(){
    return color;
}
    public void setColor(String valor){
        color=valor;
    }
    public int getYear(){
    return year;
}
    public void setYear(int valor){
        year=valor;
    }
    public double getPrecio(){
    return precio;
}
    public void setPrecio(double valor){
        precio=valor;
    }
    public void imprimirDatos(){
        System.out.println("Datos del vehiculo");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+year);
        System.out.println("Color: "+color);
        System.out.println("precio: "+precio);
    }
}
