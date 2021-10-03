package com.julioleal.springboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.julioleal.springboot.domain.Categoria;
import com.julioleal.springboot.domain.Produto;
import com.julioleal.springboot.repositories.CategoriaRepository;
import com.julioleal.springboot.repositories.ProdutoRepository;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(0 , "Informatica");
		Categoria cat2 = new Categoria(0, "Escritorio");
		
		
		Produto p1 = new Produto(0 , "Computador", 2000.00);
		Produto p2 = new Produto(0 , "Impressora", 800.00);
		Produto p3 = new Produto(0 , "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		

		

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		
	}

}
