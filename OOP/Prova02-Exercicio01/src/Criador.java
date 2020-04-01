import java.util.ArrayList;

public class Criador {
	
	private String nome;
	private ArrayList<Animal> animais;
	
	public Criador(String nome) {
		animais = new ArrayList<Animal>();
		this.nome = nome;
	}
	
	public void cuidarAnimais() {
		System.out.println("--- Criadouro do " + this.nome + ": cuidados");
		for(Animal a: animais) {
			a.imprimirNome();
			a.movimentar();
		}
	}
	
	public void proverMoradia() {
		System.out.println("--- Criadouro do " + this.nome + ": moradias");
		for(Animal a: animais) {
			a.imprimirNome();
			a.viverEm();
		}
	}
	
	public void addAnimal(Animal a) {
		animais.add(a);
	}
	
	public static void main(String[] args) {
		Criador jose = new Criador("Jose");
		
		Cachorro rex = new Cachorro("Rex");
		Papagaio louro = new Papagaio("Louro");
		Cachorro tobi = new Cachorro("Tobi");
		
		jose.addAnimal(rex);
		jose.addAnimal(louro);
		jose.addAnimal(tobi);
		
		jose.proverMoradia();
		jose.cuidarAnimais();
	}

}
