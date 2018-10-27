package com.javaee.service;

import java.util.ArrayList;
import java.util.List;

import com.javaee.domain.Produto;

public class ProdutoServiceImpl implements IProduto {
	
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public ProdutoServiceImpl() {
		produtos.add(new Produto(Long.valueOf(1), "Detergente", "cozinha", Float.valueOf("1.99")));
		produtos.add(new Produto(Long.valueOf(2), "Sabão", "cozinha", Float.valueOf("2.99")));
		produtos.add(new Produto(Long.valueOf(3), "Palha de aço", "cozinha", Float.valueOf("3.99")));
		
		produtos.add(new Produto(Long.valueOf(4), "Escova de dente", "higiene", Float.valueOf("4.99")));
		produtos.add(new Produto(Long.valueOf(5), "Desodorante", "higiene", Float.valueOf("5.99")));
		produtos.add(new Produto(Long.valueOf(6), "Fio dental", "higiene", Float.valueOf("6.99")));
		
		produtos.add(new Produto(Long.valueOf(7), "Cueca", "roupas", Float.valueOf("7.99")));
		produtos.add(new Produto(Long.valueOf(8), "Camisa", "roupas", Float.valueOf("8.99")));
		produtos.add(new Produto(Long.valueOf(9), "Blusa", "roupas", Float.valueOf("9.99")));
		produtos.add(new Produto(Long.valueOf(10), "bermuda", "roupas", Float.valueOf("10.99")));
	}

	public List<Produto> listarProdutos() {
		return produtos;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
}
