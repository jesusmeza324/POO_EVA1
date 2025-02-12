/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_apa;

import APA.Libro;
import APA.SitioWeb;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_6_APA {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        Libro book=new Libro();
        SitioWeb sitio=new SitioWeb();
        System.out.println("Libro-->1");
        System.out.println("Sitio Web-->2");
        System.out.println("¿De donde se va extraer la cita?");
        int num=cap.nextInt();
        cap.nextLine();
        if(num==1){
        System.out.println("Autor:");
        book.setAutor(cap.nextLine());
        System.out.println("Titulo:");
        book.setTitulo(cap.nextLine());
        System.out.println("Año:");
        book.setYear(cap.nextInt());
        cap.nextLine();
        System.out.println("Ciudad:");
        book.setCiudad(cap.nextLine());
        System.out.println("Editorial:");
        book.setEditorial(cap.nextLine());
        book.imprimirReferencia();
        }
        if(num==2){
        System.out.println("Autor:");
        sitio.setAutor(cap.nextLine());
        System.out.println("Pagina:");
        sitio.setPagina(cap.nextLine());
        System.out.println("Sitio web:");
        sitio.setSitioWeb(cap.nextLine());
        System.out.println("Year:");
        sitio.setYear(cap.nextInt());
        cap.nextLine();
        System.out.println("Mes:");
        sitio.setMes(cap.nextLine());
        System.out.println("Dia:");
        sitio.setDia(cap.nextInt());
        cap.nextLine();
        System.out.println("Url:");
        sitio.setUrl(cap.nextLine());
        sitio.imprimirReferencia(); 
        }
    }
}
