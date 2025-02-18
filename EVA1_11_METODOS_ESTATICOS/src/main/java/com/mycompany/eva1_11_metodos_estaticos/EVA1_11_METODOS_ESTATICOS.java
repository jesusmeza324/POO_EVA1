/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_metodos_estaticos;

/**
 *
 * @author jesus
 */
public class EVA1_11_METODOS_ESTATICOS {

    public static void main(String[] args) {
        //GENERAR UN NUMERO ALEATORIO:
        double valor = Math.random();//--metodo estatico--se pueden usar
        //sin crear instancias de la clase
        //Math mate= new Math();
        //static-- se crea junto con el programa (existe al iniciar el programa)
        //sirve para crear utilerias
        System.out.println(valor);
        int numero = (int)(valor*100);
        System.out.println(numero);
        Persona perso=new Persona();
        perso.mostrarMensaje();
        //System.out.println(5/9.0);
        //Temperatura tempe=new Temperatura();
        //System.out.println(tempe.convertirFaC(100));
        System.out.println(Temperatura.convertirFaC(100));
        System.out.println(Temperatura.convertirCaF(100));
        System.out.println(Temperatura.convertirCaK(100));
        System.out.println(Temperatura.convertirKaC(100));
        System.out.println(Temperatura.convertirFaK(100));
        System.out.println(Temperatura.convertirKaF(100));
        
    }
}
class Persona{
    int valor;
    public void mostrarMensaje(){
        System.out.println("Hola Mundo");
}
}
