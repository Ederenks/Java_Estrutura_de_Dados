package view;
import Controller.OperacaoController;
import model.cliente;
import br.edu.fateczl.fila.Fila;

/*OBJETIVO: Simular uma fila de um atacado de roupa, onde há informações
 * como nome, quantidade de peças, e valor da peça. No fim mostra os cl
 */

public class main {

	public static void main(String[] args) {

		Fila<cliente> fila = new Fila<>();
		OperacaoController op = new OperacaoController();

		try {
			fila.insert(new cliente("Cliente1", 32, 15));
			fila.insert(new cliente("Cliente2", 45, 40));
			fila.insert(new cliente("Cliente3", 21, 10));
			fila.insert(new cliente("Cliente4", 38, 60));
			fila.insert(new cliente("Cliente5", 27, 25));
			fila.insert(new cliente("Cliente6", 50, 80));
			fila.insert(new cliente("Cliente7", 29, 12));
			fila.insert(new cliente("Cliente8", 41, 35));
			fila.insert(new cliente("Cliente9", 23, 8));
			fila.insert(new cliente("Cliente10", 36, 50));
			fila.insert(new cliente("Cliente11", 48, 90));
			fila.insert(new cliente("Cliente12", 20, 7));
			fila.insert(new cliente("Cliente13", 34, 45));
			fila.insert(new cliente("Cliente14", 39, 20));
			fila.insert(new cliente("Cliente15", 26, 70));
			fila.insert(new cliente("Cliente16", 44, 18));
			fila.insert(new cliente("Cliente17", 31, 55));
			fila.insert(new cliente("Cliente18", 28, 30));
			fila.insert(new cliente("Cliente19", 37, 22));
			fila.insert(new cliente("Cliente20", 22, 100));

		} catch (Exception e) {
			System.out.println("Erro ao inserir: " + e.getMessage());
		}
		while (!fila.isEmpty())
		op.caixa(fila);
	}
}