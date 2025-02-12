/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APA;

/**
 *
 * @author jesus
 */
public class SitioWeb {
        private String autor;
    private String nombrepag;
    private String nombresit;
    private int year;
    private String mes;
    private int dia;
    private String url;
     public String getAutor(){
        return autor;
    }
    public void setAutor(String valor){
        autor=valor;
    }
    public String getPagina(){
        return nombrepag;
    }
    public void setPagina(String valor){
        nombrepag=valor;
    }
    public String getSitioWeb(){
        return nombresit;
    }
    public void setSitioWeb(String valor){
        nombresit=valor;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int valor){
        year=valor;
    }
    public String getMes(){
        return mes;
    }
    public void setMes(String valor){
        mes=valor;
    }
    public int getDia(){
        return dia;
    }
    public void setDia(int valor){
        dia=valor;
    }
    public String getUrl(){
        return url;
    }
    public void setUrl(String valor){
        url=valor;
    }

    public void imprimirReferencia(){
        System.out.println("REFERENCIAS");
        System.out.println(autor+"."+"("+dia+"de"+mes+"de"+year+")."+nombresit
                +": Obtenido de"+nombrepag+":"+url);
    }
    
}
