
public class Principal {

	public static void main(String[] args) {
		Banco banco = new Banco("Itau");
		
		banco.addConta(new ContaCorrente(1, "POO", 500.0));
		banco.addConta(new ContaCorrente(20, "POO", 400.0));
		banco.addConta(new ContaCorrente(3, "OOP", 300.0));
		banco.addConta(new ContaCorrente(4, "POO", 10.0));
		banco.addConta(new ContaCorrente(5, "POO", 200.0));
		banco.operacoes();
	}

}
