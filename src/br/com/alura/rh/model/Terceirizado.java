package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

	private String nomeEmpresaTerceira;
	private DadosPessoais dadosPessoais; 
	
	public Terceirizado (String nomeEmpresaTerceira, String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nomeEmpresaTerceira = nomeEmpresaTerceira;
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}
	
	
}
