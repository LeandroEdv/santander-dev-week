package desafio_dio_banco;

public class ContaPoupanca extends Conta {

	
	public ContaPoupanca(Cliente cliente) {
		// TODO Auto-generated constructor stub
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("==Extrato conta polpança==");
		super.imprimirInfosComuns();
		
	}


}
