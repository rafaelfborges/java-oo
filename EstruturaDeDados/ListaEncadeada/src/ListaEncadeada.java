
public class ListaEncadeada {
	private Node lista;
	
	public ListaEncadeada() {
		this.lista = null;
	}
	
	public boolean vazia() {
		return lista == null; 
	}
	
	public Node inserePrimeiro(int info) {
		Node novo = new Node();
		if(vazia()) {
			novo.setInformacao(info);
			this.lista = novo;
		} else {
			novo.setInformacao(info);
			novo.setProximo(lista);
			this.lista = novo;
		}
		return novo;
	}
	
	public Node insereDepois(Node no, int info) {
		Node novo = new Node();
		if(!vazia()) {
			novo.setInformacao(info);
			
			Node aux = lista;
			
			while(aux != null) {
				if(aux.equals(no)) {
					novo.setProximo(aux.getProximo());
					break;
				}
				aux = aux.getProximo();
			}
			
			aux = lista;
			while(aux != null) {
				if(aux.getProximo().equals(no)) {
					aux.setProximo(novo);
					break;
				}
				aux = aux.getProximo();
			}			
		}
		return novo;
	}
	
	public Node insereUltimo(int info) {
		Node novo = new Node();
		if(vazia()) {
			novo.setInformacao(info);
			this.lista = novo;
		} else {
			novo.setInformacao(info);
			
			Node aux = lista;
			while(aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
		return novo;
	}
	
	public Node insereOrdenado(int info) {
		Node novo = new Node();
		if(!vazia()) {
			novo.setInformacao(info);
			
			Node aux = lista;
			Node nodeMenor = null, nodeMaior = null;
			
			while(aux != null) {
				if(novo.getInformacao() > aux.getInformacao()) {
					nodeMenor = aux;
				} else {
					nodeMaior = aux;
				}
				aux = aux.getProximo();
			}
			
			aux = lista;
			while(aux != null) {
				if(aux.equals(nodeMenor)) {
					novo.setProximo(nodeMaior);
					aux.setProximo(novo);
					break;
				}
				aux = aux.getProximo();
			}
		}
		return novo;
	}
	
	public void imprime() {
		if(!vazia()) {
			Node aux = lista;
			
			while(aux != null) {	
				System.out.println(aux.getInformacao());
				aux = aux.getProximo();
			}
		} else {
			System.out.println("Lista vazia!");
		}
	}
	
	public Node removePrimeiro() {
		if(!vazia()) {
			Node aux = lista;
			this.lista = lista.getProximo();	
			
			aux.setProximo(null);
			return aux;
		}
		return null;
	}
	
	public Node removeUltimo() {
		if(!vazia()) {
			Node ultimo = lista;
			while(ultimo.getProximo() != null) {
				ultimo = ultimo.getProximo();
			}

			Node aux = lista;
			while(aux != null) {
				if(aux.getProximo() == null) {
					aux = null;
					lista = aux;
				} else {
					if(aux.getProximo().equals(ultimo)) {
						aux.setProximo(null);
						break;
					}
				}
				aux = aux.getProximo();
			}
			return ultimo;
		}
		return null;
	}
	
	public Node remove(Node no) {
		if(!vazia()) {
			Node aux = lista;
			Node temp = null;
			
			while(aux != null) {
				if(aux.equals(no)) {
					temp = aux.getProximo();
					aux.setProximo(null);
				}
				aux = aux.getProximo();
			}
			
			aux = lista;
			while(aux != null) {
				if(aux.getProximo() == null) {
					// Nó não existe na lista.
					break;
				} else {
					if(aux.getProximo().equals(no)) {
						aux.setProximo(temp);
						break;
					}
				}
				aux = aux.getProximo();
			}
			return no;
		}
		
		return null;
	}
}
