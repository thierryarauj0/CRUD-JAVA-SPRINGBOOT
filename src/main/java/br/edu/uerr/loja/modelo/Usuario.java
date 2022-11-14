
package br.edu.uerr.loja.modelo;
import java.io.Serializable;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   
   private long id;
   @Column( unique = true,length = 50)
   private String login;
   @Column (length = 50)
   private String senha;
   private String nome;
   private long empresa_id;
   private long nivel_de_acesso_id;
   private String conta;
   private String telefone;
   private String email;
   private String rg;
   private String cpf;
   private String data_nascimento;


public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
public String getLogin() {
    return login;
}
public void setLogin(String login) {
    this.login = login;
}
public String getSenha() {
    return senha;
}
public void setSenha(String senha) {
    this.senha = senha;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public long getEmpresa_id() {
    return empresa_id;
}
public void setEmpresa_id(long empresa_id) {
    this.empresa_id = empresa_id;
}
public long getNivel_de_acesso_id() {
    return nivel_de_acesso_id;
}
public void setNivel_de_acesso_id(long nivel_de_acesso_id) {
    this.nivel_de_acesso_id = nivel_de_acesso_id;
}
public String getConta() {
    return conta;
}
public void setConta(String conta) {
    this.conta = conta;
}
public String getTelefone() {
    return telefone;
}
public void setTelefone(String telefone) {
    this.telefone = telefone;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getRg() {
    return rg;
}
public void setRg(String rg) {
    this.rg = rg;
}
public String getCpf() {
    return cpf;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}
public String getData_nascimento() {
    return data_nascimento;
}
public void setData_nascimento(String data_nascimento) {
    this.data_nascimento = data_nascimento;
}
    }