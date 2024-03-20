package com.taller1.taller1.Models.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicamentos implements Serializable{
    @Id
    @Column(name = "idMedicamento")
    private String idMedicamento;
   
    @Column(name = "Descripcion")
    private String Descripcion;
    
    @Column(name = "Dosis")
    private String Dosis;
    
    public String getDosis() {
        return Dosis;
    }
    public void setDosis(String dosis) {
        Dosis = dosis;
    }
    public String getIdMedicamento() {
        return idMedicamento;
    }
    public void setIdMedicamento(String idMedicamento) {
        this.idMedicamento = idMedicamento;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
