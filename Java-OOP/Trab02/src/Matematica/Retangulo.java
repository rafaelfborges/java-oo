package Matematica;

public class Retangulo {
	private static double ladoHorizontal;
	private static double ladoVertical;
	
	public static void definirLados(double ladoH, double ladoV) {
		ladoHorizontal = ladoH;
		ladoVertical = ladoV;
	}
	
	public static double area() {		
		return ladoHorizontal*ladoVertical;
	}
	
	public static double Perimetro() {
		return (2*ladoHorizontal)+(2*ladoVertical);
	}
}
