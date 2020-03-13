import java.util.ArrayList;

public class Banco {
	private String nome;
	private ArrayList<ContaCorrente> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		contas = new ArrayList<ContaCorrente>();
	}
	
	public void addConta(ContaCorrente c) {
		contas.add(c);
	}
	
	public void operacoes() {
		int cont = 1;
		
		System.out.println("OPERAÇÕES NO BANCO " + this.nome);
		for(ContaCorrente c: contas) {
			System.out.println("------------------------------------------");
			System.out.println("ANTES DA OPERAÇÃO:");
			imprimeConta(c);
			try {
				c.retirar(cont, "POO", 100.0, 18+cont);
				System.out.println("Saque Ok");
			}catch(ExcecaoContaInvalida e) {
				System.out.println("*** Erro autenticação: " + e.getMessage());
			}catch(ExcecaoSenhaInvalida e) {
				System.out.println("*** Erro autenticação: " + e.getMessage());
			}catch(ExcecaoHorarioInvalido e) {
				System.out.println("*** Erro segurança: " + e.getMessage());
			}catch(ExcecaoSaldoInsuficiente e) {
				System.out.println("*** Erro: " + e.getMessage());
			}finally {
				System.out.println("\nAPOS A OPERAÇÃO:");
				imprimeConta(c);
				cont++;
			}
		}
	}
	
	public void imprimeConta(ContaCorrente c) {
		System.out.println(c.toString());
	}
}
