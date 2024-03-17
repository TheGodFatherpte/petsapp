package com.taller1.taller1.Models.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taller1.taller1.Models.Entity.cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class ClienteDaoImp implements IClienteDao {
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<cliente> findAll() {
        return em.createQuery("from cliente").getResultList(); 
    }

    @Override
    @Transactional
    public void Save(cliente cliente) {
        em.persist(cliente);
    }
    
}
