
public class Gato extends Mamifero {

	public Gato(String nome, int idade, String dono) {
		super(nome, idade, dono);
		this.especie = "Gato";
	}

	@Override
	public void soar() {
		System.out.println("Som de gato");
	}

}
