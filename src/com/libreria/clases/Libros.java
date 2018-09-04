package com.libreria.clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karla
 */
public class Libros {
   
    private String titulo;
    private String genero;
    private String autor;
    private int idLibro;
    
    // todos los contructores son publicos
    public Libros (){}
    
    
    //public nombre de la clase nombre de la variable(la que voy a relacionar con las de arriba).
    public Libros (String tituloLibro, String generoLibro, String autorLibro, int idLibro)
    {  
        this.titulo = tituloLibro;
        this.genero = generoLibro;
        this.autor = autorLibro;
        this.idLibro = idLibro;
     
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the idLibro
     */
    public int getIdLibro() {
        return idLibro;
    }

    /**
     * @param idLibro the idLibro to set
     */
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    
    
    
    
    
}
