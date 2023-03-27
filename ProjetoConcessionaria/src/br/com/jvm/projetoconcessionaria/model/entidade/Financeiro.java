package br.com.jvm.projetoconcessionaria.model.entidade;

public class Financeiro {

	private String formapagamento;
	private String datacompra;
	private float valor;

	public Financeiro() {

	}

	public Financeiro(String formapagamento, String datacompra, float valor) {

		this.formapagamento = formapagamento;
		this.datacompra = datacompra;
		this.valor = valor;
	}

	public String getFormapagamento() {
		return formapagamento;
	}

	public void setFormapagamento(String formapagamento) {
		this.formapagamento = formapagamento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDatacompra() {
		return datacompra;
	}

	public void setDatacompra(String datacompra) {
		this.datacompra = datacompra;
	}

}
