package view;
import br.edu.fateczl.arvore.inteiro.ArvoreInt.Arvore;
public class main {

	public static void main(String[] args) throws Exception{
		int [] vet = {30,15,60,10,20,40,80};
		Arvore ar = new Arvore();
		System.out.println("Identificar a ordem crescente\n ---------------\nÁrvore:");
		for(int i: vet) {
			ar.insert(i);
			System.out.print(i + " ");
		}
		ar.remove(60);

		ar.infixSearch();
	
	}
}
