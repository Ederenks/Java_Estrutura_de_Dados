package Controller;
import br.edu.fateczl.fila.*;
import model.cliente;

public class OperacaoController {
	
	public void caixa(Fila<cliente> fila) {
		
			try {
				cliente c = fila.remove();
				System.out.println(c.toString());

				double r=  c.getQtd() * c.getvalorPecas();
				System.out.println("-/--/--/--/--/--/--/--/--/--/--/-");
				System.out.println("Valor total = " + r);
				System.out.println("-/--/--/--/--/--/--/--/--/--/--/-");
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
		
	}
}
