package Controller;
import edu.fatec.zl.com.br.*;
public class vetController {
	public int vetNo() throws Exception {
		Pilha p = new Pilha();
		int [] vet = {0,5,7,-4,3,5,-2,-1,10,4,3,-6,2,-9,1,5};
		for(int i=0;i<vet.length;i++) {
			if (vet[i] >=0) {
				p.push(vet[i]);
			}else {
				int aux = p.pop();
				aux = aux + p.pop();
				p.push(vet[i]);
				p.push(aux);
			}
		}
		return p.tamanho();
	}
	
}
