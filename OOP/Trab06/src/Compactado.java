import java.util.ArrayList;

public class Compactado extends Arquivo {
	private ArrayList<Arquivo> arquivos;

	public Compactado(String nome, int endereco, int blocos) {
		super(nome, endereco, blocos);
		arquivos = new ArrayList<Arquivo>();
	}
	
	public void compactarArquivos(Arquivo arquivo) {
		arquivos.add(arquivo);
	}
	
	public void abrir(Disco disco) {
		Pasta pastaDescompactada = disco.criarPasta(this.nome);
		for(Arquivo a: arquivos) {
			pastaDescompactada.inserir(a);
		}
	}

	public void listar() {
		System.out.println("- Compactado [" + nome + "]");
		for(Arquivo a: arquivos) {
			a.imprimirNome();
		}
	}

}
