    package br.edu.uerr.loja.modelo;

    import java.io.Serializable;
    import java.text.DecimalFormat;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;
    import javax.persistence.Table;

    public class Compras {
    @Entity
    @Table(name="compras")
    public class compras implements Serializable {
    private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Integer id;
    private Integer cliente_id;
        private Integer produtos_id;
        private Integer quantidade;
        private DecimalFormat valor_unitario;
        private Integer forma_pagamento;
        private Integer data_venda;

        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        public Integer getCliente_id() {
            return cliente_id;
        }
        public void setCliente_id(Integer cliente_id) {
            this.cliente_id = cliente_id;
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
        public DecimalFormat getValor_unitario() {
            return valor_unitario;
        }
        public void setValor_unitario(DecimalFormat valor_unitario) {
            this.valor_unitario = valor_unitario;
        }
        public Integer getForma_pagamento() {
            return forma_pagamento;
        }
        public void setForma_pagamento(Integer forma_pagamento) {
            this.forma_pagamento = forma_pagamento;
        }
        public Integer getData_venda() {
            return data_venda;
        }
        public void setData_venda(Integer data_venda) {
            this.data_venda = data_venda;
        }
    }}
