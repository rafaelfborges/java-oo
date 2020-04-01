import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Usuario {
	public static boolean cadastrarUsuario(String usuario, String senha, int opcaoSalt) {
		if(opcaoSalt == 1) {
        	senha += Criptografia.gerarSalt();
        }
		try {
	        FileWriter gravadorArquivo = new FileWriter("BancoDeDados.txt", true);
	        BufferedWriter bufferedWriter = new BufferedWriter(gravadorArquivo);
	        
	        bufferedWriter.write(usuario);
	        bufferedWriter.newLine();
	        senha = Criptografia.gerarMd5(senha);
	        bufferedWriter.write(senha);
	        bufferedWriter.newLine();
	        bufferedWriter.close();
	        return true;
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
		return false;
	}
	
	public static boolean autenticarUsuario(String usuario, String senha){
		try {
            FileReader reader = new FileReader("BancoDeDados.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            senha = Criptografia.gerarMd5(senha);
            int autenticacao = 0;
                        
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                if(usuario.equals(linha)) {
                	autenticacao++;
                }
                if(senha.equals(linha)) {
                	autenticacao++;
                }
            }
            reader.close();
            
            if(autenticacao == 2) {
            	return true;
            }
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
		return false;
	}
	
	public static ArrayList<String> getUsuarios() {
		ArrayList<String> usuarios = new ArrayList<String>();
		try {
			FileReader reader = new FileReader("BancoDeDados.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                usuarios.add(linha);
            }
            reader.close();
            
            return usuarios;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
