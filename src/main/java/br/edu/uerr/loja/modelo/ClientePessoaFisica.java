package br.edu.uerr.loja.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;


import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
@Table(name="cliente_pessoa_fisica")
public class ClientePessoaFisica implements Serializable {
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
    private String cpf;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    private String rg;
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    @Column (name="data_de_nascimento")
   private Date data_de_nascimento;
    public Date getData_de_nascimento() {
        return data_de_nascimento;
    }
    public void setData_de_nascimento(Date data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }
    //@Column(name"cliente_id")
    //@MapsId
    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;




}
