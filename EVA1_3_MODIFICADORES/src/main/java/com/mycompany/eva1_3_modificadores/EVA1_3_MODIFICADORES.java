/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_3_modificadores;

/**
 *
 * @author jesus
 */
public class EVA1_3_MODIFICADORES {

    public static void main(String[] args) {
        
        persona perso=new persona();
        perso.setNombre("jesus David");
        System.out.println("Nombre:"+ perso.getNombre());
        perso.setApellidos("Meza Tapia");
        System.out.println("Apellidos:"+perso.getApellidos());
        perso.setCurp("METJ060407HCHZPSA3");
        System.out.println("Curp:"+perso.getCurp());
        perso.setGenero("Masculino");
        System.out.println("Genero:"+perso.getGenero());
        perso.setEdad(18);
        System.out.println("Edad:"+perso.getEdad());
        
    }
}
