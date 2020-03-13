
public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome);
	}

	public void movimentar() {
		System.out.println(" correndo");
	}

	public void viverEm() {
		System.out.println(" vive em um canil");
	}
	
	public void imprimirNome() {
		System.out.print("Cachorro " + nome);
	}
}
