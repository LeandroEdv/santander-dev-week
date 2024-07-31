package poo.exemplo;

public class Carro extends Veiculo{
	
	
	public void ligar() {
		confereCombustivel();
		System.out.println("Carro Ligado");
	}
	private void confereCombustivel() {
		System.out.println("Confere Combustivel");
	}
}
