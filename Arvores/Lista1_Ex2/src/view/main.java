package view;
import br.edu.fateczl.arvore.caractere.ArvoreChar.*;
public class main {

	public static void main(String[] args) {
		char [] vet = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A','E', 'H', 'Q' ,'T','W','K'};
		Arvore ar = new Arvore();
		for(int i: vet) {
			ar.insert(i);
		}
		ar.remove('F');
		ar.remove('U');
		
		ar.prefixSearch();
		ar.infixSearch();
		ar.postfixSearch();
	}

}
