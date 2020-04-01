public class P implements Servico {
	
	public int servir(boolean b, int x) {
		int resultado = x + 2;
		if (b)
			resultado = x * 2;
		return resultado;
	}
	
}