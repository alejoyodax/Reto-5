/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpaSpringRedflix;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author alejo
 */

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, String> {    //la interface Repositorio, hereda de Jpa... y va a manipular objetos de tipo usuario, y sub llave primaria en un string
    
    // para poder usar la interface RepositorioUsuario, debemos ir a myRunner y crear un objeto de tipo RepositorioUsuario
    // esto se crea para tner la funcionalidad de obtener usuarios, borrar... todo lo de CRUD



}
