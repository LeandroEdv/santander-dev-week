package desafio_dio_banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {

		super(cliente);

	}

	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("==Extrato conta Corrente==");
		super.imprimirInfosComuns();
	}
}
