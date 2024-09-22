package model;

import java.util.Date;

public class Cliente extends Pessoa {
    private Pet pet;

    public Cliente(int id, String email, String nome, Date dataDeNascimento, String endereco, String telefone, String cpf, String cep, Pet pet) {
        super(id, email, nome, dataDeNascimento, endereco, telefone, cpf, cep);
        this.pet = pet;
    }

    public int getId(){
        return super.getId();
    }

    public String getNome() {
        return super.getNome();
    }

    public String getEndereco() {
        return super.getEndereco();
    }

    public String getTelefone() {
        return super.getTelefone();
    }

    public String getCep() {
        return super.getCep();
    }

    public String getEmail() {
        return super.getEmail();
    }

    public void setEmail(String email){
        if (!email.equals("")) {
            super.setEmail(email);
        }
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }

    public void setTelefone(String telefone) {
        super.setTelefone(telefone);
    }

    public void setCep(String cep) {
        super.setCep(cep);
    }

    @Override
    public String toString() {        
        String desc = "Cliente{" + "nome=" + getNome() + ", endereco=" + getEndereco() + ", cep=" + getCep() + ", email=" + getEmail() + ", telefone=" + getTelefone() + '}';
        return desc;
    }

    public void atualizarInfo() {

    }

    public void registrarAnimal() {

    }
}
