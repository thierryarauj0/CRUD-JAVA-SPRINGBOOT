package br.edu.uerr.loja.modelo;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
    @Table(name="venda")
    public class Venda implements Serializable {
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name="empresa_id")
	private Integer empresaId;
        public Integer getEmpresaId() {
            return empresaId;
        }
        public void setEmpresaId(Integer empresaId) {
            this.empresaId = empresaId;
        }
        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        private Integer cliente_id;
        @Column(name="produto_id")
        private Integer produtoId;

        @Column(name="usuario_id")
        private Integer usuarioId;

        public Integer getUsuarioId() {
            return usuarioId;
        }
        public void setUsuarioId(Integer usuarioId) {
            this.usuarioId = usuarioId;
        }
        private Integer quantidade;
        
        public Integer getQuantidade() {
            return quantidade;
        }
        public void setQuantidade(Integer quantidade) {
            this.quantidade = quantidade;
        }
        private Integer valor_unitario;
        
        private String forma_pagamento;
        
        public Integer getCliente_id() {
            return cliente_id;
        }
        public void setCliente_id(Integer cliente_id) {
            this.cliente_id = cliente_id;
        }
        public Integer getProdutos_id() {
            return produtoId;
        }
        public void setProdutos_id(Integer produtoId) {
            this.produtoId = produtoId;
        }
        public Integer getValor_unitario() {
            return valor_unitario;
        }
        public void setValor_unitario(Integer valor_unitario) {
            this.valor_unitario = valor_unitario;
        }
        public String getForma_pagamento() {
            return forma_pagamento;
        }
        public void setForma_pagamento(String forma_pagamento) {
            this.forma_pagamento = forma_pagamento;
        }
        @Column (name="data_de_venda")
        private Calendar dataDeVenda;
        public Calendar getDataDeNascimento() {
            return dataDeVenda;
        }
        public void setDataDeNascimento(Calendar dataDeNascimento) {
            this.dataDeVenda = dataDeNascimento;
        }
        
       
}
