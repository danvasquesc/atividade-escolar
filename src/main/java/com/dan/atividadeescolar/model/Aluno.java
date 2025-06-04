package com.dan.atividadeescolar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeCompleto;
	private String ra;
	private String dataNascimento; //String pois sera a senha e facilitará a verificacao posteriormente
	private Turma turma;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public String getRa() {
		return ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	
	public Turma getTurma() {
		return turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	
	
	

}
