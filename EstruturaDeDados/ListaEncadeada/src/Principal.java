
public class Principal {
	
	public static void main(String[] args) {
		Node no;
		ListaEncadeada lista = new ListaEncadeada();
		
		System.out.println("Lista vazia? " + lista.vazia());
		System.out.println("-------- Insere Primeiro e Ultimo --------");
		lista.inserePrimeiro(10);
		lista.insereUltimo(20);
		no = lista.insereUltimo(30);
		lista.insereUltimo(40);
		lista.insereUltimo(60);
		lista.inserePrimeiro(5);
		lista.imprime();
		
		System.out.println("-------- Insere Ordenado --------");
		lista.insereOrdenado(50);
		lista.imprime();
		
		System.out.println("-------- Insere Depois --------");
		no = lista.insereDepois(no, 100);
		lista.imprime();
		
		System.out.println("-------- Remove Primeiro --------");
		lista.removePrimeiro();
		lista.imprime();
		
		System.out.println("-------- Remove Último --------");
		lista.removeUltimo();
		lista.imprime();
		
		System.out.println("-------- Remove Nó --------");
		lista.remove(no);
		lista.imprime();
	}
}
