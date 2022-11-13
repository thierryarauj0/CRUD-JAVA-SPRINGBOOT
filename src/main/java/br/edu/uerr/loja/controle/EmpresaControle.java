package br.edu.uerr.loja.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import br.edu.uerr.loja.modelo.Empresa;
import br.edu.uerr.loja.repositorio.EmpresaRepositorio;


@Controller
public class EmpresaControle {

	@Autowired
	EmpresaRepositorio empresaRepositorio;
	

	@GetMapping("/empresa")
	public String abreEmpresa(Model modelo) {
		modelo.addAttribute("listaEmpresas", empresaRepositorio.findAll());
		return "empresa";
	}
	
	@GetMapping("/cadastroEmpresa")
	public String abreformEmpresa(Model modelo) {
		Empresa empresa = new Empresa();
		modelo.addAttribute("empresa", empresa);
		return "formEmpresa";
		}
	
	@PostMapping("/salvarEmpresa")
	public String salvar(@ModelAttribute("empresa")Empresa empresa, Model modelo) {
		
		empresaRepositorio.save(empresa);
		
		modelo.addAttribute("listaEmpresas", empresaRepositorio.findAll());
		return "redirect:empresa";
	}
	@GetMapping("/deletarEmpresa/{id}")
	public String delEmpresa(@PathVariable("id") Integer id, Model modelo) {
		
		Empresa empresa = empresaRepositorio.findById(id)
				.orElseThrow(()->new IllegalArgumentException("Esta empresa não existe: "+id));
		empresaRepositorio.delete(empresa);
				
		modelo.addAttribute("listaEmpresas", empresaRepositorio.findAll());
		return "redirect:/empresa";
	}
	
    @GetMapping("/form/{id}")
    public String editar (@PathVariable("id") Integer id, Model modelo) {

        Empresa empresa = empresaRepositorio.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("empresa nao encontrada" + id));
       
        modelo.addAttribute("empresa", empresa);
        return "atualizaForm";
    }

    
    @PostMapping("/update/{id}")
    public String alterarProduto(@PathVariable("id") Integer id, Empresa empresa) {

        empresaRepositorio.save(empresa);
        return "redirect:/empresa";
    }

	
	




}
