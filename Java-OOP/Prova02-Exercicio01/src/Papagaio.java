
public class Papagaio extends Animal {

	public Papagaio(String nome) {
		super(nome);
	}

	public void movimentar() {
		System.out.println(" voando");
	}

	public void viverEm() {
		System.out.println(" vive em um viveiro de passaros");
	}

	public void imprimirNome() {
		System.out.print("Papagaio " + nome);
	}

}
