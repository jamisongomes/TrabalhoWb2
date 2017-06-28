/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Encomendas.Repository;

import com.example.Encomendas.Model.Funcionario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jamison
 */
public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
    
}
