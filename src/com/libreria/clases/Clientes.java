/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.clases;

/**
 *
 * @author Karla
 */
public class Clientes {
   
    private Clientes(){}
    
    private String nombre;
    private String apellido;
    private int edad;
    private int idCliente;
    // como quiero solo 1 contador por cliente, se hace referencia de la siguiente manera.
    private int contador = 0;
    
    /* en este apartado se hace la relacion de la clase CLientes con Libros. aqui se inicializa el valor y tamaño de la lista*/
    private Libros librosCliente[];   
        
    
    public Clientes (String nombreCliente, String apellidoCliente, int edadCliente, int idCliente, int librosPermitidos)
    {   //constructor
        this.nombre = nombreCliente;
        this.apellido = apellidoCliente;
        this.edad = edadCliente;
        this.idCliente = idCliente;
        //cada de que cree un nuevo cliente va a pedir sus datos y cuantos libros puede solicitar ese cliente.
        this.librosCliente = new Libros[librosPermitidos];  
        
    }
    
    //abajo del constructor es en donde siempre se ponen los metodos.
    public boolean solicitarLibro(Libros titulo){
        if (contador < this.librosCliente.length) { 
            this.librosCliente[contador] = titulo;
            contador++; 
            return true;
        }
        return false;
    }
    
    
    
    //despues se hacen los get/set

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
