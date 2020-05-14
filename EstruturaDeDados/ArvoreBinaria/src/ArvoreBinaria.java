
public class ArvoreBinaria {
	private Node raiz;
		
	public Node getRaiz() {
		return raiz;
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
	
	public void inserirElemento (int novoValor) {
		raiz = inserir(raiz, novoValor);
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
	
}
