/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Encomendas.Repository;

import com.example.Encomendas.Model.Encomenda;
import com.example.Encomendas.Model.Endereco;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jamison
 */
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
    
}
