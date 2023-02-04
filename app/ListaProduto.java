package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;

public class ListaProduto {
	public static void menu() {
		System.out.println("--------------------------------");
		System.out.println("|      ESCOLHA UMA OPCAO       |");
		System.out.println("================================");
		System.out.println("|   1. Inserir no inicio       |");
		System.out.println("|   2. Inserir no final        |");
		System.out.println("|   3. Localizar Produto       |");
		System.out.println("|   4. Excluir Produto         |");
		System.out.println("|   5. Imprimir Lista          |");
		System.out.println("|   6. Quantidade de Produto   |");
		System.out.println("|   7. Sair                    |");
		System.out.println("--------------------------------");
	}

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in); // Scanner para leitura de arquivos
		menu();
		int codigo = 0; // Iniciando variáveis
		String nome; // Iniciando variáveis
		float valor = 0; // Iniciando variáveis
		int quantidade = 0; // Iniciando variáveis
		int quantidadeM = 0; // Iniciando variáveis

		List<Produto> lista = new ArrayList<>(); // Criando lista linkada a classe Produto
		List<String> nomes = new ArrayList<>(); // Criando lista independente para nomes

		int resp = num.nextInt();
		do {
			switch (resp) {
			case 1:
				do {
					System.out.print("Insira o codigo do produto: ");
					codigo = num.nextInt();
					System.out.print("Insira o nome do produto: ");
					nome = num.next(); // Recebendo valor nome
					System.out.print("Insira o valor do produto: ");
					valor = num.nextFloat();
					System.out.print("Insira a quantidade de produtos: ");
					quantidade = num.nextInt();
					System.out.print("Insira a quantidade minima: ");
					quantidadeM = num.nextInt();
					Produto prod = new Produto(codigo, nome, valor, quantidade, quantidadeM); // Enviando dados das
																								// variaveis para a
																								// lista Produto
					nomes.add(0, nome); // Adicionando variavel nome ao primeiro lugar na lista nomes
					lista.add(0, prod); // Adicionando bloco de variaveis "prod" a primeira posicao da lista
					resp = 0; // igualando resp a 0 para retornar ao menu
				} while (resp == 1);
				break;
			case 2:
				do {
					System.out.print("Insira o codigo do produto: ");
					codigo = num.nextInt();
					System.out.print("Insira o nome do produto: ");
					nome = num.next(); // Recebendo valor nome
					System.out.print("Insira o valor do produto: ");
					valor = num.nextFloat();
					System.out.print("Insira a quantidade de produtos: ");
					quantidade = num.nextInt();
					System.out.print("Insira a quantidade minima: ");
					quantidadeM = num.nextInt();

					Produto prod = new Produto(codigo, nome, valor, quantidade, quantidadeM);
					nomes.add(lista.size(), nome);
					lista.add(lista.size(), prod);
					resp = 0;
				} while (resp == 2);
				break;
			case 3:
				System.out.print("Insira o nome do produto que deseja localizar: ");
				String busca = num.next();
				for (int i = 0; i < lista.size(); i++) { // For para veriicar todas as posicoes da lista
					if (nomes.get(i).equalsIgnoreCase(busca)) { // lendo cada posicao i e comparando(ignorando
																// upper/lower case) com a variavel busca
						System.out.printf("Posicao %d \n", i + 1); // retornando a posicao
					}
				}
				break;
			case 4:
				System.out.print("Insira o nome do produto que deseja excluir: ");
				String exc = num.next();
				for (int i = 0; i < lista.size(); i++) { // for para verificar todas as posicoes da lista
					if (nomes.get(i).equalsIgnoreCase(exc)) { // lendo cada posicao i e comparando com a variavel exc
						lista.remove(i); // removendo o item da posicao i
					}
				}

				break;
			case 5:
				for (Produto x : lista) { // para cada produto X na lista
					System.out.println(x); // printar x
				}
				break;
			case 6:
				System.out.println("A quantidade de produtos atual é: " + lista.size());
				break;
			}
			menu();
			resp = num.nextInt();
		} while (resp != 7);
		System.exit(0);
		num.close();
	}
}