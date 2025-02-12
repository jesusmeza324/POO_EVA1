/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas;

/**
 *
 * @author jesus
 */
public class Clientas {
    private String nombre;
    private String apellido;
    private String rfc;
    private int persona;
    private int edad;
    private int telefono;
        public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre=valor;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String valor){
        apellido=valor;
    }
    public String getRFC(){
        return rfc;
    }
    public void setRFC(String valor){
        rfc=valor;
    }
    public int getPersona(){
        return persona;
    }
    public void setPersona(int valor){
    persona=valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad=valor;
    }
        public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int valor){
        telefono=valor;
    }
    public void imprimirDatos(){
        System.out.println("Para escoger tipo de persona cosidere:");
        System.out.println("Fisica-->1");
        System.out.println("Moral-->2");
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellido:"+apellido);
        System.out.println("RFC:"+rfc);
        if(persona==1){
            System.out.println("Persona: Fisica");
            }
        if(persona==2){
            System.out.println("Persona: Moral");
            }
        System.out.println("Edad:"+edad);
        System.out.println("Telefono:"+telefono);
    }
}
