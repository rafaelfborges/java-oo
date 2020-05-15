
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
		novo.setInformacao(info);
		
		if(vazia()) {
			this.lista = novo;
		} else {
			novo.setProximo(lista);
			this.lista = novo;
		}
		return novo;
	}
	
	public Node insereDepois(Node no, int info) {
		Node novo = new Node();
		novo.setInformacao(info);
		
		if(!vazia()) {
			Node aux = lista;
			
			while(aux != null) {
				if(aux.equals(no)) {
					novo.setProximo(aux.getProximo());
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
		novo.setInformacao(info);
		
		if(vazia()) {
			this.lista = novo;
		} else {	
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
		novo.setInformacao(info);
		
		if(!vazia()) {
			Node aux = lista;
			Node anterior = null;
			
			while(aux != null) {
				if(novo.getInformacao() > aux.getInformacao())
					anterior = aux;
				
				aux = aux.getProximo();
			}

			if(anterior == null) {
				novo.setProximo(lista);
				this.lista = novo;
			} else {
				novo.setProximo(anterior.getProximo());
				anterior.setProximo(novo);
			}
		} else {
			inserePrimeiro(info);
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
			Node aux = lista;
			Node anterior = null;
			
			if(lista.getProximo() == null) {
				anterior = lista;
				lista = null;
				return anterior;
			}
			
			while(aux.getProximo() != null) {
				if(aux.getProximo().getProximo() == null) {
					anterior = aux;
				}
				aux = aux.getProximo();
			}
			
			anterior.setProximo(null);
			return aux;
		}
		return null;
	}
	
	public Node remove(Node no) {
		if(!vazia()) {
			Node aux = lista;

			while(aux != null) {
				if(aux.equals(no)) {
					Node temp = aux.getProximo();
					aux.setProximo(null);
					
					if(lista.getProximo() == null) {
						lista = temp;
						return aux;
					}
					
					while(lista != null) {
						if(lista.getProximo().equals(no)) {
							lista.setProximo(temp);
							return aux;
						}
					}
				}
				aux = aux.getProximo();
			}
		}
		return null;
	}

	public Node getLista() {
		return lista;
	}
}
