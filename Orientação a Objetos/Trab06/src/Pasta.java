import java.util.ArrayList;

public class Pasta {
	private String nome;
	private ArrayList<Arquivo> arquivos;
	
	public Pasta(String nome) {
		this.nome = nome;
		arquivos = new ArrayList<Arquivo>();
	}
		
	public String getNome() {
		return nome;
	}
	
	public void inserir(Arquivo arquivo) {
		arquivos.add(arquivo);
	}
	
	public void remover(String nomeArquivo) {
		Arquivo arquivo = encontraArquivo(nomeArquivo);
		if(arquivo != null)
			arquivos.remove(arquivo);
		else
			System.out.println("Arquivo [" + nomeArquivo + "] inexistente.");
	}
	
	public void duplicar(String nomeArquivo) {
		Arquivo arquivo = encontraArquivo(nomeArquivo);
		if(arquivo != null) {
			Arquivo arquivoDuplicado = new Arquivo(arquivo.nome + "(copia)", arquivo.enderecoBloco + 1, arquivo.totalBlocos + 1);
			arquivos.add(arquivoDuplicado);
		} else
			System.out.println("Arquivo [" + nomeArquivo + "] inexistente.");
	}
	
	private Arquivo encontraArquivo(String nomeArquivo) {
		Arquivo arquivo = null;
		for(Arquivo a: arquivos) {
			if(a.getNome().equals(nomeArquivo)) {
				arquivo = a;
			}
		}
		return arquivo;
	}

	public void listar() {
		System.out.println("- Pasta [" + nome + "]");
		for(Arquivo a: arquivos) {
			a.imprimirNome();
		}
	}

	public Compactado compactar() {
		Compactado compactado = new Compactado(this.nome, 0, arquivos.size());
		for(Arquivo a: arquivos) {
			compactado.compactarArquivos(a);
		}
		return compactado;
	}

	public void abrirTodosArquivos() {
		System.out.println("- Pasta [" + nome + "] ");
		for(Arquivo a: arquivos) {
			System.out.print("  Abrindo arquivo: ");
			a.abrir();
		}
	}

	public void imprimirNome() {
		System.out.println("Pasta: " + this.nome);
	}

}
