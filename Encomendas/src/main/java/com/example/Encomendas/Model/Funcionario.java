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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jamison
 */
@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Funcionario implements Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long idfuncionario;
    
    private String  Nomefuncionario;
    private String CPFfuncionario;
    
    @OneToMany(mappedBy = "Cadastro")
    private Set<Encomenda> encomendasEntregues = new HashSet();

    
}
