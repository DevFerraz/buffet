package br.com.bootcampatos.model;

public class Contrato {
	private Cliente cliente;
	private double quantidadeConvidados;
	private boolean sobremesa;
	private Empresa empresa;


	public double getQuantidadeConvidados() {
		return quantidadeConvidados;
	}

	public void setQuantidadeConvidados(double quantidadeConvidados) {
		this.quantidadeConvidados = quantidadeConvidados;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public int getQuantidadeGarcons() {
		return (int) Math.ceil(this.quantidadeConvidados / 15);
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
