public class Som extends Documento {

	public Som(String nome, int enderecoBloco, int totalBlocos) {
		super(nome, enderecoBloco, totalBlocos);
	}

	public void abrir() {
		System.out.print("Media Player	- ");
		super.abrir();
	}

}
