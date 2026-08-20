package Controller;
import javax.swing.JOptionPane;

import edu.fatec.zl.com.br.*;
public class ConverteController {
	Pilha p = new Pilha();
	
	public void decToBin(int x) throws Exception{
		int aux;
		int b = x;
		while (x>=2) {
			aux = x%2;
			System.out.print(aux + " ");
			p.push(aux);
			x = x/2;
		}
		if  (x%2 == 1) {
			System.out.print(1);
			p.push(1);

		}
		System.out.print("\n//////////////////"+"\n" + b + " em binário é -> ");
		String s = " ";
		 while (p.isEmpty() == false) {
			 s = s+ String.valueOf(p.pop());
		 }
		 System.out.print(s);  
		 JOptionPane.showMessageDialog(null, b + " em binário é -> " + s);

	}

}
