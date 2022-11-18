package br.edu.uerr.loja.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compra")
public class Compra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    private Integer fornecedor_id;
    
    private Integer produtos_id;
    
    private Integer quantidade;
    
    public Integer getFornecedor_id() {
        return fornecedor_id;
    }
    public void setFornecedor_id(Integer fornecedor_id) {
        this.fornecedor_id = fornecedor_id;
    }
    public Integer getProdutos_id() {
        return produtos_id;
    }
    public void setProdutos_id(Integer produtos_id) {
        this.produtos_id = produtos_id;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }



}