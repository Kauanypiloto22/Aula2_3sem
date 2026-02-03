package com.controlescolar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AlunoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private int datanasc;
	
	public AlunoEntity() {
	}
	
	public AlunoEntity(String nome, String email, int datanasc) {
		this.nome = nome;
		this.email = email;
		this.datanasc = datanasc; 
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getDatanasc() {
		return datanasc;
	}

	
}
