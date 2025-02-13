/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_9_tv_constructores;

/**
 *
 * @author jesus
 */
public class Television {
    private boolean encendida;
    private int volumen;
    private int canal;
    
    public Television(){
    encendida=false;
    volumen=10;
    canal=3;
}
  public Television(boolean enc,int vol,int can){
    encendida=enc;
    volumen=vol;
    canal=can;
  }  
    public void botonPower(){
        if(encendida==true)
            encendida = false;
        else
            encendida = true;
    }
    public void imprimirDatos(){
        if(encendida== true){
            System.out.println("prendida");
            System.out.println("volumen es:"+volumen);
            System.out.println("El canal es: "+ canal);
            

        }
        else{
            System.out.println("apagada");
            System.out.println("volumen es:"+volumen);
            System.out.println("El canal es: "+ canal);
        }
        
    }
    public void bajarVolumen(){
          if(volumen>=5&&encendida==true){
           volumen -=5;
        }
       
}
       public void subirVolumen(){
        if(volumen<=95&&encendida==true){
            volumen +=5;
        }
}
         public void subirCanal(){
        if(encendida==true){
            if(canal==10)
                canal=0;
            else
                canal+=1;
        }
           
        
        }
         public void bajarCanal(){
        if(encendida==true){
            if(canal==0)
                canal=10;
            else
                canal-=1;
        }
        }
         public void setCanal(int valor){
             if(encendida==true)
             canal=valor;
         }

}
