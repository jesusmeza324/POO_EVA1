/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APA;

/**
 *
 * @author jesus
 */
public class Libro {
    private String Autor;
    private String titulo;
    private int year;
    private String ciudad;
    private String editorial;
    
     public String getAutor(){//lectura
        return Autor;
    }
    public void setAutor(String valor){//escritura
        Autor=valor;
    }
    public String getTitulo(){//lectura
        return titulo;
    }
    public void setTitulo(String valor){//escritura
        titulo=valor;
    }
    public int getYear(){//lectura
        return year;
    }
    public void setYear(int valor){//escritura
        year=valor;
    }

    public String getCiudad(){//lectura
        return ciudad;
    }
    public void setCiudad(String valor){//escritura
        ciudad=valor;
    }
    public String getEditorial(){//lectura
        return editorial;
    }
    public void setEditorial(String valor){//escritura
        editorial=valor;
    }
    public void imprimirReferencia(){
        System.out.println("REFERENCIAS");
        System.out.println(Autor+"."+"("+year+")."+ciudad+":"+editorial);
    }
         
    
}
