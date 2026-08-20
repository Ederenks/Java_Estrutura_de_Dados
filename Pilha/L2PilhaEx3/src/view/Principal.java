package view;
import javax.swing.*;
import Controller.fatController;
public class Principal {
	public static void main(String[] args)throws Exception {
	int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero (0 a 10) para fatorar"));
	while (x> 10 || x< 0) {
		 x = Integer.parseInt(JOptionPane.showInputDialog("Erro! Digite um numero (0 a 10) para fatorar"));
		}
	fatController op = new fatController();
	System.out.println("Fatorial de " + x + " é -> " + op.fatController(x) );
	System.exit(x);
	}
}
