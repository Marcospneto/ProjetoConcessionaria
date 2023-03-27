package br.com.jvm.projetoconcessionaria.model.entidade;

public class Cliente extends Pessoa {

	private String datacadastro;
	private String email;
	private String situacao;
	private float renda;

	// Construtor sem parametro e com parametro

	public Cliente() {

	}

	public Cliente(String datacadastro, String email, String situacao, float renda, String name, String documento,
			String endereco, String sexo, String tipo) {
		super(name, documento, endereco, sexo, tipo);

		this.datacadastro = datacadastro;
		this.email = email;
		this.situacao = situacao;
		this.renda = renda;
	}

	public String getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(String datacadastro) {
		this.datacadastro = datacadastro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		this.renda = renda;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getName() + "\n" + "Documento: " + this.getDocumento() + "\n" + "Endereço: "
				+ this.getEndereco() + "\n" + "Sexo: " + this.getSexo() + "\n" + "Email: " + this.getEmail() + "\n"
				+ "Renda Mensal: " + this.getRenda() + "\n";

	}

}
