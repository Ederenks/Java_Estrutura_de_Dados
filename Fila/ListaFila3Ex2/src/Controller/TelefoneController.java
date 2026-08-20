package Controller;
import br.edu.fateczl.fila.*;

public class TelefoneController {
	
	
	public <T> void insereLigacao(Fila<T> f, String num) throws Exception{
		f.insert((T) num);
		System.out.println(num + " - Adicionado");
	}
	
	public <T> void consultaLigacoes(Fila<T> f) throws Exception {
		if (f.isEmpty()) {
			throw new Exception("Não há ligações perdidas");

		}
	      	System.out.println("Ligação de: " + f.remove());
	        
		
	}
}
