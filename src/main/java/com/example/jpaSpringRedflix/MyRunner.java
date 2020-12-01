/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpaSpringRedflix;

import static org.hibernate.annotations.common.util.impl.LoggerFactory.logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author alejo
 */

@Component
public class MyRunner implements CommandLineRunner { // La clase MyRunner hereda lo de CommandLineRUnner
    // creamos un atributo de tipo RepositorioUsuario    
    
    
    @Autowired
    RepositorioUsuario repo; // -->
    
    
    @Override
    public void run(String... args) throws Exception { //Este es como el main, aquí se pone el código
        //System.out.println("Hola Mundo"); // no es la forma ideal para mostrar mensajes, ya que spring correrá en un servidor y no tenenmos acceso a una consola
        // para eso, se usa un Logger
       
        //System.out.println("La tabla usuario tiene "+  repo.count() + " registros"); //para hacer una consulta de cuantos datos tiene la tabla
        //System.out.println("La tabla usuario tiene "+  repo.count() + " registros");
        //System.out.println(repo.findAll());
        
        //Long numerocel = 3194212354L;
        //Usuario user = new Usuario("alejoyodax", "Alejandra", "Silva", "9999999999", numerocel , "Z0123xc", "1997-04-09");
        //repo.save(user); 
        
        
        if (repo.existsById("alejoyodax")){
            System.out.println("\n");
            System.out.println("Si existe el usuario alejoyodax");
        }else{
            System.out.println("No existe el usuario alejoyodax");
        }
        
// para agregar el nuevo Usuario user en la base de datos
        //String aBorrar = "alejoyodax";    
        //repo.delete(new Usuario("alejoyodax" , "sd")); //función para borrar por id. Es necesario crear un constructor con solo los atributos id para poder crear una instancia con solo esos atributos
        
        // para modificar un registor de una tabla        
        //Usuario user = new Usuario("alejoyodax", "as", "sd", "sd", 3234L , "1", "asd");
        
        
        
        
    }
    
}
