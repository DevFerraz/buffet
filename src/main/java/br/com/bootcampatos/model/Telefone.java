package br.com.bootcampatos.model;

public class Telefone {
	private String numero;
	private String tipoTelefone;
	
	public Telefone() {
		
	}
	
	public Telefone(String numero, String tipo) {
		super();
		this.numero = numero;
		this.tipoTelefone = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipoTelefone;
	}
	public void setTipo(String tipo) {
		this.tipoTelefone = tipo;
	}
	

}
