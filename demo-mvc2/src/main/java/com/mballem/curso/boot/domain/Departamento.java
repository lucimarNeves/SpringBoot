package com.mballem.curso.boot.domain;

import java.util.List;

import javax.persistence.*; //colocar * para não errar nenhuma anotação

//id vai ser herdado pela abstracti entity

@SuppressWarnings("serial")
@Entity          //TABELA
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {
	
	//mapeando a entidade
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "departamento") //muitos cargos para 1 departamento, mappedBy - realcionamento bi-direcional
	                                      //departamento lado fraco
	private List<Cargo> cargos;           //entre departamento e cargo definindo lado fraco e forte, lado forte é aquele que contéma a FK

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}

}
