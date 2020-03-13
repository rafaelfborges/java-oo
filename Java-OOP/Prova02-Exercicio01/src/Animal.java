
public abstract class Animal {
	protected String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public abstract void movimentar();
	public abstract void viverEm();
	public abstract void imprimirNome();
	
}
