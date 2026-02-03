package com.controlescolar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MatriculaEntity {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private int data_matricula;
	private String status;
	
	public MatriculaEntity() {
	}

	public long getId() {
		return id;
	}

	public int getData_matricula() {
		return data_matricula;
	}

	public String getStatus() {
		return status;
	}
	
	
}
