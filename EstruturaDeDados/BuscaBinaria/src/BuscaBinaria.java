
public class BuscaBinaria {
	
	public static int buscaBinaria(int dados[], int x, int inicio, int fim) {
		int meio = (fim + inicio) / 2;
		
		if(inicio == fim) {
			if(dados[meio] == x) {
				return meio;
			} else {
				return -1;
			}
		} else {
			if(dados[meio] == x) {
				return meio;
			} else if(dados[meio] > x) {
				fim = meio - 1;
				return buscaBinaria(dados, x, inicio, fim);
			} else {
				inicio = meio + 1;
				return buscaBinaria(dados, x, inicio, fim);
			}
		}
	}
	

	public static void main(String[] args) {
		int vet[] = {10, 12, 14, 15, 22, 37};
		
		System.out.println(buscaBinaria(vet, 37, 0, vet.length-1));;
		
	}

}
