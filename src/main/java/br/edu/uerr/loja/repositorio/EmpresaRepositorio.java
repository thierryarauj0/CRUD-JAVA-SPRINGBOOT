package br.edu.uerr.loja.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.uerr.loja.modelo.Empresa;



@Repository
public interface EmpresaRepositorio extends JpaRepository <Empresa, Integer> {

	//public Empresa save();
	
}


