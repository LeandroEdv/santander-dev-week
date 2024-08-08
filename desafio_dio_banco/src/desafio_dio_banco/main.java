package desafio_dio_banco;

public class main {
	
	public static void main(String[] args) {
		
		Cliente cliente01 = new Cliente("leandro");
		Cliente cliente02= new Cliente("Santana");
		
		Conta cc = new ContaCorrente(cliente01);
		Conta polpanca = new ContaPoupanca(cliente02);
		
		cc.depositar(200);
		cc.trasferir(400, polpanca);
		cc.imprimirExtrato();
		polpanca.imprimirExtrato();
	}
}
