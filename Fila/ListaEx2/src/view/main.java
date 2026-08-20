package view;
import fila.edu.fatec.zl.br.*;
import edu.fatec.zl.com.br.*;
public class main {
	public static void main(String[] args)throws Exception {
		Fila op = new Fila();
		Pilha aux = new Pilha();
		
		op.insert(18);
		op.insert(39);
		op.insert(12);
		op.insert(73);
		op.insert(90);
		op.insert(61);
		
		while(!op.isEmpty()) {
			aux.push(op.remove());
		}
		while (!aux.isEmpty()) {
			int x;
			x = aux.pop();
			op.insert(x);
			System.out.println(x + " ");
		}
	}
}
