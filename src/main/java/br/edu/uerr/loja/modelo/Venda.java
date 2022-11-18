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
       
        private Integer produtoId;
       
        @Column(name="usuario_id")
    
        private Integer usuarioId;

        private Integer valor_unitario;
        
        private String forma_pagamento;
        
      
        private Calendar dataDeVenda;


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


        public Integer getProdutoId() {
            return produtoId;
        }


        public void setProdutoId(Integer produtoId) {
            this.produtoId = produtoId;
        }


        public Integer getUsuarioId() {
            return usuarioId;
        }


        public void setUsuarioId(Integer usuarioId) {
            this.usuarioId = usuarioId;
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


        public Calendar getDataDeVenda() {
            return dataDeVenda;
        }


        public void setDataDeVenda(Calendar dataDeVenda) {
            this.dataDeVenda = dataDeVenda;
        }
   
       
}
