package com.mercadinho;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mercadinho.domain.Categoria;
import com.mercadinho.repositories.CategoriaRepository;

@SpringBootApplication
public class MercadinhoApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MercadinhoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Bebida");
		Categoria cat2 = new Categoria(null, "Doces");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}

}
