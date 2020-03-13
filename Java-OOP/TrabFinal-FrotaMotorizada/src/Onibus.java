/**
 * 
 * Trabalho Grupo 4, Frota Motorizada.
 * Alunos: 
 * - Rafael Fernando Borges
 * - Gabriel Alves de Lima
 *
 */
public class Onibus extends Veiculo {
	private static final long serialVersionUID = 1L;
	private int qtdAssento;
	
	public Onibus(String marca, String modelo, int ano, float km, String placa, int qtdAssento) {
		super(marca, modelo, ano, km, placa);
		this.qtdAssento = qtdAssento;
		this.tipoVeiculo = "Ônibus";
	}
	
	public int getQtdAssento() {
		return qtdAssento;
	}

	public void setQtdAssento(int qtdAssento) {
		this.qtdAssento = qtdAssento;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"Qtd. Assentos: " + this.getQtdAssento() 
				+ ligarVeiculo();
	}

	@Override
	public String ligarVeiculo() {
		return "\nAção: Ligando ônibus...";
	}
}
