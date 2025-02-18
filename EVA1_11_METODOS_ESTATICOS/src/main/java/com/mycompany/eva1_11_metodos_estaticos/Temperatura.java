/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_11_metodos_estaticos;

/**
 *
 * @author jesus
 */
public class Temperatura {
    private Temperatura(){
        
    }
    public static double convertirFaC(double Fa){
        double resu;
        resu=(Fa-32)*(5.0/9.0);
        return resu;
    }
    public static double convertirCaF(double c){
        double resu;
        resu= (c*9.0/5.0)+32;
        return resu;
    }
    public static double convertirCaK(double c){
        double resu;
        resu= c+273.15;
        return resu;
    }
    public static double convertirKaC(double k){
        double resu;
        resu= k-273.15;
        return resu;
    }
        public static double convertirFaK(double f){
        double resu;
        resu= (f-32)+273.15;
        return resu;
    }
        public static double convertirKaF(double k){
        double resu;
        resu= 1.8*(k-273.15)+32;
        return resu;
    }

}
