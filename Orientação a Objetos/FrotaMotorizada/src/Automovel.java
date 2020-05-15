/**
 * 
 * Trabalho Grupo 4, Frota Motorizada.
 * Alunos: 
 * - Rafael Fernando Borges
 * - Gabriel Alves de Lima
 *
 */
public class Automovel extends Veiculo {
	private static final long serialVersionUID = 1L;
	private float tipoMotorizacao;

	public Automovel(String marca, String modelo, int ano, float km, String placa, float tipoMotorizacao) {
		super(marca, modelo, ano, km, placa);
		this.tipoMotorizacao = tipoMotorizacao;
		this.tipoVeiculo = "Automóvel";
	}
	
	public float getTipoMotorizacao() {
		return tipoMotorizacao;
	}

	public void setTipoMotorizacao(float tipoMotorizacao) {
		this.tipoMotorizacao = tipoMotorizacao;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"Tipo Motorização: " + this.getTipoMotorizacao()
				+ ligarVeiculo();
	}

	@Override
	public String ligarVeiculo() {
		return "\nAção: Ligando automóvel...";
	}	
}
