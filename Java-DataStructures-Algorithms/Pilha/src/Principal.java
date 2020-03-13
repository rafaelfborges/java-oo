import java.util.Scanner;

public class Principal {

	private static Scanner sc;

	public static void main(String[] args) {
		Expressao exp = new Expressao();
		sc = new Scanner(System.in);
		
		System.out.print("Digite a expressão aritmética: ");
		String input = sc.nextLine();
		
		System.out.println(exp.verificarExpressao(input));
		
		/*		
		for(int i = 0; i < exp.length(); i++) {
			System.out.println(pilha.desempilha());
		}*/
	}

}
