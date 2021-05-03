package com.generation.FarmaciaGen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.FarmaciaGen.model.Categoria;

@Repository //identifica que a interface é um repositório
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	//chama as funcionalidades da JPA (referente a qual model é a interface, tipo do id)
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}
