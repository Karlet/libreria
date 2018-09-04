/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.principal;
import com.libreria.clases.*;

//import com.libreria.clases.Clientes;

/**
 *
 * @author Karla
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     int x;
     x = 10;
     String alex; 
     alex = "Alex";
     
     Libros libro1; 
     libro1 = new Libros("El alpinista", "accion", "Alquimista", 8589);
    
     Clientes cliente1;
     cliente1 = new Clientes(alex, "Zepeda", 28, 1928, 10);
     
     boolean disponibilidadLibro;
    
     disponibilidadLibro = cliente1.solicitarLibro(libro1);
     if (disponibilidadLibro == true){
         System.out.println("available");
     }
     else {
         System.out.println("denegade");
    }
         
    }
    
    
}
