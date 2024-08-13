package App;

import context.Compra;
import imprements.PagamentoCredito;
import imprements.PagamentoDebito;

public class AppCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compra compra_01 = new Compra(150);
		compra_01.processarCompra(new PagamentoCredito());
		
		Compra compra_02 = new Compra(520);
		compra_02.processarCompra(new PagamentoDebito());
	}

}
