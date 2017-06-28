/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Encomendas.Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Jamison
 */
@Entity
public class Morador implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long idmorador;
    private String  nomeMorador;
    private String CPFmorador;
    
    
    @OneToMany(mappedBy = "morador")
    private Set<Encomenda> encomendas = new HashSet();
    
    @ManyToOne
    private Endereco endereco;
}
