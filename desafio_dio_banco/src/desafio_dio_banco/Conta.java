package desafio_dio_banco;

public abstract class Conta implements Iconta {

// atributos

	private static int Sequencial = 1;
	private static final int AGENCIA_PADRAO = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;

// metodos

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = Sequencial++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {

		if (conferirSaldo(valor))
			this.saldo -= valor;

	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;

	}

	@Override
	public void trasferir(double valor, Conta contadestino) {

		if (conferirSaldo(valor)) {
			this.sacar(valor);
			contadestino.depositar(valor);
		}
	}

	public boolean conferirSaldo(double valor) {
		if (this.saldo >= valor) {
			return true;
		} else {
			System.out.println("Transação não aprovada, saldo insuficiente");
			return false;

		}

	}

	protected void imprimirInfosComuns() {

		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Agencia: %d", this.numero));
		System.out.println(String.format("Agencia: %.2f", this.saldo));
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
