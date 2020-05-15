
public class Cao extends Mamifero {

	public Cao(String nome, int idade, String dono) {
		super(nome, idade, dono);
		this.especie = "Cachorro";
	}

	@Override
	public void soar() {
		System.out.println("Som de cachorro");
	}

}
