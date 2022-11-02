package br.com.bootcampatos.model;

public enum TipoTelefone {
	
	FIXO(0), CELULAR(1), INTERNACIONAL(3), COMERCIAL(4);

	public int valor;
	
	
	TipoTelefone(int valor){
		this.valor = valor;
	}	

}
