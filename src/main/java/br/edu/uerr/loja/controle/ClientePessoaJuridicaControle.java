package br.edu.uerr.loja.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import br.edu.uerr.loja.modelo.ClientePessoaJuridica;
import br.edu.uerr.loja.repositorio.ClientePessoaJuridicaRepositorio;



import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ClientePessoaJuridicaControle {
    

@Autowired
ClientePessoaJuridicaRepositorio clientePessoaJuridicaRepositorio;


@GetMapping("/clientePessoaJuridica")
public String abreClientePessoaJuridica (Model modelo){

    modelo.addAttribute("listaClientesJuridica", clientePessoaJuridicaRepositorio.findAll());
    
    return"clienteJuridico";

}

@GetMapping("/cadastroClienteJuridico")
	public String abreformClienteJuridica(Model modelo) {
		ClientePessoaJuridica clientePessoaJuridica = new ClientePessoaJuridica();
		modelo.addAttribute("clientePessoaJuridica", clientePessoaJuridica);
		return "formClienteJuridico";
		}

@PostMapping("/salvarClienteJuridico")
	public String salvar(@ModelAttribute("ClientePessoaJuridica")ClientePessoaJuridica clientePessoaJuridica, Model modelo) {
		
		clientePessoaJuridicaRepositorio.save(clientePessoaJuridica);
		
		modelo.addAttribute("listaClientesJuridica", clientePessoaJuridicaRepositorio.findAll());
		return "redirect:clientePessoaJuridica";

		}
@GetMapping("/deletarClienteJuridico/{id}")
	public String delClienteJuridico(@PathVariable("id") Integer id, Model modelo) {
		
		ClientePessoaJuridica clientePessoaJuridica = clientePessoaJuridicaRepositorio.findById(id)
				
				
				.orElseThrow(()->new IllegalArgumentException("Este cliente não existe: "+id));

				clientePessoaJuridicaRepositorio.delete(clientePessoaJuridica);

		modelo.addAttribute("listaClientesJuridica", clientePessoaJuridicaRepositorio.findAll());
		return "redirect:/clientePessoaJuridica";
	}
}
        
    










