public class T {
	private static int[] v = new int[4];
	
	public static void main(String[] args) {
		v[0] = 0; v[1] = -1; v[2] = -2; v[3] = -3;
		A a = new A();
		boolean totalizado = false;
		
		while ( !totalizado ) {
			try {
				int resultado = a.totalizar(v);
				totalizado = true;
				System.out.println(resultado);
			}
			catch(NumeroNegativo e) {
				e.imprimir(); 
				ajustar();
			}
			catch(Exception e) {
				ajustar();
			}
		}
		
	}
	
	private static void ajustar() {
		for (int i = 0; i < 4; i++) 
			v[i] = v[i] + 1;
	}
}
