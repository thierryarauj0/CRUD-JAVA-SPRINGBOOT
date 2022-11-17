package br.edu.uerr.loja.controle;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.uerr.loja.modelo.Empresa;
import br.edu.uerr.loja.modelo.Produto;
import br.edu.uerr.loja.repositorio.EmpresaRepositorio;
import br.edu.uerr.loja.repositorio.FornecedorRepositorio;
import br.edu.uerr.loja.repositorio.ProdutoRepositorio;

@Controller
public class ProdutoControler {

	@Autowired
	ProdutoRepositorio produtoRepositorio;
	
	@Autowired
	EmpresaRepositorio empresaRepositorio;
	
	@Autowired
	FornecedorRepositorio fornecedorRepositorio;

	@GetMapping("/produto")
	public String produto(Model model) {
		
		model.addAttribute("listaProdutos", produtoRepositorio.findAll());	
		return "produtos";
	}
	
	//From
	@GetMapping("/cadastroProduto")
	public String novoProduto(Model model) {
		Produto produto = new Produto();
		
		model.addAttribute("listaEmpresas", empresaRepositorio.findAll());		
		model.addAttribute("listaFornecedores", fornecedorRepositorio.findAll());
		
		
		model.addAttribute("produto",produto);
		return "formProduto";
	}
	
	//Salvar/Alterar
	
	@PostMapping("/salvarFornecedor")
	public String salvar(@ModelAttribute("fornecedor" )Empresa empresa , Model modelo,
		@RequestParam Integer empresaId,
		@RequestParam String nome,
		@RequestParam Integer fornecedorId,
		@RequestParam String unidade,
		@RequestParam Integer quantidade,
		@RequestParam String preco
	) {

		var emp = empresaRepositorio.findById(empresaId);
		emp.get().getNome();
		Produto produtos = new Produto();
		produtos.setEmpresaId(empresaId);
		produtos.setNome(nome);
		produtos.setFornecedorId(fornecedorId);
		produtos.setUnidade(unidade);
		produtos.setQuantidade(quantidade);
		produtos.setPreco(preco);


		
		produtoRepositorio.save(produtos);
		
		modelo.addAttribute("listaFornecedor", fornecedorRepositorio.findAll());
		modelo.addAttribute("listaEmpresas", empresaRepositorio.findAll());
		return "redirect:produto";
	}
	//Deletar






}


