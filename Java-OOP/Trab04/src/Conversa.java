import java.util.ArrayList;

public class Conversa {
	private ArrayList<Mensagem> mensagens;
	
	public Conversa() {
		mensagens = new ArrayList<Mensagem>();
	}
	
	public void cadastrarMensagem(String mensagem) {
		Mensagem novaMensagem = new Mensagem(mensagem);
		mensagens.add(novaMensagem);
	}
	
	public void imprimirMensagens() {
		for(Mensagem mensagem : mensagens) {
			System.out.println(mensagem.getTexto());
		}
	}
	
	public int numeroMensagens() {
		return mensagens.size();
	}
}
