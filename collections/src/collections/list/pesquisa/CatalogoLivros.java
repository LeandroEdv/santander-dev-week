package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List <Livro> livroList;
	
	public CatalogoLivros() {
		// TODO Auto-generated constructor stub
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	public List<Livro> pesquisarPorAutor(String autor){
		
		List<Livro> livrosPorAutor = new ArrayList<>(); // criando uma nova lista
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
	return livrosPorAutor;
	}
	
	public List<Livro> psquisaPorIntervalo(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervalo = new ArrayList<>(); // criando uma nova lista
		if(!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal ) {
					livrosPorIntervalo.add(l);
				}
			}
		}
	return livrosPorIntervalo;
	}
	
	public Livro pesquisaPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
}
