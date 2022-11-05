package br.com.bootcampatos.model;

import javax.persistence.*;

@Entity
public class Contrato{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer quantidadeConvidados;
	private boolean sobremesa;
	@ManyToOne
	private Cliente cliente;


	public Contrato(Integer quantidadeConvidados, boolean sobremesa, Cliente cliente) {
		this.cliente = cliente;
		this.quantidadeConvidados = quantidadeConvidados;
		this.sobremesa = sobremesa;
	}
	public Contrato(){

	}

	public Empresa getEmpresa(){
		Empresa empresa = new Empresa();
		empresa.setCnpj("43.789.256/0001-99");
		empresa.setNome("Elegance Buffet");
		empresa.setTelefone("(21) 3000-2000");
		return empresa;
	}

	public double getQuantidadeConvidados() {
		return quantidadeConvidados;
	}

	public void setQuantidadeConvidados(Integer quantidadeConvidados) {
		this.quantidadeConvidados = quantidadeConvidados;
	}



	public int getQuantidadeGarcons() {
		return (int) Math.ceil((double)this.quantidadeConvidados / 15);
	}

	public double getTaxaGarcon() {
		return this.getQuantidadeGarcons() * 250;
	}

	public double getValorTotal() {
		double total = getTaxaGarcon() + quantidadeConvidados * 22.9;
		if(isSobremesa() == true) {
			return Math.round((total *= 1.1 * 100) / 100);
		}else {
			return Math.round((total * 100) / 100);
		}
	}

	public boolean isSobremesa() {
		return sobremesa;
	}

	public void setSobremesa(boolean sobremesa) {
		this.sobremesa = sobremesa;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente nome) {
		this.cliente = nome;
	}

}
