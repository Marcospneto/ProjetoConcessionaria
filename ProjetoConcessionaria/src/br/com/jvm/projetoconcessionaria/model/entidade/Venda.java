package br.com.jvm.projetoconcessionaria.model.entidade;

public class Venda extends Financeiro {

	public Cliente cliente;
	public String datavenda;
	public Veiculo veiculo;
	public String formapagamento;

	public Venda() {

	}

	public Venda(String consorcio, String financiamento, String formapagamento, String datacompra, float valor,
			Cliente cliente, String datavenda, Veiculo veiculo, String pagamento) {
		super(formapagamento, datacompra, valor);
		this.cliente = cliente;
		this.datavenda = datavenda;
		this.veiculo = veiculo;
		this.formapagamento = pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDatavenda() {
		return datavenda;
	}

	public void setDatavenda(String datavenda) {
		this.datavenda = datavenda;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getPagamento() {
		return formapagamento;
	}

	public void setPagamento(String pagamento) {
		this.formapagamento = pagamento;
	}

}
