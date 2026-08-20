package view;
import br.edu.fateczl.arvore.inteiro.ArvoreInt.Arvore;
public class main {

	public static void main(String[] args) throws Exception{
		int [] vet = {33, 15, 41, 38, 47, 34, 49, 43};
		Arvore ar = new Arvore();
		for(int i: vet) {
			ar.insert(i);
			System.out.print(i + " ");
		}
		ar.prefixSearch();
		ar.infixSearch();
		ar.postfixSearch();
	}

}
