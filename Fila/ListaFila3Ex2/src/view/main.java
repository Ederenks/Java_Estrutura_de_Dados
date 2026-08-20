package view;
import br.edu.fateczl.fila.*;
import Controller.TelefoneController;import java.lang.reflect.InvocationTargetException;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) throws Exception{
		TelefoneController op = new TelefoneController();
		Fila fila = new Fila();
		
		
		int opc= 0;
		while (opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("===================\nSecretaria eletronica\n===================\nDigite uma opção\n1-Consultar ligações\n2-Inserir telefone\n9-Finalizar secretária"));
			switch(opc) {
			case 1:
				try {
					op.consultaLigacoes(fila);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 2:
				op.insereLigacao(fila, (JOptionPane.showInputDialog("Digite o número")));
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null, "Fim!");
				System.exit(9);
				default:
					JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
			}
		}
	}
}
