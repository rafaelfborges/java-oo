public class Pilha {
	private int topo;
	private char[] vetor;
	private  int MAX;
	
	public Pilha(int MAX) {
		this.topo = -1;
		this.MAX = MAX;
		this.vetor = new char[this.MAX];
	}
	
	public char topo() {
		if(!this.vazia()) {
			return vetor[this.topo];
		}
		return ' ';
	}
	
	public boolean vazia() {
		if(topo == -1)
			return true;
		return false;
	}
	
	public boolean cheia() {
		if(topo == (MAX -1))
			return true;
		return false;
	}
	
	public boolean empilha(char elemento) {
		if(!this.cheia()) {
			this.topo++;
			vetor[topo] = elemento;
			return true;
		}
		return false;
	}
	
	public char desempilha() {
		char c = ' ';
		if(!this.vazia()) {
			c = vetor[topo];
			this.topo--;
		}
		return c;
	}
	
	public void imprimirPilha() {
		System.out.println(" ");
		System.out.println(" ---- Dados da Pilha ---- ");
		for(int i = 0; i < this.topo + 1; i++) {
			System.out.println(vetor[i]);
		}
		System.out.println(" ------------------------ ");
		System.out.println(" ");
	}
}
