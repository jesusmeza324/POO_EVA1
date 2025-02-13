/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_constructores;

/**
 *
 * @author jesus
 */
public class EVA1_8_CONSTRUCTORES {
   
    public static void main(String[] args) {
      //metodos sirve para incializar crear objetos se llamna igual que la clase
      //no devuelven valores una clase puede tene"n" constructores
      vehiculo carro=new vehiculo("FORD","MUSTANG","ROJO",1340,1970);
      //carro.setMarca("algo");
      //carro.setModelo("algo");
      //carro.setColor("algo");
      //carro.setPrecio(2000);
      //carro.setYear(1000);
      carro.imprimirDatos();
    }
}
