
public class TrataVet {
	private int[] array = new int[4];
	
	public void exibir(int k) throws 
		ExcecaoVetorRafael, ExcecaoIndiceNegativoRafael
	{
		if(k < 0) {
			throw new ExcecaoIndiceNegativoRafael("Erro indice negativo de Vetor");
		}
		if(k >= this.array.length) {
			throw new ExcecaoVetorRafael("Erro indice de Vetor");
		}
		System.out.println("Metodo exibir(k) : Array[k] = " + this.array[k]);
	}
	
	public static void main(String[] args) {
		TrataVet vetor = new TrataVet();
		int k = -14;
		vetor.array[0] = 1;
		vetor.array[1] = 3;
		vetor.array[2] = 5;
		vetor.array[3] = 7;
		
		boolean impresso = false;
		while(!impresso) {
			try {
				vetor.exibir(k);
				impresso = true;
			}catch(ExcecaoIndiceNegativoRafael e) {
				System.out.println("*** Erro: " + e.getMessage());
				if(k < 0)
					k = -k;
			}catch(ExcecaoVetorRafael e) {
				System.out.println("*** Erro: " + e.getMessage());
				k = k / 2;
			} finally {
				System.out.println("k = " + k);
			}
		}
	}
}
