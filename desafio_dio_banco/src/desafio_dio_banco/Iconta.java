package desafio_dio_banco;

public interface Iconta {

	void sacar(double valor);

	void depositar(double valor);

	void trasferir(double valor, Conta contadestino);

	void imprimirExtrato();

	boolean conferirSaldo(double valor);

}
