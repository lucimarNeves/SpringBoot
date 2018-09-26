package com.mballem.curso.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARGOS")
public abstract class Cargo extends AbstractEntity<Long> {
	
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	
	//nome da classe  Departamento e objeto departamento
	@ManyToOne  //direita para esquerda  1 departamento c/ muitos cargos
	@JoinColumn(name = "id_departamento_fk") //nome da chave estrangeira da coluna
	private Departamento departamento;

	//mapeando funcionarios
	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> fucionarios;

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public List<Funcionario> getFucionarios() {
		return fucionarios;
	}


	public void setFucionarios(List<Funcionario> fucionarios) {
		this.fucionarios = fucionarios;
	}
	
	//gerando get/set
	
	
	

}
