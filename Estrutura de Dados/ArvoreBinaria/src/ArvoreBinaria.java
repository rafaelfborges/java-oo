public class ArvoreBinaria {
	private Node raiz;
		
	public Node getRaiz() {
		return raiz;
	}
	
	public void inserirElemento (int elemento) {
		this.raiz = inserir(raiz, elemento);
	}
	
	public void preOrdem(Node raiz) {
		if(raiz != null) {
			System.out.println(raiz.getInfo());
			preOrdem(raiz.getEsquerda());
			preOrdem(raiz.getDireita());
		}
	}
	
	public void inOrdem(Node raiz) {
		if(raiz != null) {
			inOrdem(raiz.getEsquerda());
			System.out.println(raiz.getInfo());
			inOrdem(raiz.getDireita());
		}
	}
	
	public void posOrdem(Node raiz) {
		if(raiz != null) {
			posOrdem(raiz.getEsquerda());
			posOrdem(raiz.getDireita());
			System.out.println(raiz.getInfo());
		}
	}
	
	public void removerMaiorElemento() {
		Node aux = raiz;
		while(aux.getDireita() != null) {
			aux = aux.getDireita();
		}
		removerElemento(aux.getInfo());
	}
	
	public void removerMenorElemento() {
		Node aux = raiz;
		while(aux.getEsquerda() != null) {
			aux = aux.getEsquerda();
		}
		removerElemento(aux.getInfo());
	}
	
	public void removerElemento(int elemento) {
		this.raiz = remover(raiz, elemento);
	}
	
	private Node inserir(Node arvore, int valor) {
		if(arvore == null) {
			return new Node(valor);
		} else if(valor < arvore.getInfo()) {
			arvore.setEsquerda(inserir(arvore.getEsquerda(), valor));
		} else {
			arvore.setDireita(inserir(arvore.getDireita(), valor));
		}
		return arvore;
	}
	
	private Node remover(Node arvore, int valor) {
		if(valor == arvore.getInfo()) {
			//1º caso - Quando o nó é folha.
			if(arvore.getEsquerda() == null && arvore.getDireita() == null) {
				return null;
			} else {
				//2º caso - Quando o nó tem um único filho
				if(arvore.getEsquerda() != null && arvore.getDireita() == null) {
					return arvore.getEsquerda();
				} else if(arvore.getDireita() != null && arvore.getEsquerda() == null) {
					return arvore.getDireita();
				} else {
					//3º caso - Quando o nó tem dois filhos (Abordagem maior da esquerda)
					Node aux = arvore.getEsquerda();
					while(aux.getDireita() != null) {
						aux = aux.getDireita();
					}
					arvore.setInfo(aux.getInfo());
					aux.setInfo(valor);
					arvore.setEsquerda(remover(arvore.getEsquerda(), valor));
				}
			}
		} else if(valor < arvore.getInfo()) {
			if(arvore.getEsquerda() != null) 
				arvore.setEsquerda(remover(arvore.getEsquerda(), valor));
			else 
				System.out.println("Elemento não encontrado!");
		} else {
			if(arvore.getDireita() != null)
				arvore.setDireita(remover(arvore.getDireita(), valor));
			else 
				System.out.println("Elemento não encontrado!");
		}
		
		return arvore;
	}
}
