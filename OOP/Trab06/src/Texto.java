public class Texto extends Documento {

	public Texto(String nome, int enderecoBloco, int totalBlocos) {
		super(nome, enderecoBloco, totalBlocos);
	}

	public void abrir() {
		System.out.print("Notepad	- ");
		super.abrir();
	}

}
