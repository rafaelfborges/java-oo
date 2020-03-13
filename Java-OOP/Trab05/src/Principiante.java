
public class Principiante extends Jogador {
	private double bonus;
	
	public Principiante(String nome) {
		super(nome);
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Bonus: " + bonus);
	}
	
	public void ganhar(int p) {
		this.score += p;
		this.bonus += 0.10 * p;
	}
	
	public void perder(int p) {
		this.score -= p;
		this.bonus -= 0.10 * p;
	}
}
