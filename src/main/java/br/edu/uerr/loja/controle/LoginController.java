package br.edu.uerr.loja.controle;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.uerr.loja.modelo.Usuario;
import br.edu.uerr.loja.repositorio.UsuarioRepositorio;

@Controller
public class LoginController{
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

     @GetMapping("/")
    public String exibirIndex(Usuario usuario) {
    return "index.html";
    }

    @PostMapping ("efetuarLogin")
    public String efetuarLogin(Usuario usuario,
        RedirectAttributes ra ,
         HttpSession session ){
         usuario = this.usuarioRepositorio.findByLoginAndSenha(
            
         usuario.getLogin(), usuario.getSenha()) ;
         
         
        if ( usuario != null    )  {
           
             session.setAttribute("usuarioLogado", usuario);
                return "redirect:/empresa";
            } else { 
                ra.addFlashAttribute("mensagem","login e/ou senha inválidos");
                return"redirect:/";
            }
        }
        @PostMapping("/logout")
        public String logout(HttpSession session){
    
            session.invalidate();
            return "redirect:/";
    
        }

       
@GetMapping("/clientes")
public String abreCliente (Model modelo){

    modelo.addAttribute("listaUsuarios", usuarioRepositorio.findAll());
    
    return"usuarios";
    
    }
    @GetMapping("/cadastroUsuario")
	public String abreFormUsuario(Model modelo) {
		Usuario usuario = new Usuario();
		modelo.addAttribute("usuario", usuario);

		return "formUsuario";
		}


        @PostMapping("/salvarUsuario")
        public String salvar(@ModelAttribute("Usuario")Usuario usuario, Model modelo) {
		
            usuarioRepositorio.save(usuario);
            
            modelo.addAttribute("listaUsuarios", usuario.findAll());
            return "redirect:/clientes";


        }
            @GetMapping("/deletarUsuario/{id}")
	public String delUsuario(@PathVariable("id") Integer id, Model modelo) {
		
		Usuario usuario = usuarioRepositorio.findById(id)
				
				
				.orElseThrow(()->new IllegalArgumentException("Este Usuario não existe: "+id));

				usuarioRepositorio.delete(usuario);

		modelo.addAttribute("listaUsuarios", usuarioRepositorio.findAll());
		return "redirect:/clientes";
	}
}



    
        


    