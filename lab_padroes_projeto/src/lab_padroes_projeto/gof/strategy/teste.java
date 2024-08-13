package lab_padroes_projeto.gof.strategy;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
	}

}
