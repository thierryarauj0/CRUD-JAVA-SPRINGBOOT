package br.edu.uerr.loja.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.uerr.loja.modelo.Usuario;

public interface UsuarioRepositorio  extends JpaRepository<Usuario , Integer>{
    
public Usuario findByLoginAndSenha(String login, String senha);

}
