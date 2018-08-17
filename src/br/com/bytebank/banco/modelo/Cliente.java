package br.com.bytebank.banco.modelo;

/**
 * 
 * Classe que representa um cliente do bytebank
 * 
 * @author Gisele
 *@version 0.1
 */
public class Cliente {
	
	private String nome;
	private String cpf;
	private String profissão;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissão() {
		return profissão;
	}
	
	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}

}
