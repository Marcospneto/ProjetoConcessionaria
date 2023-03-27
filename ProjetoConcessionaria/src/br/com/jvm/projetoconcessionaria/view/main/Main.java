package br.com.jvm.projetoconcessionaria.view.main;

import java.util.List;
import java.util.Scanner;

import br.com.jvm.projetoconcessionaria.model.entidade.Cliente;

import br.com.jvm.projetoconcessionaria.model.entidade.Veiculo;
import br.com.jvm.projetoconcessionaria.model.repositorio.ClienteRepositorio;

import br.com.jvm.projetoconcessionaria.model.repositorio.VeiculoRepositorio;
import br.com.jvm.projetoconcessionaria.model.servico.ClienteServico;
import br.com.jvm.projetoconcessionaria.model.servico.VeiculoServico;

public class Main {
	private static boolean comeco = true;
	private static Scanner scan;
	private static ClienteServico clienteservico = new ClienteServico();
	private static VeiculoServico veiculoservico = new VeiculoServico();

	public static void main(String[] args) {

		apresentacao();
		while (true) {
			if (comeco == false) {
				break;
			}
			cod();
		}

	}

	// APRESENTAÇÃO COM OS RESPONSAVEIS PELO SISTEMA
	public static void apresentacao() {
		System.out.println("**************************************************************************");
		System.out.println("************************Responsáveis pelo sistema*************************");
		System.out.println();
		System.out.println("João Eduardo Rodrigues de Aguiar");
		System.out.println("Victor Vinicius Challegre");
		System.out.println("Marcos Pereira da Silva Neto");
		System.out.println();
		System.out.println("**************************************************************************");

	}

	// METODO QUE ABRE O PROGRAMA, A PARTE DE INTERAÇÃO COM O USUARIO

	public static String menu() {

		scan = new Scanner(System.in);
		String opcao;

		System.out.println("**************************************************************************");
		System.out.println("*                       BEM VINDO AO JVM MOTORS                          *");
		System.out.println();
		System.out.println("**************************************************************************");
		System.out.println("*                DIGITE O NUMERO DA OPÇÃO DESEJADA                       *");
		System.out.println("**************************************************************************");
		System.out.println("*                        1 - Cliente                                     *");
		System.out.println("*                        2 - Veiculos                                    *");
		System.out.println("*                        3 - Vendas                                      *");
		System.out.println("*                        4 - Exit                                        *");
		System.out.println("**************************************************************************");
		System.out.print("->");
		opcao = scan.nextLine();

		return opcao;

	}

	// METODO ONDE ESTÁ TODO O CODIGO
	public static String cod() {

		switch (menu()) {
		// CHAMO O METODO MENU NO SWITCH CASE, ONDE O USUARIO ESCOLHE SE QUER SE
		// CADASTRAR OU VER A LISTA DE VEICULOS

		case "1":

			String opcao;
			System.out.println("**************************************************************************");
			System.out.println("*                DIGITE O NUMERO DA OPÇÃO DESEJADA                       *");
			System.out.println("**************************************************************************");
			System.out.println("*                        1 - Salvar Cliente                              *");
			System.out.println("*                        2 - Deletar Cliente                             *");
			System.out.println("*                        3 - Listar Cliente                              *");
			System.out.println("*                        4 - Alterar Cliente                             *");
			System.out.println("**************************************************************************");
			System.out.print("->");
			opcao = scan.nextLine();

			if (opcao.equals("1")) {

				Cliente cliente = new Cliente();
				System.out.println("***********************************************************************");
				System.out.println("*                         Salvar Cliente                              *");
				System.out.println("***********************************************************************");
				System.out.println("Nome: ");
				System.out.print("->");
				String name = scan.nextLine();
				cliente.setName(name);
				System.out.println("Documento: ");
				System.out.println("->");
				String documento = scan.nextLine();
				cliente.setDocumento(documento);
				System.out.println("Endereço: ");
				System.out.println("->");
				String endereco = scan.nextLine();
				cliente.setEndereco(endereco);
				System.out.println("Sexo :Digite >M< para masculino ou >F< para feminino ");
				System.out.println("->");
				String sexo = scan.nextLine();
				cliente.setSexo(sexo);
				System.out.println("Email: ");
				System.out.println("->");
				String email = scan.nextLine();
				cliente.setEmail(email);
				System.out.println("Renda Atual: ");
				System.out.println("->");
				float renda = scan.nextFloat();
				cliente.setRenda(renda);

				clienteservico.salvarCliente(cliente);

			}

			else if (opcao.equals("2")) {
				System.out.println("***********************************************************************");
				System.out.println("*                        Deletar Cliente                              *");
				System.out.println("***********************************************************************");
				System.out.println("*            Para deletar o cliente digite o documento                *");
				System.out.println("->");
				String documento = scan.nextLine();
				clienteservico.deletarCliente(documento);

			}

			else if (opcao.equals("3")) {
				System.out.println("***********************************************************************");
				System.out.println("*                          Listar Cliente                             *");
				System.out.println("***********************************************************************");

				List<Cliente> listaCliente = clienteservico.listarCliente();

			}

			else if (opcao.equals("4")) {
				System.out.println("***********************************************************************");
				System.out.println("*                         Alterar Cliente                             *");
				System.out.println("***********************************************************************");
				System.out.println("*             Digite o documento do cliente para alterar              *");
				String documento = scan.nextLine();

				if (clienteservico.buscarCliente(documento)) {

					Cliente novoCliente = new Cliente();
					System.out.println("Nome: ");
					System.out.print("->");
					String name = scan.nextLine();
					novoCliente.setName(name);
					System.out.println("Documento: ");
					System.out.println("->");
					String novoDocumento = scan.nextLine();
					novoCliente.setDocumento(novoDocumento);
					System.out.println("Endereço: ");
					System.out.println("->");
					String endereco = scan.nextLine();
					novoCliente.setEndereco(endereco);
					System.out.println("Sexo :Digite >M< para masculino ou >F< para feminino ");
					System.out.println("->");
					String sexo = scan.nextLine();
					novoCliente.setSexo(sexo);
					System.out.println("Email: ");
					System.out.println("->");
					String email = scan.nextLine();
					novoCliente.setEmail(email);
					System.out.println("Renda Atual: ");
					System.out.println("->");
					float renda = scan.nextFloat();
					novoCliente.setRenda(renda);

					if (clienteservico.alterarCliente(documento, novoCliente)) {

					} else {
						System.out.println("Erro ao Alterar Cliente");
					}

				}
			}

			return opcao;

		case "2":

			String opcao2;
			System.out.println("**************************************************************************");
			System.out.println("*                DIGITE O NUMERO DA OPÇÃO DESEJADA                       *");
			System.out.println("**************************************************************************");
			System.out.println("*                        1 - Salvar Veiculo                              *");
			System.out.println("*                        2 - Deletar Veiculo                             *");
			System.out.println("*                        3 - Listar Veiculo                              *");
			System.out.println("*                        4 - Alterar Veiculo                             *");
			System.out.println("**************************************************************************");
			System.out.print("->");
			opcao2 = scan.nextLine();

			if (opcao2.equals("1")) {

				Veiculo veiculo = new Veiculo();
				System.out.println("***********************************************************************");
				System.out.println("*                         Salvar Veiculo                              *");
				System.out.println("***********************************************************************");

				System.out.println("Marca: ");
				System.out.println("->");
				String marca = scan.nextLine();
				veiculo.setMarca(marca);
				System.out.println("Modelo: ");
				System.out.println("->");
				String modelo = scan.nextLine();
				veiculo.setModelo(modelo);
				System.out.println("Ano: ");
				System.out.println("->");
				String ano = scan.nextLine();
				veiculo.setAno(ano);
				System.out.println("Cor: ");
				System.out.println("->");
				String cor = scan.nextLine();
				veiculo.setCor(cor);
				System.out.println("Valor: ");
				System.out.println("->");
				float valor = scan.nextFloat();
				veiculo.setValor(valor);

				veiculoservico.salvarVeiculo(veiculo);

			} else if (opcao2.equals("2")) {
				System.out.println("***********************************************************************");
				System.out.println("*                        Deletar Veiculo                              *");
				System.out.println("***********************************************************************");
				System.out.println("*            Para deletar o veiculo digite o modelo                   *");
				System.out.println("->");
				String modelo = scan.nextLine();
				veiculoservico.deletarVeiculo(modelo);

			}

			else if (opcao2.equals("3")) {
				System.out.println("***********************************************************************");
				System.out.println("*                          Listar Veiculo                             *");
				System.out.println("***********************************************************************");

				List<Veiculo> listaVeiculo = veiculoservico.listarVeiculo();

			}

			else if (opcao2.equals("4")) {
				System.out.println("***********************************************************************");
				System.out.println("*                         Alterar Veiculo                             *");
				System.out.println("***********************************************************************");
				System.out.println("*             Digite o modelo do veiculo para alterar                 *");
				String modelo = scan.nextLine();

				if (veiculoservico.buscarVeiculo(modelo)) {

					Veiculo novoVeiculo = new Veiculo();
					System.out.println("Marca: ");
					System.out.print("->");
					String marca = scan.nextLine();
					novoVeiculo.setMarca(marca);
					System.out.println("Modelo: ");
					System.out.println("->");
					String novoModelo = scan.nextLine();
					novoVeiculo.setModelo(novoModelo);
					System.out.println("Ano: ");
					System.out.println("->");
					String ano = scan.nextLine();
					novoVeiculo.setAno(ano);
					System.out.println("Cor: ");
					System.out.println("->");
					String cor = scan.nextLine();
					novoVeiculo.setCor(cor);
					System.out.println("Valor: ");
					System.out.println("->");
					float valor = scan.nextFloat();
					novoVeiculo.setValor(valor);

					if (veiculoservico.alterarVeiculo(modelo, novoVeiculo)) {

					} else {
						System.out.println("Erro ao Alterar Veiculo");
					}

				}
			}
			return opcao2;

		case "3":

			System.out.println("***********************************************************************");
			System.out.println("************************* MARCAS DÍSPONIVEIS **************************");
			System.out.println("***********************************************************************");
			veiculoservico.listarVeiculo();

		case "4":
			comeco = false;
			System.out.println("ENCERRANDO O PROGRAMA...");
			break;

		default:
			System.out.println("OPÇÂO INVÁLIDA!");
		}
		return null;

	}

}
			

