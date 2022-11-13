package br.edu.uerr.loja.controle;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.uerr.loja.modelo.Usuario;

@Controller
public class LoginController{
     @GetMapping("/")
    public String exibirIndex(Usuario usuario) {
    return "index.html";
    }

    @PostMapping ("efetuarLogin")
    public String efetuarLogin(Usuario usuario, HttpSession session){
        if (usuario.getLogin().equals("admin") &&
            usuario.getSenha().equals("1234"))  {
            usuario.setNome("Administrador");
             session.setAttribute("usuarioLogado", usuario);
                return "redirect:/empresa";
            } else {
                return"redirect:/";
            }
        }}
    
        


    