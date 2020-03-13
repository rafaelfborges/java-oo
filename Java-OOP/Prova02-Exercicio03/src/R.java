public class R extends Q {
	
	public R(int k) {
		super(k);
	}
	
	public int servir(boolean b, int x) {
		int resultado = f(x);
		if (b)
			resultado = resultado * 2;
		else
			resultado = resultado - 2;
		return resultado;
	}
	
}