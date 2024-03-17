package com.taller1.taller1.Models.DAO;

import java.util.List;

import com.taller1.taller1.Models.Entity.cliente;

public interface IClienteDao {
    
    public List<cliente> findAll();
    public void Save(cliente cliente);
}
