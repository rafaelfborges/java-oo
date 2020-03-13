public class Goldfinger extends Terrorista implements Personificacao {
	private Heroi heroi;

	public Goldfinger(int cor) {
		super(cor);
	}

	public void saltar(float z) {
		System.out.println("Goldfinger saltando... " + z);
		this.posicaoZ = z;
	}
	
	public void personificar(Heroi h) {
		this.heroi = h;
		System.out.println("Goldfinger personificando " + heroi.getNome());
	}

	public void camuflar(int cor) {
		this.cor = cor;
		System.out.println("Goldfinger camuflando...");
	}

}
