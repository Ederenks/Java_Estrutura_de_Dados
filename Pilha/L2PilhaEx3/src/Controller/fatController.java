package Controller;
import edu.fatec.zl.com.br.*;
public class fatController {
	
	public int fatController(int x) throws Exception{
		Pilha p = new Pilha();
		int v1;
		int v2;
		for(int i = x; i >0;i--) { //preencher a Pilha
			p.push(i);
		}
		if (!p.isEmpty()) {
			v1 = (p.pop());
			if (!p.isEmpty()) {
				v2 = (p.pop());
			}
			else {
				return v1;//Se x for 1
			}
			v1 = v1*v2;
			while(!p.isEmpty()) {
				v2 = p.pop();
				v1 = v1*v2;
			}	
		} else {
			return 1;//Se for vazia, significa que x = 0, entao retornar 1;
		}
		return v1;
	}
}
