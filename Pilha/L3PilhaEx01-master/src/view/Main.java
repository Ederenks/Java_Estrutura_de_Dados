package view;
import Controller.vetController;
public class Main {
	
	public static void main(String[] args) throws Exception{
		vetController op = new vetController();
		int x = op.vetNo();
		System.out.println("Tamanho da pilha: " + x);
	}
}
