package view;
import Controller.NPRController;
import javax.swing.JOptionPane;
import edu.fatec.zl.com.br.*;

public class main {
	
	public static void main(String[] args) throws Exception {
		
		Pilha p = new Pilha();
		NPRController op = new NPRController();
		int opc =0;
		while (opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção \n1-Adicionar valor\n2-Deletar valor\n3-Somar\n4-Subtrair\n5-Multiplicar\n6Dividir\n9-fim"));
			switch(opc) {
			
				case 1:
					int x =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
					op.insereValor(p,x);
					break;
				case 2:
					p.pop();
					break;
				case 3: 
					op.npr(p, "som");
					break;
				case 9:
					System.exit(0);
				default: System.out.println("error");
				break;
			}
			
			
		}
	}
}
