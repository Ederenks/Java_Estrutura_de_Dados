package view;
import javax.swing.JOptionPane;

import Controller.ConverteController;
public class main {

	public static void main(String[] args)throws Exception {
		ConverteController op = new ConverteController();
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo (de 0 a 1000) para converter em binario"));
		while (x>1000 || x<0) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Erro! Digite o termo para converter em binario (menor que 1000)"));
		}
		op.decToBin(x);
	}

}
