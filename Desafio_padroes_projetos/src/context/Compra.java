package context;

import Strategy.Strategy;

public class Compra {
	
	public double valor;
	
	public Compra(double valor) {
		this.valor = valor;
	}
	
	public void processarCompra(Strategy strategy) {
		
		strategy.pagamento(valor);
	}
}
