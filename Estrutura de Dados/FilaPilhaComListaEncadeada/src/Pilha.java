
public class Pilha {
	private ListaEncadeada lista;
	
	public Pilha() {
		this.lista = new ListaEncadeada();
	}

	public boolean vazia() {
		return lista.vazia();
	}
	
	public void empilha(int i) {
		lista.insereUltimo(i);
	}
	
	public int desempilha() {
		if (!vazia()) {
			int ultimo = lista.removeUltimo().getInformacao();
			return ultimo;
		} else {
			System.out.println("Pilha Vazia");
			return -1;
		}
	}

	public int topo() {
		if(!vazia()) {
			int resposta = -1;
			Node aux = lista.getLista();
			while(aux != null ) {
				resposta = aux.getInformacao();
				aux = aux.getProximo();
			}
			return resposta;
		}
		return -1;
	}
	
	public void mostraPilha() {
		this.lista.imprime();
	}
}
