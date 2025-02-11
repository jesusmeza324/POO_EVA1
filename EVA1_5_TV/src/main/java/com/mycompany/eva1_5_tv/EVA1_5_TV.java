/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_tv;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_5_TV {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
      Television Tvobj=new Television();
      Tvobj.imprimirDatos();
      Tvobj.botonPower();
      Tvobj.bajarCanal();
      Tvobj.imprimirDatos();
      Tvobj.subirCanal();
      Tvobj.imprimirDatos();
      Tvobj.setCanal(cap.nextInt());
      Tvobj.imprimirDatos();
      Tvobj.subirCanal();
      Tvobj.imprimirDatos();
      Tvobj.bajarCanal();
      Tvobj.bajarCanal();
      Tvobj.imprimirDatos();
    }
}
