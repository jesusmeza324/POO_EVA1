/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_ventas;

import java.util.Scanner;
import ventas.Clientas;
import ventas.Productos;

/**
 *
 * @author jesus
 */
public class EVA1_7_VENTAS {

    public static void main(String[] args) {
      Productos produ=new Productos();
      Clientas clie=new Clientas();
      Scanner cap = new Scanner(System.in);
        System.out.println("Nombre:");
        produ.setNombre(cap.nextLine());
        System.out.println("Marca:");
        produ.setMarca(cap.nextLine());
        System.out.println("Precio:");
        produ.setPrecio(cap.nextDouble());
        cap.nextLine();
        System.out.println("Clave:");
        produ.setClave(cap.nextInt());
        cap.nextLine();
        System.out.println("inventario:");
        produ.setInventario(cap.nextInt());
        cap.nextLine();
        produ.imprimirDatos();
        
        System.out.println("Datos del cliente:");
        System.out.println("Nombre:");
        clie.setNombre(cap.nextLine());
        System.out.println("Apellido:");
        clie.setApellido(cap.nextLine());
        System.out.println("RFC:");
        clie.setRFC(cap.nextLine());
        System.out.println("Persona:");
        clie.setPersona(cap.nextInt());
        cap.nextLine();
        System.out.println("Edad:");
        clie.setEdad(cap.nextInt());
        cap.nextLine();
        System.out.println("Telefono:");
        clie.setTelefono(cap.nextInt());
        cap.nextLine();
        clie.imprimirDatos();
      
    }
}
