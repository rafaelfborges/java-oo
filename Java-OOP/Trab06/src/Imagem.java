public class Imagem extends Documento {

	public Imagem(String nome, int enderecoBloco, int totalBlocos) {
		super(nome, enderecoBloco, totalBlocos);
	}

	public void abrir() {
		System.out.print("PaintBrush	- ");
		super.abrir();
	}

}
