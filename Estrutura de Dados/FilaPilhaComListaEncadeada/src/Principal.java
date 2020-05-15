
public class Principal {
	
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		Fila fila = new Fila();
		
		System.out.println("------------ PILHA -------------");
		pilha.empilha(1000);
		pilha.empilha(2000);
		pilha.empilha(3000);
		pilha.empilha(4000);
		pilha.mostraPilha();
		
		System.out.println("------ PILHA: DESEMPILHA -------");
		pilha.desempilha();
		pilha.mostraPilha();
		
		System.out.println("--------- PILHA: TOPO ----------");
		System.out.println(pilha.topo());
		
		System.out.println("\n");
		
		System.out.println("------------- FILA -------------");
		fila.insere(100);
		fila.insere(200);
		fila.insere(300);
		fila.insere(400);
		fila.mostraFila();
		
		System.out.println("--------- FILA: REMOVE ---------");
		fila.remove();
		fila.mostraFila();
		
		System.out.println("--------- FILA: INSERE ---------");
		fila.insere(500);
		fila.mostraFila();
	}
}
