import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private ArrayList<Contato> contatos;
	private Scanner ler;
	
	public Usuario(String nome) {
		this.nome = nome;
		contatos = new ArrayList<Contato>();
	}
	
	public void novoContato(String nomeContato) {
		Contato novoContato = new Contato(nomeContato);
		contatos.add(novoContato);
		//this.iniciarConversa(nomeContato);
	}
	
	public void iniciarConversa(String nomeContato) {
		Contato contato = encontraContato(nomeContato);
		if(contato != null) {
			Conversa novaConversa = new Conversa();
			contato.setConversa(novaConversa);
		}else
			System.out.println("Contato, " + nome + ", não existe!");
	}
	
	public void enviaMensagem(String nome, String textoMensagem) {
		Contato contato = encontraContato(nome);
		if(contato != null) {
			if(contato.getConversa() == null) {
				this.iniciarConversa(nome);
				contato.getConversa().cadastrarMensagem(textoMensagem);
				System.out.println("Mensagem enviada com sucesso!");
				
			}else
				contato.getConversa().cadastrarMensagem(textoMensagem);
				System.out.println("Mensagem enviada com sucesso!");
		}else
			System.out.println("Contato, " + nome + ", não existe!");
	}
	
	public void receberMensagem(String nome, String textoMensagem) {
		Contato contato = encontraContato(nome);
		if(contato != null) {
			contato.getConversa().cadastrarMensagem(textoMensagem);
			System.out.println("Mensagem recebida com sucesso!");
		}else
			System.out.println("Contato, " + nome + ", não existe!");
	}
	
	public void imprimirConversa(String nome) {
		Contato contato = encontraContato(nome);
		if(contato != null) {
			System.out.println("---------------------------------------");
			System.out.println("Conversa com contato: " + nome);
			contato.getConversa().imprimirMensagens();
		}else
			System.out.println("Contato, " + nome + ", não existe!");
	}
	
	public Contato encontraContato(String nome) {
		Contato contato = null;
		for(Contato c : contatos) {
			if(c.getNome().equals(nome)) {
				contato = c;
			}
		}
		return contato;
	}

	public void conversar() {
		ler = new Scanner(System.in);
		boolean fim = false;
		int opcao;
		String nome;
		String msg;
		
		while(!fim) {
			System.out.println("------------ Menu ------------");
			System.out.println("1) Adicionar contato");
			System.out.println("2) Enviar msg para contato");
			System.out.println("3) Receber msg de contato");
			System.out.println("4) Imprimir conversas");
			System.out.println("5) Imprimir conversa de contato");
			System.out.println("6) Fim");
			System.out.print("\nEntre com a opção desejada: ");
			opcao = ler.nextInt();
			ler.nextLine();
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do contato: ");
				nome = ler.nextLine();
				this.novoContato(nome);
				System.out.println("Contato adicionado com sucesso!");
				System.out.println("\nTecle algo para prosseguir...");
				ler.nextLine();
				System.out.flush();
				break;
			case 2:
				System.out.println("Digite o nome do contato: ");
				nome = ler.nextLine();
				System.out.println("Escreva a mensagem a ser enviada: ");
				msg = ler.nextLine();
				this.enviaMensagem(nome, msg);
				System.out.println("\nTecle algo para prosseguir...");
				ler.nextLine();
				System.out.flush();
				break;
			case 3:
				System.out.println("Digite o nome do contato: ");
				nome = ler.nextLine();
				System.out.println("Escreva a mensagem a ser recebida: ");
				msg = ler.nextLine();
				this.receberMensagem(nome, msg);
				System.out.println("\nTecle algo para prosseguir...");
				ler.nextLine();
				System.out.flush();
				break;
			case 4:
				System.out.println("\nConversas de " + this.nome);
				for(Contato c : contatos) {
					System.out.println("---------------------------");
					System.out.println("Conversa de " + c.getNome() + ", " + c.getConversa().numeroMensagens() + " mensagens(s).");
					c.getConversa().imprimirMensagens();
				}
				System.out.println("\nTecle algo para prosseguir...");
				ler.nextLine();
				break;	
			case 5:
				System.out.println("Digite o nome do contato: ");
				nome = ler.nextLine();
				System.out.println("---------------------------");
				this.imprimirConversa(nome);
				System.out.flush();
				break;
			case 6:
				fim = true;
				System.out.println("Finalizando!");
				break;
			default:
				System.out.println("\nOpção incorreta. Tente novamente.\n");
			}
		}
	}
}
