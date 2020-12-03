/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpaSpringRedflix;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

/**
 *
 * @author alejo
 */
    
@Entity
@Table(name="series")
public class Serie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //--> si el id es un valor auto generado por mySQL
    @Column(name="ser_id")   //nombre de la columna en la tabla de la BD
    int id;                  //tipo de dato y nombre de la variable (que guardará el dato de la tabla de la BD)
    
    @Column(name="ser_titulo")
    String titulo;

    @Column(name="ser_n_episodios")
    int episodios;
    
    @Column(name="ser_n_temporadas")
    int temporadas;
    
    

    public Serie() {
    }

    public Serie(String titulo, int episodios, int temporadas) {
        this.titulo = titulo;
        this.episodios = episodios;
        this.temporadas = temporadas;
    }

    public int getId() {
        return id;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Serie{" + "id=" + id + ", titulo=" + titulo + ", episodios=" + episodios + ", temporadas=" + temporadas + '}';
    }
    
    
    
    
    
}
