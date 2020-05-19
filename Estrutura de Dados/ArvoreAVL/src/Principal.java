import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		ArvoreAVL ab = new ArvoreAVL();
		
		List<Integer> valores = Arrays.asList(10, 12, 14, 18);
		for(Integer valor : valores) {
			ab.inserirElemento(valor);
		}
					
		System.out.println("In-Ordem: ");
		ab.inOrdem(ab.getRaiz());
		
		//System.out.println(ab.calcularAltura(ab.getRaiz()));	
		//System.out.println(ab.buscar(1398));
		
		//System.out.println(ab.calcularFatorBalanceamento(ab.getRaiz()));
		
		
	}

}
