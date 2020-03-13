public class Apresentacao extends Documento {

	public Apresentacao(String nome, int enderecoBloco, int totalBlocos) {
		super(nome, enderecoBloco, totalBlocos);
	}

	public void abrir() {
		System.out.print("PowerPoint	- ");
		super.abrir();
	}

}
