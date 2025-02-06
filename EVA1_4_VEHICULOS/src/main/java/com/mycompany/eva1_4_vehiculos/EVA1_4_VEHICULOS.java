/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_4_vehiculos;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_4_VEHICULOS {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        vehiculo vehi=new vehiculo();
        System.out.println("Marca del vehiculo: ");
        String cade=cap.nextLine();
        System.out.println("Modelo del vehiculo: ");
        String cade1=cap.nextLine();
        System.out.println("Color del vehiculo: ");
        String cade2=cap.nextLine();
        System.out.println("Año del vehiculo: ");
        int num=cap.nextInt();
        cap.nextLine();
        System.out.println("Precio del vehiculo: ");
        double num1=cap.nextInt();
        cap.nextLine();
        vehi.setModelo(cade1);
        vehi.setMarca(cade);
        vehi.setColor(cade2);
        vehi.setYear(num);
        vehi.setPrecio(num1);
        vehi.imprimirDatos();
        //System.out.println("Modelo: "+ vehi.getModelo());
        //System.out.println("Marca: "+ vehi.getMarca());
        //System.out.println("Color: "+ vehi.getColor());
        //System.out.println("Año: "+ vehi.getYear());
        //System.out.println("Precio: "+ vehi.getPrecio());
    }
}
