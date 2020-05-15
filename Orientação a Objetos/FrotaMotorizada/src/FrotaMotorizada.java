import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * 
 * Trabalho Grupo 4, Frota Motorizada.
 * Alunos: 
 * - Rafael Fernando Borges
 * - Gabriel Alves de Lima
 *
 */
public class FrotaMotorizada {
	private ArrayList<Veiculo> veiculos;

	public FrotaMotorizada() {
		veiculos = new ArrayList<Veiculo>();
	}
	
	public Veiculo leValores(String tipoVeiculo, String valorAdicional) {
		ArrayList<String> nomeValores = new ArrayList<String>();
		Veiculo veiculo = null;
		
		nomeValores.add("Marca");
		nomeValores.add("Modelo");
		nomeValores.add("Ano (Ex: 1985)");
		nomeValores.add("Quilometragem (Ex: 15.150)");
		nomeValores.add("Placa (Ex: ABC-12345)");
		nomeValores.add(valorAdicional);
			
		String[] valores = new String [nomeValores.size()];
		for (int i = 0; i < valores.length; i++) {
			while(valores[i] == null) {
				valores[i] = JOptionPane.showInputDialog("Entre com " + nomeValores.get(i) + ": ");
			}
		}
		
		if(tipoVeiculo == "Automovel") {
			veiculo = new Automovel(valores[0], valores[1], Integer.parseInt(valores[2]),
					Float.parseFloat(valores[3]), valores[4].toUpperCase(), Float.parseFloat(valores[5]));
		} else if(tipoVeiculo == "Caminhao") {
			veiculo = new Caminhao(valores[0], valores[1], Integer.parseInt(valores[2]),
					Float.parseFloat(valores[3]), valores[4].toUpperCase(), Float.parseFloat(valores[5]));
		} else if(tipoVeiculo == "Onibus") {
			veiculo = new Onibus(valores[0], valores[1], Integer.parseInt(valores[2]),
					Float.parseFloat(valores[3]), valores[4].toUpperCase(), Integer.parseInt(valores[5]));
		}
		
		return veiculo;
	}
	
	public void adicionarVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	
	public void salvarVeiculos() {
		if(veiculos.isEmpty()) {
			JOptionPane.showMessageDialog(null,"N�o h� ve�culos cadastrados ainda!");
		} else {
			ObjectOutputStream outputStream = null;
			try {
				outputStream = new ObjectOutputStream(new FileOutputStream("veiculos.dad"));
				for(Veiculo veiculo: veiculos) {
					outputStream.writeObject(veiculo);
				}
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(outputStream != null) {
						outputStream.flush();
						outputStream.close();
						JOptionPane.showMessageDialog(null,"Ve�culos salvos com sucesso!");
					}
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}

	public void recuperarVeiculos() {
		if(veiculos.isEmpty()) {
			ObjectInputStream inputStream = null;
			try {
				inputStream = new ObjectInputStream(new FileInputStream("veiculos.dad"));
				Object obj = null;
				while((obj = inputStream.readObject()) != null) {
					if(obj instanceof Veiculo) {
						veiculos.add((Veiculo)obj);
					}
				}
			}catch(EOFException e) {
				System.out.println("Fim do arquivo atingido.");
			}catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null,"Arquivo banco de dados n�o foi encontrado!");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(inputStream != null) {
						inputStream.close();
						JOptionPane.showMessageDialog(null,"Veiculos recuperado com sucesso!");
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			JOptionPane.showMessageDialog(null,"Necess�rio excluir os dados antes de iniciar uma recupera��o!");
		}
	}

	public void excluirVeiculos() {
		if(veiculos.isEmpty()) {
			JOptionPane.showMessageDialog(null,"N�o h� ve�culos cadastrados ainda!");
		} else {
			veiculos.clear();
			JOptionPane.showMessageDialog(null,"Ve�culos exclu�dos com sucesso!");
		}
	}
	
	private boolean validarInteiro(String input) {
		 boolean resultado;
		 try {
			 Integer.parseInt(input);
			 resultado = true;
		 } catch (NumberFormatException e) {
			 resultado = false;
		 }
		 return resultado;
	}
	
	public void menuVeiculos() {
		int opc1, opc2;
		String menu;
		String entrada;
		
		do {
			menu = "Controle Frota Motorizada\n" +
					"Op��es:\n" + 
					"1. Cadastrar ve�culo\n" +
					"2. Exibir ve�culos\n" +
					"3. Excluir ve�culos\n" +
					"4. Gravar ve�culos\n" +
					"5. Recuperar ve�culos\n" +
					"9. Sair";
			entrada = JOptionPane.showInputDialog (menu + "\n\n");
			
			while (!validarInteiro(entrada)) {
	            entrada = JOptionPane.showInputDialog(null, menu + "\n\nEntrada inv�lida! Digite um n�mero inteiro.");
	        }
			opc1 = new Integer(entrada);

			switch (opc1) {
			case 1: // Cadastrar ve�culo
				menu = "Cadastrar Ve�culo\n" +
						"Op��es:\n" + 
						"1. Autom�vel\n" +
						"2. Caminh�o\n" +
						"3. �nibus\n";

				entrada = JOptionPane.showInputDialog (menu + "\n\n");
				while (!validarInteiro(entrada)) {
		            entrada = JOptionPane.showInputDialog(null, menu + "\n\nEntrada inv�lida! Digite um n�mero inteiro.");
		        }
				opc2 = new Integer(entrada);

				try {
					switch (opc2){
					case 1: 
						adicionarVeiculo(leValores("Automovel", "Tipo Motoriza��o (Ex: 2.0)"));
						break;
					case 2: 
						adicionarVeiculo(leValores("Caminhao", "Carga M�xima (Ex: 5.5)"));
						break;
					case 3: 
						adicionarVeiculo(leValores("Onibus", "Quantidade Assentos"));
						break;
					default: 
						JOptionPane.showMessageDialog(null,"� necess�rio selecionar um ve�culo!");
					}
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,
							"Erro: Formato inv�lido! Certifique-se de preencher os campos corretamentes.\n\n" + 
							"Erro detalhado: " + e.getLocalizedMessage());
				}catch(NullPointerException e) {
					e.printStackTrace();
				}
				break;
			case 2: // Exibir ve�culos
				if (veiculos.isEmpty()) {
					JOptionPane.showMessageDialog(null,"N�o h� ve�culos cadastrados ainda!");
					break;
				}
				String dados = "";
				for(Veiculo veiculo: veiculos) {
					dados += veiculo.toString() + "\n";
				}
				JOptionPane.showMessageDialog(null,dados);	
				break;
			case 3: // Excluir ve�culos
				excluirVeiculos();
				break;
			case 4: // Salvar ve�culos
				salvarVeiculos();
				break;
			case 5: // Recuperar ve�culos
				recuperarVeiculos();
				break;
			case 9:
				JOptionPane.showMessageDialog(null,"Fim do aplicativo Frota Motorizada.");
				break;
			}
		} while (opc1 != 9);
	}

	public static void main(String[] args) {
		FrotaMotorizada frota = new FrotaMotorizada();
		frota.menuVeiculos();
	}
}
