package br.com.bootcampatos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	private Telefone telefone;
	private String email;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf, String email) {		
		this.nome = nome;
		this.cpf = cpf;		
		this.email = email;
	}
	
	public Cliente(String nome, String cpf, Telefone telefone, String email) {		
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
