public class NumeroNegativo extends Exception {
	private int indice;
	private int valor;
	
	public NumeroNegativo(int indice, int valor) {
		this.indice = indice;
		this.valor = valor;
	}
	
	public void imprimir() {
		System.out.println("Indice: " + indice);
		System.out.println("Valor: " + valor);
	}
}