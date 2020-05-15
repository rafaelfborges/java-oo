import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		ArvoreBinaria ab = new ArvoreBinaria();
		
		//Exercicio 01 - Inserir elementos (Arvore)
		List<Integer> valores = Arrays.asList(20, 10, 5, 2, 8, 15, 12, 18, 30, 25, 22, 28, 35, 32, 38);
		for(Integer valor : valores) {
			ab.inserirElemento(valor);
		}
		
		//Exercicio 02 - Percorer Pré, In e Pós-Ordem.
		System.out.println("Pré-Ordem: ");
		ab.preOrdem(ab.getRaiz());
		System.out.println("In-Ordem: ");
		ab.inOrdem(ab.getRaiz());
		System.out.println("Pós-Ordem: ");
		ab.posOrdem(ab.getRaiz());
		
		//Exercicio 03 - Remover maior elemento.
		ab.removerMaiorElemento();
		
		//Exercicio 04 - Remover o menor elemento.		
		ab.removerMenorElemento();
		
		//Exercício 05 - Remover um determinado elemento.
		System.out.println("Removendo 20");
		ab.removerElemento(20);
		
		System.out.println("In-Ordem: ");
		ab.inOrdem(ab.getRaiz());
	}

}
