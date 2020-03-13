public class Principal {

	public static void main(String[] args) {
		Batman bat = new Batman(1);
		Coringa coringa = new Coringa(2);
		Pinguim pinguim = new Pinguim(2);
		
		JamesBond james = new JamesBond(1);
		DrNo drno = new DrNo(2);
		Goldfinger gold = new Goldfinger(2);
		
		bat.atirar();
		bat.correr(20, 30);
		bat.camuflar(2);
		bat.saltar(20);
		System.out.println("----------------------");

		coringa.correr(20, 30);
		coringa.atirar();
		coringa.saltar(5);
		System.out.println("----------------------");
		
		pinguim.correr(20, 30);
		pinguim.atirar();
		pinguim.saltar(4);
		System.out.println("----------------------");
		
		james.atirar();
		james.correr(20, 30);
		james.saltar(5);
		System.out.println("----------------------");
		
		drno.correr(20, 30);
		drno.atirar();
		drno.saltar(3);
		System.out.println("----------------------");
		
		gold.personificar(james);
		gold.camuflar(1);
		gold.correr(20, 30);
		gold.atirar();
		gold.saltar(2);
		gold.morrer();
		
		if(gold.isVivo()) {
			System.out.println("Está vivo!");
		} else {
			System.out.println("Está morto!");
		}
	}

}
