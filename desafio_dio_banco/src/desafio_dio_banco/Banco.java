package desafio_dio_banco;

import java.util.List;

public class Banco {
	public String nome;
	private List<Conta> contas;

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public String getNome() {
		return nome;
	}

}
