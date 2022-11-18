package br.edu.uerr.loja.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.edu.uerr.loja.modelo.Venda;

@Repository
public interface VendaRepositorio extends JpaRepository <Venda, Integer>{


}
