public class JamesBond extends Heroi {
	
	public JamesBond(int cor) {
		super(cor);
		this.nome = "James Bond";
	}

	public void saltar(float z) {
		System.out.println("James Bond saltando... " + z);
		this.posicaoZ = z;
	}

	public void atirar() {
		System.out.println("James Bond atirando....");
	}

}
