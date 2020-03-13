public abstract class Q implements Servico {
	private int k;
	
	public Q(int k) {
		this.k = k;
	}
	
	protected int f(int x) {
		return k * x;
	}
	
}