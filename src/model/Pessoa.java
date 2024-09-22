package model;

import java.util.Date;

public class Pessoa {
    private int id;
    private String email;
    private String nome;
    private Date dataDeNascimento;
    private String endereco;
    private String telefone;
    private String cpf;
    private String cep;

    public Pessoa(int id, String email, String nome, Date dataDeNascimento, String endereco, String telefone, String cpf, String cep) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cep = cep;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCep() {
        return cep;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    public void atualizarInfo() {

    }

    public void registrarAnimal() {

    }
}
