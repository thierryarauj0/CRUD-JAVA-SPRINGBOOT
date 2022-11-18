package br.edu.uerr.loja.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.uerr.loja.modelo.Compra;

@Repository
public interface CompraRepositorio extends JpaRepository <Compra, Integer>{


}
