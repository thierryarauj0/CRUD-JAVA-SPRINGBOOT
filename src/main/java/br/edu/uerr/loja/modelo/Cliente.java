package br.edu.uerr.loja.modelo;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
    private static final long serialVersionUID =1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Integer id;
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
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
private String cep;
public String getCep() {
    return cep;
}
public void setCep(String cep) {
    this.cep = cep;
}
private String logradouro;
public String getLogradouro() {
    return logradouro;
}
public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
}
@Column(name="numero_endereco")
private String numeroEndereco;
private String bairro;
public String getBairro() {
    return bairro;
}
public void setBairro(String bairro) {
    this.bairro = bairro;
}
private String cidade;
public String getCidade() {
    return cidade;
}
public void setCidade(String cidade) {
    this.cidade = cidade;
}
private String uf;
public String getUf() {
    return uf;
}
public void setUf(String uf) {
    this.uf = uf;
}
@Column(name="tipo_cliente")
private Integer tipoCliente;   









}
