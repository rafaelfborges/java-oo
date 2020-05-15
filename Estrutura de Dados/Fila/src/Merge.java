
public abstract class Merge {

	public static Fila mergeFila(Fila filaA, Fila filaB) {
		int tamanho = filaA.getTotal() + filaB.getTotal();
		
		Fila fila = new Fila();
		fila.inicializa(tamanho);
		
		while(!filaA.vazia() || !filaB.vazia()) {
			int elementoFilaA = filaA.getPrimeiroElemento();
			int elementoFilaB = filaB.getPrimeiroElemento();
			
			if(elementoFilaA == -1 || elementoFilaB == -1) {
				break;
			} else {
				if(elementoFilaA > elementoFilaB) {
					fila.insere(filaB.remove());
				} else {
					fila.insere(filaA.remove());
				} 
			}
		}
		
		while(!filaA.vazia()) {
			fila.insere(filaA.remove());
		}
		
		while(!filaB.vazia()) {
			fila.insere(filaB.remove());
		}
		
		return fila;
	}
}
