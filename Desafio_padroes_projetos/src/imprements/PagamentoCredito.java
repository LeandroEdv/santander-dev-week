package imprements;

import Strategy.Strategy;

public class PagamentoCredito implements Strategy{

	@Override
	public void pagamento(double valor) {
		// TODO Auto-generated method stub
		System.out.println("pagando no credito: " + valor);
		
	}

}
