package com.example.jpaSpringRedflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.example.jpaSpringRedflix")
public class JpaSpringRedflixApplication {

	public static void main(String[] args) {
		Ventana interfaz = new Ventana();
                interfaz.setVisible(true);
	}
        
        public static void runSpringServer(String[] args) {
        SpringApplication.run(JpaSpringRedflixApplication.class, args);
        }

}
