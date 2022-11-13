package br.edu.uerr.loja.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto implements Serializable {

	 	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="empresa_id")
	private Integer empresaId;
	@Column(name="fornecedor_id")
	private Integer fornecedorId;
	private String nome;
	private String unidade;
	private Integer quantidade;
	private String preco;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEmpresaId() {
		return empresaId;
	}
	public void setEmpresaId(Integer empresaId) {
		this.empresaId = empresaId;
	}
	public Integer getFornecedorId() {
		return fornecedorId;
	}
	public void setFornecedorId(Integer fornecedorId) {
		this.fornecedorId = fornecedorId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	
	
	
	
	
	
	
}
