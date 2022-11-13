
package br.edu.uerr.loja.modelo;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




    @Entity
    @Table(name="usuario") 
    public class Usuario implements Serializable {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    
    private long id;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private Integer empresa_id;
    public Integer getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Integer empresa_id) {
        this.empresa_id = empresa_id;
    }

    private Integer nivel_acesso_id;
    public Integer getNivel_acesso_id() {
        return nivel_acesso_id;
    }

    public void setNivel_acesso_id(Integer nivel_acesso_id) {
        this.nivel_acesso_id = nivel_acesso_id;
    }

    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String telefone;
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private String email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String rg;
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Column (name="data_de_nascimento")
    private Date data_de_nascimento;

    
    private String login;
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){

        this.login = login;

    }

    private String senha;

    public String getSenha(){

        return senha;

    }

    public void setSenha(String senha){
        
        this.senha=senha;

    }
   
} 








