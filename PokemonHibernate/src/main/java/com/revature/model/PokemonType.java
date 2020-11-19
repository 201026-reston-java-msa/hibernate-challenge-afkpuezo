

package com.revature.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
 * A bean must implement Serializable, Comparable
 * and override hashCode() and equals().
 */
@Entity
@Table(name="POKEMON_TYPE")
public class PokemonType implements Serializable {
	/**
	 * Compatibility with Java 2.x 
	 */
	private static final long serialVersionUID = -2783359867056908045L;
	
	@Id
	@Column(name="PT_ID")
	//generator references name on @SequenceGenerator
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pokemonTypeSequence")
	//sequenceName is the actual name of the Sequence in the database
	@SequenceGenerator(name="pokemonTypeSequence", sequenceName="POKEMON_TYPE_SEQ")
	private int id;

	@Column(name="PT_ELEMENT")
	private String element;
	
	public PokemonType() {}

	public PokemonType(String element) {
		this.element = element;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "PokemonType [id=" + id + ", element=" + element + "]";
	}
}
