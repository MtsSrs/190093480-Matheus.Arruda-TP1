package application;

import java.util.ArrayList;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int caseSelect = 0;

		// ArrayLists Utilizadas e alguns itens já arquivados para facilitar teste!
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Mago");
		nomes.add("Paladino");
		nomes.add("Ladino");
		nomes.add("Monge");
		nomes.add("Feiticeiro");
		nomes.add("Caçador");
		nomes.add("Shaman");
		nomes.add("Necromancer");
		nomes.add("Guarda Real");
		nomes.add("Arce Bispo");

		ArrayList<String> local = new ArrayList<>();
		local.add("Summoner's Rift");
		local.add("Skyrim");
		local.add("Mojave");
		local.add("Estrela da Morte");
		local.add("Anor Londor");
		local.add("Majula");
		local.add("Blighttown");
		local.add("Geffenia");
		local.add("FGA");
		local.add("Prontera");

		ArrayList<String> tel = new ArrayList<>();
		tel.add("111111111");
		tel.add("222222222");
		tel.add("333333333");
		tel.add("444444444");
		tel.add("555555555");
		tel.add("666666666");
		tel.add("777777777");
		tel.add("888888888");
		tel.add("999999999");
		tel.add("000000000");

		ArrayList<String> nomeProduto = new ArrayList<>();
		nomeProduto.add("Cajado");
		nomeProduto.add("Escudo Real");
		nomeProduto.add("Adagas");
		nomeProduto.add("Luvas");
		nomeProduto.add("Varinha");
		nomeProduto.add("Arco e Flecha");
		nomeProduto.add("Martelo");
		nomeProduto.add("Cetro");
		nomeProduto.add("Espada");
		nomeProduto.add("Biblia Sagrada");

		ArrayList<String> descricaoProduto = new ArrayList<>();
		descricaoProduto.add("Leve e pratico");
		descricaoProduto.add("Resistente");
		descricaoProduto.add("leves e rapidas");
		descricaoProduto.add("Resistentes a impactos");
		descricaoProduto.add("So para feiticeiros");
		descricaoProduto.add("Melhor que o do Robin Hood");
		descricaoProduto.add("Pesado");
		descricaoProduto.add("So para necromancers");
		descricaoProduto.add("Espada padrao");
		descricaoProduto.add("Abencoada pelo papa");

		ArrayList<String> valorDeCompra = new ArrayList<>();
		valorDeCompra.add("200");
		valorDeCompra.add("300");
		valorDeCompra.add("550");
		valorDeCompra.add("720");
		valorDeCompra.add("810");
		valorDeCompra.add("530");
		valorDeCompra.add("220");
		valorDeCompra.add("660");
		valorDeCompra.add("500");
		valorDeCompra.add("900");

		ArrayList<String> porcentagemLucro = new ArrayList<>();
		porcentagemLucro.add("22");
		porcentagemLucro.add("34");
		porcentagemLucro.add("10");
		porcentagemLucro.add("5");
		porcentagemLucro.add("2");
		porcentagemLucro.add("7");
		porcentagemLucro.add("12");
		porcentagemLucro.add("40");
		porcentagemLucro.add("8");
		porcentagemLucro.add("3");

		ArrayList<Integer> quantidadeEstoque = new ArrayList<>();
		quantidadeEstoque.add(1);
		quantidadeEstoque.add(2);
		quantidadeEstoque.add(3);
		quantidadeEstoque.add(4);
		quantidadeEstoque.add(5);
		quantidadeEstoque.add(6);
		quantidadeEstoque.add(7);
		quantidadeEstoque.add(8);
		quantidadeEstoque.add(9);
		quantidadeEstoque.add(10);

		do {

			menuInicial();
			caseSelect = sc.nextInt();
			sc.nextLine();
			switch (caseSelect) {

			// Caso 1: Cadastro de Cliente;
			case 1:
				// Lê quantidade de clientes
				System.out.println("Digite a quantidade de clientes que serão cadastrados:");
				int var1 = sc.nextInt();
				sc.nextLine();

				// Laço para ler dados e adicionar a ArrayList
				for (int aux = 0; aux < var1; aux++) {
					// Lê o nome do cliente
					System.out.println("Digite o nome do cliente Nº." + aux);
					String person = sc.nextLine();
					// Lê o endereço do cliente
					System.out.println("Digite Endereço do cliente Nº." + aux);
					String address = sc.nextLine();
					// Lê o telefone do cliente
					System.out.println("Digite o Telefone do cliente Nº." + aux);
					String number = sc.nextLine();
					// Aloca os dados em suas respectivas Arrays;
					nomes.add(person);
					local.add(address);
					tel.add(number);
				}
				System.out.println("\nOperação Concluida!\n");
				break;

			// Caso 2 : Busca de Cliente
			case 2:
				System.out.println("Digite o nome do cliente desejado");
				String searchClient = sc.nextLine();
				if (nomes.contains(searchClient)) {

					// buscando a indexação do cliente
					int position = nomes.indexOf(searchClient);
					System.out.println("\nCliente encontrado:");
					System.out.println("Nome: " + nomes.get(position) + ';' + " Endereço: " + local.get(position) + ';'
							+ " Telefone: " + tel.get(position) + '\n');
					// Alterações nos dados
					System.out.println(
							"Deseja fazer alterações nos dados do cliente cadastrado? Digite (Y) - Sim/ (N) - Não");
					char ans = sc.next().charAt(0);
					sc.nextLine();

					// Pergunta para o usuário
					if (ans == 'Y') {
						System.out.println("===> Altere os dados do cliente <===");
						System.out.println("Digite o novo nome do cliente:");
						String person = sc.nextLine();
						System.out.println("Digite o novo endereço do cliente:");
						String address = sc.nextLine();
						System.out.println("Digite o novo telefone do cliente:");
						String number = sc.nextLine();

						nomes.set(position, person);
						local.set(position, address);
						tel.set(position, number);

						System.out.println("\nOperação Concluida!\n");
					} else {
						System.out.println("\nRetornando ao Menu!\n");
						break;
					}
				} else {
					System.out.println("\nCliente não encontrado!\n");
				}
				break;

			// Cadastro de produto
			case 3:
				System.out.println("Digite a quantidade de itens que serão cadastrados");
				int quant = sc.nextInt();
				sc.nextLine();

				for (int aux = 0; aux < quant; aux++) {
					System.out.println("Digite o nome do produto: ");
					String nomeProd = sc.nextLine();
					nomeProduto.add(nomeProd);

					System.out.println("Digite a descrição do produto: ");
					String descProd = sc.nextLine();
					descricaoProduto.add(descProd);

					System.out.println("Digite o valor do produto: ");
					String valor = sc.nextLine();
					valorDeCompra.add(valor);

					System.out.println("Digite a porcentagem de lucro: ");
					String porcent = sc.nextLine();
					porcentagemLucro.add(porcent);

					System.out.println("Digite a quantidade em estoque: ");
					int qtdEstoque = sc.nextInt();
					quantidadeEstoque.add(qtdEstoque);
				}
				System.out.println("\nOperação concluida\n");
				break;

			// Busca Produto
			case 4:
				System.out.println("Digite o nome do produto desejado: ");
				String searchProduct = sc.nextLine();
				if (nomeProduto.contains(searchProduct)) {
					int position = nomeProduto.indexOf(searchProduct);
					System.out.println("\nProduto encontrado:");
					System.out.println("Nome: " + nomeProduto.get(position) + "\nDescrição: "
							+ descricaoProduto.get(position) + "\nValor R$: " + valorDeCompra.get(position)
							+ "\nPorcentagem Lucro: " + porcentagemLucro.get(position) + '%'  + "\nQuantidade no Estoque: "
							+ quantidadeEstoque.get(position) + '\n');
					// Alterações nos dados
					System.out.println(
							"Deseja fazer alterações nos dados do Produto cadastrado? Digite (Y) - Sim/ (N) - Não");
					char ans = sc.next().charAt(0);
					sc.nextLine();
					if (ans == 'Y') {
						System.out.println("===> Altere os dados do produto <===");

						System.out.println("Digite o novo nome do produto: ");
						String product = sc.nextLine();
						nomeProduto.set(position, product);
						System.out.println("Digite a nova descrição do produto: ");
						String descri = sc.nextLine();
						descricaoProduto.set(position, descri);
						System.out.println("Digite o novo valor do produto: ");
						String valor = sc.nextLine();
						valorDeCompra.set(position, valor);
						System.out.println("Digite a nova porcentagem do produto: ");
						String porcent = sc.nextLine();
						porcentagemLucro.set(position, porcent);
						System.out.println("Digite a nova quantidade de produtos no estoque: ");
						int qtdEstoque = sc.nextInt();
						quantidadeEstoque.set(position, qtdEstoque);

						System.out.println("\nOperação Concluida!\n");
					} else {
						System.out.println("\nRetornando ao menu!\n");
						break;
					}
				} else {
					System.out.println("\nProduto não encontrado!\n");
				}
				break;

			// Cadastro de venda
			case 5:
				char x;
				int estoque, ans2, ans3, ans4;
				for (int i = 0; i < nomes.size(); i++) {
					System.out.print(i + " - ");
					System.out.println(nomes.get(i) + '\n');
				}
				System.out.println("Selecione o código de um dos clientes: ");
				ans2 = sc.nextInt();
				sc.nextLine();

				do {
					for (int i = 0; i < nomeProduto.size(); i++) {
						System.out.print(i + " - ");
						System.out.println(nomeProduto.get(i) + '\n');
					}
					System.out.println("Selecione o código de um produto: ");
					ans3 = sc.nextInt();
					sc.nextLine();
					System.out.println(
							"Digite a quantas unidades do item " + nomeProduto.get(ans3) + " vendidas ao cliente: Nº" + ans2 + "-" + nomes.get(ans2));
					ans4 = sc.nextInt();

					estoque = quantidadeEstoque.get(ans3) - ans4;
					if (estoque < 0) {
						System.out.println("Desculpa, não foi possivel realizar a compra\nMotivo: Não há bastante no Estoque!\n");
						System.out.println("Estoque atual do produto: "+ nomeProduto.get(ans3) + " - " + quantidadeEstoque.get(ans3) + "un.");
						System.out.println("Deseja adicionar mais algum produto a compra? Sim (Y) / Não (N)");
						x = sc.next().charAt(0);
					} else {
						System.out.println("Deseja adicionar mais algum produto a compra? Sim (Y) / Não (N)");
						x = sc.next().charAt(0);
						quantidadeEstoque.set(ans3, estoque);
					}
				
				} while (x == 'Y');
				break;

			case 6:
				for (int i = 0; i < nomeProduto.size(); i++) {
					System.out.print(i + " - ");
					System.out.println(nomeProduto.get(i) + " - " + quantidadeEstoque.get(i) + "un.\n");
				}
				break;

			// Sair do programa
			case 7:
				System.out.println("\n====================>Obrigado pela visita, volte sempre!<====================\n");
				break;
				
			default:
				System.out.println("Operação inválida");
				break;
			}
		} while (caseSelect != 7);

		sc.close();
	}

	public static void menuInicial() {
		System.out.println("Escolha uma opção\n" + "1.Cadastro de novo Cliente\n" + "2.Busca por cliente\n"
				+ "3.Cadastro de novo produto\n" + "4.Busca por produto\n" + "5.Cadastro de venda\n"
				+ "6.Mostrar produtos em estoque\n" + "7.Sair ");
	}

}