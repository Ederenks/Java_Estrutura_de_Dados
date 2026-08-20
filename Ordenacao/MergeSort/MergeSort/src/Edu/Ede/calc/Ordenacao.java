package Edu.Ede.calc;
public class Ordenacao {
	
	public Ordenacao() {
		super();
	}
	//
	public int [] BubleSort(int [] x) {
		int aux;
		System.out.print("{");
		for (int i=0;i<x.length;i++) {
			System.out.print(x[i]);
			if (i<x.length -1) {
				System.out.print(" , ");	
				} 
			}
		System.out.println("}");
		
		for(int i = 0; i<x.length;i++) {
			System.out.println("Rodada #"+i);
			for( int j = 0;j<x.length-1;j++) {
				if(x[j] > x[j+1]) {
					aux = x[j];
					x[j] = x[j+1];
					x[j+1] = aux;
				}
			}
		}
			System.out.print("{");
			for (int i=0;i<x.length;i++) {
				System.out.print(x[i]);
				if (i<x.length -1) {
					System.out.print(" , ");	}
		}
		System.out.print("}");
		return x;
		}

}
