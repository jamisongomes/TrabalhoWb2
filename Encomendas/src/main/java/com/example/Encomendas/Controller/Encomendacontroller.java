/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Encomendas.Controller;
import com.example.Encomendas.Model.Encomenda;
import com.example.Encomendas.Model.Funcionario;
import com.example.Encomendas.Model.Morador;
import com.example.Encomendas.Repository.EncomendaRepository;
import com.example.Encomendas.Repository.EnderecoRepository;
import com.example.Encomendas.Repository.FuncionarioRepository;
import com.example.Encomendas.Repository.MoradorRepository;
import com.example.Encomendas.Repository.PorteiroReposytori;
import com.example.Encomendas.Repository.SindicoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Jamison
 */
@Controller
public class Encomendacontroller {
     @Autowired EncomendaRepository encomendaRepository;
     @Autowired EnderecoRepository enderecorepository;
     @Autowired FuncionarioRepository funcionariorepository;
     @Autowired MoradorRepository moradorepository;
     @Autowired PorteiroReposytori porteirorepository;
    @Autowired SindicoRepository sindicorepository;
    
    @PostMapping(path = "inserirEncomenda/{nomeMorador}/{idFuncionario}")
    public @ResponseBody String inserirEncomenda (
            @PathVariable(name = "nomeMorador") String nomeMorador, 
            @PathVariable(name = "idFuncionario") Long idFuncionario, 
            @RequestBody Encomenda encomenda) {
        
        // retornar morador
        
         List<Morador> moradores = moradorepository.
                retornarPeloNome(nomeMorador);
         
         if (moradores.isEmpty()) {
             new Morador();
             moradorepository.save(moradores);
         }
         
         funcionariorepository.findOne(idFuncionario);
         
         encomenda.setFuncionario(idFuncionario);
         encomenda.setMorador(nomeMorador);
         
        Funcionario funcionario = new Funcionario();
        funcionario.getEncomendasEntregues().add(encomenda);
         
         
        encomendaRepository.save(encomenda);
         
         return"ok";
        
    }
     
    @RequestMapping("/listarTodasEncomendas")
    public List<Encomenda> listarTodasEncomendas () {
        return encomendaRepository.retornarTodasEncomendas();
    }
    
    
    
}

 

    