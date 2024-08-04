package collections.list.operacoesBasicas.desafio;


import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List <Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	private void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item (nome, preco, quantidade));

	}
	public void removerItem(String nomeRemover) {
		List itensParaRemover = new ArrayList<>();
		
		for (Item i : itemList) {
			if(i.getNome().equalsIgnoreCase(nomeRemover)) {
				itensParaRemover.add(i);
			}
		}
		itemList.removeAll(itensParaRemover);

	}
	public double calcularValorTotal() {
		
		double total = 0;
		for (Item i : itemList) {
			total += i.getPreco();
		}
		return total;
	}
	public void exibirItens() {
		System.out.println(itemList);

	}
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("notbook", 2500, 1);
		carrinho.adicionarItem("monitor", 1200, 1);
		carrinho.adicionarItem("mause-gamer", 100, 1);
		carrinho.exibirItens();
		
		carrinho.removerItem("mause-gamer");
		
		System.out.println("O valor total das compras é: "+carrinho.calcularValorTotal());
		carrinho.exibirItens();
	}
}
