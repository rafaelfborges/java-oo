
public class Sistema {

	public static void main(String[] args) {
		Disco disco = new Disco('C');
		
		Pasta escola = disco.criarPasta("Escola");
		Pasta pessoal = disco.criarPasta("Pessoal");
		
		Texto texto = new Texto("Trabalho 10", 8, 4);
		escola.inserir(texto);
		Apresentacao apresentacao = new Apresentacao("Defesa Projeto 2", 27, 3);
		escola.inserir(apresentacao);
		Planilha planilha = new Planilha("Calculo 2", 40, 6);
		escola.inserir(planilha);
		
		escola.listar();
		
		Video video = new Video("Aniversário", 33, 6);
		pessoal.inserir(video);
		Imagem imagem = new Imagem("Foto RJ", 70, 2);
		pessoal.inserir(imagem);
		Som som = new Som("Musica Chico", 58, 7);
		pessoal.inserir(som);
		
		pessoal.listar();
		
		Compactado compactado = pessoal.compactar();
		
		System.out.println("\n*********** Disco ANTES de REMOVER pasta [pessoal] ***********");
		disco.listar();
		disco.remover("Pessoal");
		
		System.out.println("\n*********** Disco DEPOIS de REMOVER pasta [pessoal] ***********");
		disco.listar();
		compactado.abrir(disco);
		
		System.out.println("\n*********** Disco DEPOIS de DESCOMPACTAR pasta [pessoal] ***********");
		disco.listar();
		
		System.out.println("\n*********** Pasta [escola] abrindo todos os arquivos ***********");
		escola.abrirTodosArquivos();
		
		System.out.println("\n*********** Pasta [pessoal] abrindo todos os arquivos ***********");
		pessoal.abrirTodosArquivos();
		
		escola.remover("Trabalho 10");
		escola.duplicar("Defesa Projeto 2");
		
		System.out.println("\n*********** Pasta [escola] DEPOIS de ***********");
		System.out.println("   * REMOVER arquivo [Trabalho 10]	********");
		System.out.println("   * DUPLICA arquivo [Defesa Projeto 2]	********");
		escola.listar();
	}
}
