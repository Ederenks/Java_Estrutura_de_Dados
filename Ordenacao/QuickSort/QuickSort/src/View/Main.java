package View;

import Controll.*;

public class Main {
	public static void main(String[] args) {
		QuickSort op = new QuickSort();
		int vet [] = {63,39,18,94,1,29,47,33,73};
		vet = op.quickSort(vet,0,vet.length-1);
		
		for (int i=0; i<vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
		
	}
}
