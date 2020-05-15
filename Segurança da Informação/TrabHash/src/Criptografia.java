import java.math.BigInteger; 
import java.security.MessageDigest;
import java.security.SecureRandom;  

public class Criptografia { 
    public static String gerarMd5(String input) { 
    	
        try { 
            MessageDigest md = MessageDigest.getInstance("MD5"); 
            byte[] messageDigest = md.digest(input.getBytes()); 
            BigInteger no = new BigInteger(1, messageDigest); 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        } catch (Exception e) { 
            System.out.println(e.getMessage()); 
        }
        return null;
    }
    
    public static String gerarSalt() {
    	String minuscula = "abcdefghijklmnopqrstuvwxyz";
    	String maiuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	String numerocaracter = "0123456789!@#$%¨&*()-+";
    	String alfabeto = minuscula + maiuscula + numerocaracter;
    	    	
    	//Gera um texto aleatório.
    	int tamanhoTexto = 2048;
    	StringBuilder textoAleatorio = new StringBuilder(tamanhoTexto);
    	SecureRandom random = new SecureRandom();
    	for (int i = 0; i < tamanhoTexto; i++) {
    		int randCharAt = random.nextInt(alfabeto.length());
    		char randChar = alfabeto.charAt(randCharAt);
    		textoAleatorio.append(randChar);
    	}
    	
    	//Gera um salt com SHA-256, converte para hexadecimal e retorna como String.
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256"); 
            byte[] messageDigest = md.digest(textoAleatorio.toString().getBytes("UTF-8")); 

            textoAleatorio.setLength(0);
            for (byte b : messageDigest) {
              textoAleatorio.append(String.format("%02X", 0xFF & b));
            }
            String salt = textoAleatorio.toString();
            
            return salt;
        } catch (Exception e) { 
            System.out.println(e.getMessage()); 
        }
        return null;
    }
}