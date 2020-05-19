public class ArvoreAVL {
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
	
	public int calcularAltura(Node raiz) {
		if(raiz == null) {
			return -1;
		}
		int esquerda = calcularAltura(raiz.getEsquerda());
		int direita = calcularAltura(raiz.getDireita());
		if(esquerda > direita)
			return 1 + esquerda;
		return 1 + direita;
	}
	
	public int calcularFatorBalanceamento(Node raiz) {
		return calcularAltura(raiz.getEsquerda()) - calcularAltura(raiz.getDireita());
	}
	
	public boolean buscar(int elemento) {
		Node atual = raiz;
		while(atual != null && atual.getInfo() != elemento) {
			if(atual.getInfo() > elemento) {
				atual = atual.getEsquerda();
			} else {
				atual = atual.getDireita();
			}
		}
		
		if(atual != null && atual.getInfo() == elemento) {
			return true;
		}

		return false;
	}
	
	private Node inserir(Node arvore, int valor) {
		if(arvore == null) {
			return new Node(valor);
		} else if(valor < arvore.getInfo()) {
			Node resultado = inserir(arvore.getEsquerda(), valor);
			System.out.println(resultado.getInfo());
			
			arvore.setEsquerda(resultado);
		} else {
			Node resultado = inserir(arvore.getDireita(), valor);
			System.out.println(resultado.getInfo());
			
			arvore.setDireita(resultado);
		}
		
		/*//Calcular o balanceamento após a inserção
		if(calcularFatorBalanceamento(arvore) == 2 || calcularFatorBalanceamento(arvore) == -2) {
			System.out.println("Elemento (Raiz Rotação): " + arvore.getInfo() 
			+ " | FB: " + calcularFatorBalanceamento(arvore));
			if(arvore.getDireita() != null) {
				System.out.println("FB (filho): " + calcularFatorBalanceamento(arvore.getDireita()));
			} else {
				System.out.println("FB (filho): " + calcularFatorBalanceamento(arvore.getEsquerda()));
			}
		}*/
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
					//Calcular o balanceamento após a remoção
				}
			}
		} else if(valor < arvore.getInfo()) {
			if(arvore.getEsquerda() != null) 
				arvore.setEsquerda(remover(arvore.getEsquerda(), valor));
				//Calcular o balanceamento após a remoção
			else 
				System.out.println("Elemento não encontrado!");
		} else {
			if(arvore.getDireita() != null)
				arvore.setDireita(remover(arvore.getDireita(), valor));
				//Calcular o balanceamento após a remoção
			else 
				System.out.println("Elemento não encontrado!");
		}
		
		/*//Calcular Balanceamento, caso estiver estourado, balancear antes de retornar.
		if(calcularFatorBalanceamento(arvore) == 2 || calcularFatorBalanceamento(arvore) == -2) {

		}*/
		
		return arvore;
	}
}
