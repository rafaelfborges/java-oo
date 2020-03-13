/**
 * 
 * Trabalho Grupo 4, Frota Motorizada.
 * Alunos: 
 * - Rafael Fernando Borges
 * - Gabriel Alves de Lima
 *
 */
public class Caminhao extends Veiculo {
	private static final long serialVersionUID = 1L;
	private float qtdCargaMaxima;

	public Caminhao(String marca, String modelo, int ano, float km, String placa, float cargaMaxima) {
		super(marca, modelo, ano, km, placa);
		this.qtdCargaMaxima = cargaMaxima;
		this.tipoVeiculo = "Caminhão";
	}

	public float getQtdCargaMaxima() {
		return qtdCargaMaxima;
	}

	public void setQtdCargaMaxima(float qtdCargaMaxima) {
		this.qtdCargaMaxima = qtdCargaMaxima;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"Carga Máxima: " + this.getQtdCargaMaxima() + "t" 
				+ ligarVeiculo();
	}

	@Override
	public String ligarVeiculo() {
		return "\nAção: Ligando caminhão...";
	}
}
