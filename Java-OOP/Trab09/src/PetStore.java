import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PetStore {
	
	private ArrayList<Mamifero> mamiferos;
	
	public PetStore() {
		mamiferos = new ArrayList<Mamifero>();
	}
	
	public void adicionaAnimal(Mamifero mani) {
		mamiferos.add(mani);
	}
	
	public void listarAnimais() {
		for(Mamifero m: mamiferos) {
			System.out.println(m.toString());
		}
		System.out.println("Total = " + mamiferos.size() + " animais listados com sucesso!\n");
	}
	
	public void excluirAnimal(Mamifero mani) {
		if(mani != null) {
			if(this.mamiferos.contains(mani)) {
				this.mamiferos.remove(mani);
				System.out.println("[Animal Nome: " + mani.toString() + "excluido com sucesso!]");
			}else {
				System.out.println("Animal inexistente!\n");
			}
		}
	}
	
	public void excluirAnimais() {
		mamiferos.clear();
		System.out.println("Animais excluídos com sucesso!\n");
	}
	
	public void gravarAnimais() {
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream("animais.dad"));
			for(Mamifero mani: mamiferos) {
				outputStream.writeObject(mani);
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
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public void recuperarAnimais() {
		ObjectInputStream inputStream = null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream("animais.dad"));
			Object obj = null;
			while((obj = inputStream.readObject()) != null) {
				if(obj instanceof Gato) {
					this.mamiferos.add((Gato)obj);
				} else if (obj instanceof Cao) {
					this.mamiferos.add((Cao)obj);
				}
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(inputStream != null) {
					inputStream.close();
					System.out.println("Animais recuperados com sucesso!\n");
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
