/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Encomendas.Repository;

import com.example.Encomendas.Model.Encomenda;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jamison
 */
public interface EncomendaRepository  extends CrudRepository<Encomenda, Long> {
    
     @Query("SELECT u FROM Encomenda u")
    public List<Encomenda> retornarTodasEncomendas();

    
}
