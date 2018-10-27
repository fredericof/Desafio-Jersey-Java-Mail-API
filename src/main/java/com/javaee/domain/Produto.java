package com.javaee.domain;

public class Produto {
	
	private Long id;
	private String nome;
	private String categoria;
	private Float preço;
	
	public Produto(Long id, String nome, String categoria, Float preço) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.preço = preço;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Float getPreço() {
		return preço;
	}
	public void setPreço(Float preço) {
		this.preço = preço;
	}

}
