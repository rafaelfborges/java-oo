import java.util.ArrayList;

public class Disco {
	private char nome;
	private ArrayList<Pasta> pastas;

	public Disco(char nome) {
		this.nome = nome;
		pastas = new ArrayList<Pasta>();
	}

	public Pasta criarPasta(String nome) {
		Pasta pasta = new Pasta(nome);
		pastas.add(pasta);
		return pasta;
	}

	public void remover(String nome) {
		Pasta pasta = encontraPasta(nome);
		if(pasta != null) 
			pastas.remove(pasta);
		else
			System.out.println("Pasta [" + nome + "] inexistente");
	}

	private Pasta encontraPasta(String nome) {
		Pasta pasta = null;
		for(Pasta p: pastas) {
			if(p.getNome().equals(nome)) {
				pasta = p;
			}
		}
		return pasta;
	}
	
	public void listar() {
		System.out.println("Disco [" + nome + ":\\] ");
		for(Pasta p: pastas) {
			p.listar();
		}
	}
}
