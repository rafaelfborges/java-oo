/**
 * 
 * Trabalho Grupo 4, Frota Motorizada.
 * Alunos: 
 * - Rafael Fernando Borges
 * - Gabriel Alves de Lima
 *
 */
public abstract class Veiculo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	protected String tipoVeiculo;
	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	private float km;
	
	public Veiculo(String marca, String modelo, int ano, float km, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.km = km;
	}
	
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "------------------- " +
				"Tipo Veículo: " + this.getTipoVeiculo() +
				" ------------------\n" +
				"Marca: " + this.getMarca() + "\n" +
				"Modelo: " + this.getModelo() + "\n" +
				"Placa: " + this.getPlaca() + "\n" +
				"Ano: " + this.getAno() + "\n" +
				"Quilometragem: " + this.getKm() + " km" + "\n";
	}

	public abstract String ligarVeiculo();
}
