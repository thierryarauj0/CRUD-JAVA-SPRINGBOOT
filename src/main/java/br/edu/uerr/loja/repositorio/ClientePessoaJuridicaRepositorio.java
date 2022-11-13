package br.edu.uerr.loja.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.uerr.loja.modelo.ClientePessoaJuridica;



@Repository
public interface ClientePessoaJuridicaRepositorio extends JpaRepository <ClientePessoaJuridica, Integer>{

    static void saveAll(String clientepessoajuridica) {
    }





    
}

    

