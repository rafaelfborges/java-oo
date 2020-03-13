public class Ladrao extends Vilao {

	public Ladrao(int cor) {
		super(cor);
	}

	public void saltar(float z) {
		System.out.println("Ladrao saltando... " + z);
		this.posicaoZ = z;
	}

	public void atirar() {
		System.out.println("Ladrao atirando...");
	}
	
}
