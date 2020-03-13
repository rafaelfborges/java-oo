public class Arquivo {
	protected String nome;
	protected int enderecoBloco;
	protected int totalBlocos;
	
	public Arquivo(String nome, int enderecoBloco, int totalBlocos) {
		this.nome = nome;
		this.enderecoBloco = enderecoBloco;
		this.totalBlocos = totalBlocos;
	}
	
	public String getNome() {
		return nome;
	}

	public void imprimirNome() {
		System.out.println("  . " + nome);
	}

	public void abrir() {
		System.out.println(this.nome);
	}
}
