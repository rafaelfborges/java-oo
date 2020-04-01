
public class Principal {

	public static void main(String[] args) {		
		Fila filaA = new Fila();
		filaA.inicializa(4);
		filaA.insere(12);
		filaA.insere(35);
		filaA.insere(52);
		filaA.insere(64);
				
		Fila filaB = new Fila();
		filaB.inicializa(5);
		filaB.insere(5);
		filaB.insere(15);
		filaB.insere(23);
		filaB.insere(55);
		filaB.insere(75);
		

		Fila filaMerge = Merge.mergeFila(filaA, filaB);
		filaMerge.imprime();
		System.out.println("------------------");
		System.out.println("Fila A vazia? " + filaA.vazia());
		System.out.println("Fila B vazia? " + filaB.vazia());
		System.out.println("FilaMerge cheia? " + filaMerge.cheia());
		System.out.println("------------------");
		filaMerge.remove(); 
		filaMerge.imprime();
		System.out.println("------------------");
		filaMerge.insere(100);
		filaMerge.imprime();
		System.out.println("------------------");
		filaMerge.remove();
		filaMerge.imprime();
		System.out.println("------------------");
		filaMerge.insere(323);
		filaMerge.imprime();
	}
}
