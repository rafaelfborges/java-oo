
public class ContaCorrente {
	private int numero;
	private String senha;
	private Double saldo;
	
	public ContaCorrente(int numero, String senha, Double saldo) {
		this.numero = numero;
		this.senha = senha;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", senha=" + senha + ", saldo=" + saldo + "]";
	}

	public void retirar(int numero, String senha, Double valor, int horas) 
			throws ExcecaoContaInvalida, ExcecaoSenhaInvalida, 
					ExcecaoSaldoInsuficiente, ExcecaoHorarioInvalido
	{
		if(this.numero != numero) 
			throw new ExcecaoContaInvalida("Conta inválida!");
		if(!this.senha.equals(senha))
			throw new ExcecaoSenhaInvalida("Senha inválida!");
		if(this.saldo < valor)
			throw new ExcecaoSaldoInsuficiente("Saldo insuficiente!");
		if(horas < 8 || horas > 22)
			throw new ExcecaoHorarioInvalido("Horário inválido!");

		this.saldo -= valor;
	}
}
