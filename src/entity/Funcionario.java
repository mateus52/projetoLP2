package entity;

public class Funcionario {
	
	private String matrcula;
	private String senha;
	private Funcao funcao;
	
	public void alterarSenha(Funcionario F, String senhaAtual) {
		
	}
	
	public boolean logarFuncionario(String matricula, String senha) {
		return true;
	}
	
	public void menuRelatorios(Funcao funcao) {
		
	}
	
	private String gerarSenha() {
		
	}
	
	private Date gerarRelatoriosVendas(Date inicio, Date fim) {
		
	}
	
	private String gerarProjecaoVendas() {
		
	}

	public String getMatrcula() {
		return matrcula;
	}

	public void setMatrcula(String matrcula) {
		this.matrcula = matrcula;
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
