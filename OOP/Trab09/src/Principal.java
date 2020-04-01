
public class Principal {

	public static void main(String[] args) {
		PetStore pet = new PetStore();
		
		Gato felix = new Gato("Felix", 2, "Maria");
		Gato garfield = new Gato("Garfield", 7, "Maria");
		Cao rex = new Cao("Rex", 2, "Jose");
		Cao toto = new Cao("Toto", 5, "Jose");
		pet.adicionaAnimal(felix);
		pet.adicionaAnimal(garfield);
		pet.adicionaAnimal(rex);
		pet.adicionaAnimal(toto);
		pet.listarAnimais();
		pet.gravarAnimais();
		pet.excluirAnimal(garfield);
		pet.listarAnimais();
		pet.excluirAnimais();
		pet.listarAnimais();
		pet.recuperarAnimais();
		//pet.listarAnimais();
		
	}
}