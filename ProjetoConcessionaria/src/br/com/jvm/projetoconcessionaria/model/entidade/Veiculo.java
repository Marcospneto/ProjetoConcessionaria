package br.com.jvm.projetoconcessionaria.model.entidade;

public class Veiculo {

	private String marca;
	private String modelo;
	private String ano;
	private String cor;
	private float valor;

	public Veiculo() {

	}

	public Veiculo(String marca, String modelo, String ano, String cor, float valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Marca: " + this.getMarca() + "\n" + "Modelo: " + this.getModelo() + "\n" + "Ano: " + this.getAno()
				+ "\n" + "Cor: " + this.getCor() + "\n" + "Valor: " + this.getValor() + "\n";
	}

}
