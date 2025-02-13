/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_tv_constructores;

/**
 *
 * @author jesus
 */
public class EVA1_9_TV_CONSTRUCTORES {

    public static void main(String[] args) {
        Television tv=new Television();
        tv.imprimirDatos();
        Television tv2=new Television(true,50,50);
        tv2.imprimirDatos();
    }
}
