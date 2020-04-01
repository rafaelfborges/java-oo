import java.util.ArrayList;
import java.util.Scanner;

/*
 * Trabalho dos alunos:
 * - Rafael Fernando Borges
 * - Andr� Luiz Lopes Martins
 */

public class Principal {
	
	private static Scanner ler;

	public static void main(String[] args) {
		String usuario;
		String senha;
		int opcaoSalt;
		
		ler = new Scanner(System.in);
        boolean fim = false;
        int opcao;
        
        while (!fim){
            System.out.println("     Menu");
            System.out.println("---------");
            System.out.println("1) Cadastrar usu�rio");
            System.out.println("2) Fazer login");
            System.out.println("3) Ataque de for�a bruta");
            System.out.println("4) Finalizar");
            System.out.print("\nEntre com a op��o desejada: ");
            opcao = ler.nextInt();
            ler.nextLine();
            
            switch (opcao){
                case 1:
                    do {
                    	System.out.print("Digite o nome do usu�rio (m�ximo 4 caracteres): ");
                        usuario = ler.nextLine();
                    } while(usuario.length() != 4);
                    
                    do {
                    	System.out.print("Digite a senha (m�ximo 4 caracteres): ");
                        senha = ler.nextLine();
                    } while(senha.length() != 4);
                    
                    /*
                     * Op��o pra demonstrar a utiliza��o do Salt como poss�vel
                     * forma de evitar o ataque de for�a bruta via dicion�rio.
                     */
                    do {
                    	System.out.print("Deseja cadastrar usando Salt (0 = N�o / 1 = Sim): ");
                        opcaoSalt = Integer.parseInt(ler.nextLine());
                    } while(opcaoSalt < 0 || opcaoSalt > 1);
                                        
                    if(Usuario.cadastrarUsuario(usuario, senha, opcaoSalt) == true) {
                    	System.out.println("Usu�rio cadastrado com sucesso!");
                    }
                    
                    System.out.println("\nTecle algo para prosseguir...");
                    ler.nextLine();
                    System.out.flush(); 
                    break;
                case 2:
                    System.out.print ("Entre com o nome do usu�rio: ");
                    usuario = ler.nextLine();
                    System.out.println("Entre com a senha: ");
                    senha = ler.nextLine();
                    
                    if(Usuario.autenticarUsuario(usuario, senha) == true) {
                    	System.out.println("Usu�rio autenticado!");
                    } else {
                    	System.out.println("Usu�rio ou senha inv�lido!");
                    }
                    
                    System.out.println("\nTecle algo para prosseguir...");
                    ler.nextLine();
                    System.out.flush(); 
                    break;
                case 3:
                	ArrayList<String> usuarios = Usuario.getUsuarios();
                	try	{
        				ForcaBruta fb = new ForcaBruta();
        				long start;
        				long end;
        				long total = 0;
        				String resposta;
        			
        				for(String u: usuarios) {
        					if(u.length() == 4) {
        						System.out.println("Usu�rio: " + u);
        					}
                    		if(u.length() > 4) {
                    			start = System.nanoTime();
                    			resposta = fb.crack(u);
                    			System.out.println("Senha: " + resposta);
                    			end = System.nanoTime();
                    			System.out.println("Tempo para processar: " + ((end - start)/1000000000) + "s\n");
                    			total += ((end - start)/1000000000);
                    		}
                    	}
        				System.out.println("-> Tempo total processado: " + total + "s");
        			}catch(Exception e){
        				System.out.println(e.getMessage());
        			}
                	
                	System.out.println("\nTecle algo para prosseguir...");
                    ler.nextLine();
                    System.out.flush();
                	break;
                case 4:
                    fim = true;
                    System.out.println("....... finalizando!");
                    break;
                default:
                    System.out.println("Op��o incorreta. Tente novamente!");
            }
        }
	}
}
