package entidades;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private Integer codigo;
	private String nomeProduto;
	private Float valorProduto;
	private Integer quantidadeAtual;
	private Integer quantidadeMinima;

	List<Produto> lista = new ArrayList<>();
	List<String> nomes = new ArrayList<>();

	public Produto() {

	}

	public Produto(Integer codigo, String nomeProduto, Float valorProduto, Integer quantidadeAtual,
			Integer quantidadeMinima) {
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.quantidadeAtual = quantidadeAtual;
		this.quantidadeMinima = quantidadeMinima;

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Float getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Float valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Integer getQuantidadeAtual() {
		return quantidadeAtual;
	}

	public void setQuantidadeAtual(Integer quantidadeAtual) {
		this.quantidadeAtual = quantidadeAtual;
	}

	public Integer getQuantidadeMinima() {
		return quantidadeMinima;
	}

	public void setQuantidadeMinima(Integer quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}

	public String removeProd(String exc) {
		for (int i = 0; i < lista.size(); i++) { // for para verificar todas as posicoes da lista
			if (nomes.get(i).equalsIgnoreCase(exc)) { // lendo cada posicao i e comparando com a variavel exc
				lista.remove(i); // removendo o item da posicao i
			}
		}
		return "Produto removido!";
	}

	public void localizaProd(String busca) {
		for (int i = 0; i < lista.size(); i++) { // For para veriicar todas as posicoes da lista
			if (nomes.get(i).equalsIgnoreCase(busca)) { // lendo cada posicao i e comparando(ignorando upper/lower case)
														// com a variavel busca
				System.out.printf("Posicao %d \n", i + 1); // retornando a posicao
			}
		}
	}

	@Override
	public String toString() {
		return nomeProduto;
	}
}