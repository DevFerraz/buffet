package br.com.bootcampatos.model;

public class Empresa {
	private String cnpj;
	private String nome;
	private Telefone telefone1;
	private Telefone telefone2;
	
	public String getCnpj() {
		return cnpj;
	}
	public String getNome() {
		return nome;
	}
	public Telefone getTelefone1() {
		return telefone1;
	}
	public Telefone getTelefone2() {
		return telefone2;
	}
}
