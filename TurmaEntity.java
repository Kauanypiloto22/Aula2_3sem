package com.controlescolar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TurmaEntity {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private int codigo;
	private int ano;
	private String periodo;
	
	public TurmaEntity() {
	}

	public long getId() {
		return id;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getAno() {
		return ano;
	}

	public String getPeriodo() {
		return periodo;
	}
	
}
