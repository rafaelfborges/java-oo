
public class Jogador {
	private String nome;
	protected int score;
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Score: " + this.score);
	}
}
