package com.controlescolar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CursoEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private int carga_h;
	private String descricao;
	
	public CursoEntity() {
		
	}
	
public CursoEntity (String nome, int carga_h, String descricao) {
	this.nome = nome;
	this.carga_h = carga_h;
	this.descricao = descricao;
}

public long getId() {
	return id;
}

public String getNome() {
	return nome;
}

public int getCarga_h() {
	return carga_h;
}

public String getDescricao() {
	return descricao;
}


}
