package com.generation.FarmaciaGen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  //identifica que esta classe é uma model
public class Categoria {
	
	@Id //identifica que este atributo é um id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //DEFINE QUE SERÁ AUTO INCREMENTO
	private long id;
	
	private String descricao;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
