package smartPhone;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void tocar() {
		System.out.println("Tocando musica!");
		
	}

	@Override
	public void pausar() {
		System.out.println("Reprodução pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("musica "+ musica +" Selecionada");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("ligando para o numero: "+ numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("iniciando correio de voz");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina web");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba web");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina web");
		
	}

}
