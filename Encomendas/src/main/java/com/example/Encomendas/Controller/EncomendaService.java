/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Encomendas.Controller;

import com.example.Encomendas.Repository.EncomendaRepository;
import com.example.Encomendas.Repository.EnderecoRepository;
import com.example.Encomendas.Repository.FuncionarioRepository;
import com.example.Encomendas.Repository.MoradorRepository;
import com.example.Encomendas.Repository.PorteiroReposytori;
import com.example.Encomendas.Repository.SindicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jamison
 */
@Service
public class EncomendaService {
    
      @Autowired EncomendaRepository encomendarepository;
     @Autowired EnderecoRepository enderecorepository;
     @Autowired FuncionarioRepository funcionariorepository;
     @Autowired MoradorRepository moradorrepository;
     @Autowired PorteiroReposytori porteirorepository;
    @Autowired SindicoRepository sindicorepository;
    
    
    
}
