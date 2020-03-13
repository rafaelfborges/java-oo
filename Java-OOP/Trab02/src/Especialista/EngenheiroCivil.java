package Especialista;

import Matematica.Retangulo;

public class EngenheiroCivil {
	private static String nome = "Gustave Eiffel";
	private static int idade = 91;
	
	private static void exibirDadosPessoais() {
		System.out.println(nome);
		System.out.println(idade + " anos");
	}
	
	public static void main(String[] arg) {
		exibirDadosPessoais();
		
		Retangulo.definirLados(4.7, 8.2);
		System.out.println("Área do retangulo: " + Retangulo.area());
		System.out.println("Perímetro do retangulo: " + Retangulo.Perimetro());
	}
}
