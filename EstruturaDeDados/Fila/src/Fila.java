
public class Fila {
	private int fila[];
	private int primeiro;
	private int ultimo;
	private int total;
		
	public Fila() {
		this.primeiro = 0;
		this.ultimo = 0;
		this.total = 0;
	}
	
	public boolean cheia() {
		return total == fila.length;
	}
	
	public boolean vazia() {
		return total == 0;
	}
	
	public boolean insere(int novoElemento) {
		if(!cheia()) {
			this.fila[ultimo] = novoElemento;
			this.ultimo = (ultimo + 1) % fila.length;
			this.total++;
			return true;
		}
		return false;
	}
	
	public int remove() {
		if(!vazia()) {
			int elementoRemovido = fila[primeiro];
			this.primeiro = (primeiro + 1) % fila.length;
			this.total--;
			return elementoRemovido;
		}
		return -1;
	}
	
	public void imprime() {
		for(int i = primeiro; i < fila.length; i++) {
			System.out.println(fila[i]);
			
			if(i+1 == fila.length) {
				for(int j = 0; j < ultimo; j++) {
					System.out.println(fila[j]);
				}
			}
		}
	}
	
	public void inicializa(int qtdElementos) {
		this.fila = new int[qtdElementos];
	}

	public int getPrimeiroElemento() {
		if(!vazia()) {
			return fila[primeiro];
		}
		return -1;
	}

	public int getTotal() {
		return total;
	}
}
