package br.edu.uerr.loja.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.uerr.loja.modelo.ClientePessoaFisica;



@Repository
public interface ClientePessoaFisicaRepositorio extends JpaRepository <ClientePessoaFisica, Integer>{

    static void saveAll(String clientepessoafisica) {
    }





    
}

    

