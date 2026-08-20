package Controller;
import fila.edu.fatec.zl.br.*;
public class filaController {
	
	public void filaComum(Fila fila, int c) {
		fila.insert(c);
	}
	
	public void filaprio(Fila fPrio, int c) {
		fPrio.insert(c);
		
	}
	
	public void chamar(Fila fila)throws Exception {
		System.out.println(fila.remove());
	}
}
