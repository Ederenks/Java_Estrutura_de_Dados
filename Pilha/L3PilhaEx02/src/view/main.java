package view;
import edu.fateczl.br.*;
public class main {
	public static void main(String[] args) throws Exception {
		PilhaString p = new PilhaString();
		p.push("W");
		p.push("L");
		p.push("H");
		p.push("B");
		p.push("R");
		p.push("G");
		p.push("J");
		PilhaString aux = new PilhaString();
		p.pop();
		aux.push("K");
		aux.push(p.pop());
		System.out.println(p.pop());
		aux.push("M");
		aux.push(p.pop());
		p.pop();
		aux.push(p.pop());
		System.out.println(p.pop());
		
		while(!aux.isEmpty()) {
			p.push(aux.pop());
		}
		
		
	}
}
