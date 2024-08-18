package agenda;

import java.io.Serializable;

public class Contato implements Serializable {
	private String nome;
	private String endereco;
	private String telefone;
	private static int totalContato=0;//Pertence somente a classe
	
	//construtor
	public Contato(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		totalContato++;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	//Getters e Setters
	public static int getTotalContato() {
		return totalContato;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public static void setTotalContato(int totalContato) {
		Contato.totalContato = totalContato;
	}	
}	
	

