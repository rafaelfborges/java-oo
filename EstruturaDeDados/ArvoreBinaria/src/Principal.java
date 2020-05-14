import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		ArvoreBinaria ab = new ArvoreBinaria();
		
		List<Integer> valores = Arrays.asList(14, 15, 4, 9, 7, 18, 3, 5, 16, 4, 20, 17, 9, 14, 5);
		
		for(Integer valor : valores) {
			ab.inserirElemento(valor);
		}
		
		System.out.println("Pré-Ordem: ");
		ab.preOrdem(ab.getRaiz());
		System.out.println("In-Ordem: ");
		ab.inOrdem(ab.getRaiz());
		System.out.println("Pós-Ordem: ");
		ab.posOrdem(ab.getRaiz());
		
		
	}

}
