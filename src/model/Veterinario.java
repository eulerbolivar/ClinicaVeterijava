package model;

import java.util.Date;

public class Veterinario extends Funcionario {
    public Veterinario(int id, String email, String nome, Date dataDeNascimento, String endereco, String telefone, String cpf, String cep) {
		super(id, email, nome, dataDeNascimento, endereco, telefone, cpf, cep);
	}

	private String crmv;

    public void atualizarInfo() {

    }

    public void registrarAnimal() {

    }

}
