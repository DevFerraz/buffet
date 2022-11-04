package br.com.bootcampatos.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.bootcampatos.model.Cliente;

public class ClienteDao extends DAO<Cliente> {
	public ClienteDao(EntityManager em) {
		super(em);
	}


	
	public List<Cliente> getAll(){
		return new ArrayList<Cliente>();
	}

	}
}
