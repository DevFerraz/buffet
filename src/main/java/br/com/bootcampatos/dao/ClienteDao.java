package br.com.bootcampatos.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.bootcampatos.model.Cliente;

public class ClienteDao {
	EntityManager em;
	
	public ClienteDao(EntityManager entityManager) {
		this.em = entityManager;
	}
	
	public boolean insert(Cliente cliente) {
		return true;
	}
	
	public List<Cliente> getAll(){
		return new ArrayList<Cliente>();
	}
}
