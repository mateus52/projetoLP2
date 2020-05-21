package entity;

import java.util.Date;

import enums.Funcao;

public class Funcionario extends Pessoa {
	private String matricula;
	private String senha;
	private Funcao funcao;
	
	public Funcionario(String nome, Date dataNasc, String matrcula, String senha, Funcao funcao) {
		super(nome, dataNasc);
		this.matricula = matrcula;
		this.senha = senha;
		this.funcao = funcao;
	}
	
	public void alterarSenha(Funcionario F, String senhaAtual) {
		
	}

	public boolean logarFuncionario(String matricula, String senha) {
		return true;
	}
	
	public void menuRelatorios(Funcao funcao) {
		
	}
	
	private String gerarSenha() {
		return senha;
		
	}
	
	private Date gerarRelatoriosVendas(Date inicio, Date fim) {
		return null;
		
	}
	
	private String gerarProjecaoVendas() {
		return null;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatrcula(String matrcula) {
		this.matricula = matrcula;
	}

	public String getSenha() {
		return senha;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}
}
