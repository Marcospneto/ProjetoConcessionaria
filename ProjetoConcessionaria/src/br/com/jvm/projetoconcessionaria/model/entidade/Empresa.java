package br.com.jvm.projetoconcessionaria.model.entidade;

public class Empresa {

	private String nomefantasia;
	private String razaosocial;
	private String cnpj;
	private String agencia;
	private String numeroconta;
	private String telefone;

	public Empresa() {

	}

	public Empresa(String nomefantasia, String razaosocial, String cnpj, String agencia, String numeroconta,
			String telefone) {

		this.nomefantasia = nomefantasia;
		this.razaosocial = razaosocial;
		this.cnpj = cnpj;
		this.agencia = agencia;
		this.numeroconta = numeroconta;
		this.telefone = telefone;

	}

	public String getNomefantasia() {
		return nomefantasia;
	}

	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(String numeroconta) {
		this.numeroconta = numeroconta;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
