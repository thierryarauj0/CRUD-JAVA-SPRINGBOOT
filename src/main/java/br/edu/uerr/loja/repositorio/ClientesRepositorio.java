package br.edu.uerr.loja.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.uerr.loja.modelo.Cliente;

@Repository
public interface ClientesRepositorio extends JpaRepository<Cliente, Integer>{

}
