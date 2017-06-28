/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Encomendas.Repository;

import com.example.Encomendas.Model.Encomenda;
import com.example.Encomendas.Model.Morador;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Jamison
 */
public interface MoradorRepository extends CrudRepository<Morador, Long> {

    @Query("SELECT m FROM Morador m WHERE m.nomeMorador "
            + "= :nomeMorador")
    public List<Morador> retornarPeloNome(@Param("nomeMorador") 
            String nomeMorador);
    
}
