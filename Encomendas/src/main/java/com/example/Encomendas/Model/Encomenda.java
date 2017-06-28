/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Encomendas.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jamison
 */
@Entity
@Getter
@Setter

public class Encomenda implements Serializable {

 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEncomenda;
    private String numeracaoEncomenda;
    private Boolean entregue;
        

    @ManyToOne
    private Funcionario funcionario;
    
    @Column(nullable = false)
  
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date datadeentrada;
    
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataderetirada;
    
    @ManyToOne
    private Morador morador;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEncomenda != null ? idEncomenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Encomenda other = (Encomenda) obj;
        return Objects.equals(this.idEncomenda, other.idEncomenda);
    }

    public void setMorador(String nomeMorador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFuncionario(Long idFuncionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
}
