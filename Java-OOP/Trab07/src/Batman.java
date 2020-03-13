public class Batman extends Heroi implements Camuflagem {

	public Batman(int cor) {
		super(cor);
	}


	public void atirar() {
		System.out.println("Batman atirando...");
	}


	/**
	 * @see Camuflagem#camuflar(int)
	 * 
	 *  
	 */
	public void camuflar(int cor) {
		this.cor = cor;
		System.out.println("Batman camuflando...");
	}
	
}
