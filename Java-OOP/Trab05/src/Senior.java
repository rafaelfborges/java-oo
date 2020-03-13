
public class Senior extends Profissional {
	private double premio;
	
	public Senior(String nome) {
		super(nome);
		this.premio = 2.0f;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Premio: " + this.premio);
	}
	
	public void ganhar(int p) {
		super.ganhar(p);
		this.premio *= 2;
	}
	
	public void perder(int p) {
		super.perder(p);
		this.premio /= 2;
	}
}
