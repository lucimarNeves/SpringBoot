package com.mballem.curso.boot.domain;

import java.io.Serializable;

import javax.persistence.*; //importando todo os pacotes  Id


//esta é a classe pai e as demais classes filhas vão herdar
//implemetar ORM tem que implementar todas as classes filhas serão serializadas, herdam

@SuppressWarnings("serial")
@MappedSuperclass  //omitindo warns
//adicionar o abstratct para garantir que as outras classes possam utilizar por herança não por instância
public abstract class AbstractEntity<ID extends Serializable> implements Serializable{
	
	//mysql - Identiy -> autoincremento
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("rawtypes")
		AbstractEntity other = (AbstractEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "id=" + id ; //remova o abstractiEntity e deixe só o id
	}
	
	

}
