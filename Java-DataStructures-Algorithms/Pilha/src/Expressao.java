
public class Expressao {
		
	public boolean verificarExpressao(String exp) {
		Pilha pilha = new Pilha(exp.length());
		
		for(int i = 0; i < exp.length(); i++) {
			if(exp.charAt(i) == '(' || exp.charAt(i) == '[' || exp.charAt(i) == '{' ) {
				pilha.empilha(exp.charAt(i));
			}
		}
		
		pilha.imprimirPilha();
		
		return false;
	}	
}
