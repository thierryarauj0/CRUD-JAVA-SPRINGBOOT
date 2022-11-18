package br.edu.uerr.loja.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import br.edu.uerr.loja.modelo.Compra;
import br.edu.uerr.loja.repositorio.CompraRepositorio;



import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class CompraControle {
    

@Autowired
CompraRepositorio compraRepositorio;


@GetMapping("/compra")
public String compra (Model modelo){

    modelo.addAttribute("listaCompra", compraRepositorio.findAll());
    
    return"compra";

}

@GetMapping("/cadastroCompra")
    public String cadatroCompra(Model modelo) {
        Compra compra = new Compra();
        modelo.addAttribute("compra", compra);
        return "formCompra";
        }

@PostMapping("/salvarCompra")
    public String salvar(@ModelAttribute("Compra")Compra compra, Model modelo) {
        
        compraRepositorio.save(compra);
        
        modelo.addAttribute("listaCompra", compraRepositorio.findAll());
        return "redirect:compra";

        }
@GetMapping("/deletarcompra/{id}")
    public String delCompra(@PathVariable("id") Integer id, Model modelo) {
        
        Compra compra = compraRepositorio.findById(id)
                
                
                .orElseThrow(()->new IllegalArgumentException("Este cliente não existe: "+id));

                compraRepositorio.delete(compra);

        modelo.addAttribute("listaCompra", compraRepositorio.findAll());
        return "redirect:/compra";
    }
}
        
