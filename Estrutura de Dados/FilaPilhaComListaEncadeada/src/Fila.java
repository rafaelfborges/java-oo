
public class Fila {
	private ListaEncadeada lista;
		
	public Fila() {
		this.lista = new ListaEncadeada();
	}
		
	public boolean vazia() {
		return lista.vazia();
	}
	
	public void insere(int novoElemento) {
		this.lista.insereUltimo(novoElemento);	
	}
	
	public int remove() {
		if(!vazia()) {
			int valorRemovido = this.lista.removePrimeiro().getInformacao();
			return valorRemovido;
		}
		return -1;
	}
	
	public void mostraFila() {
		this.lista.imprime();
	}
}
