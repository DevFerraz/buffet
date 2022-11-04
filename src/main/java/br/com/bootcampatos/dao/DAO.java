package br.com.bootcampatos.dao;

import br.com.bootcampatos.model.Telefone;

import javax.persistence.EntityManager;

public class DAO<E> {
    EntityManager em;

    public DAO(EntityManager em) {
        this.em = em;
    }

    public void insert(E entity) {
        this.em.getTransaction().begin();
        this.em.persist(entity);
        this.em.getTransaction().commit();
        this.em.close();
    }

    public Telefone getTelefoneByNumber(String numero) {
       return numero;
    }
}