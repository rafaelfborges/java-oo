public class Planilha extends Documento {

	public Planilha(String nome, int enderecoBloco, int totalBlocos) {
		super(nome, enderecoBloco, totalBlocos);
	}

	public void abrir() {
		System.out.print("Excel	- ");
		super.abrir();
	}

}
