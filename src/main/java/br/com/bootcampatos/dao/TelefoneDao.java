package br.com.bootcampatos.dao;

import javax.persistence.EntityManager;

import br.com.bootcampatos.model.Telefone;

public class TelefoneDao {
	EntityManager em;
	
	public TelefoneDao(EntityManager entityManager) {
		this.em = entityManager;
	}
	
	public Telefone getTelefoneByNumber(String number) {
		return new Telefone();
	}
	
	public boolean insert(Telefone telefone) {
		return true;
	}

}
