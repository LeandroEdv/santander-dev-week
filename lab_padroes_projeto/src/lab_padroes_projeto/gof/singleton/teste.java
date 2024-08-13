package lab_padroes_projeto.gof.singleton;

public class teste {

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder hold = SingletonLazyHolder.getInstancia();
		System.out.println(hold);
		hold = SingletonLazyHolder.getInstancia();
		System.out.println(hold);
	}

}
