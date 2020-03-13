
public class Profissional extends Jogador {
	private double capital;
	
	public Profissional(String nome) {
		super(nome);
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Capital: " + this.capital);
	}
	
	public void ganhar(int p) {
		this.score += p;
		this.capital += p * 4;
	}
	
	public void perder(int p) {
		this.score -= p;
		this.capital -= p * 4;
	}
}
