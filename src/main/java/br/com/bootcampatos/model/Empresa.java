package br.com.bootcampatos.model;

public class Empresa {
	private String cnpj;
	private String nome;
	private Telefone telefone1;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Telefone getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(Telefone telefone1) {
		this.telefone1 = telefone1;
	}
	
}
