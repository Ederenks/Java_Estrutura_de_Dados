package Controll;

public class QuickSort {
	public QuickSort(){
		super();
	}
	public int [ ] quickSort(int [] vet, int i, int f) {
		if (f>i) {
			int pf= dividir(vet,i,f);
			quickSort(vet,i,pf -1);
			quickSort(vet,pf + 1, f);
		}
		return vet;
		
		
	}
	private int dividir(int [] vet, int i, int f) {
		int pivo = vet[i];
		int pe = i +1;
		int pd= f;
		
		while (pe<=pd) {
			
	
			while(pe<=pd && vet[pe] <= pivo) {
				pe++;
			}
			while (pd>=pe && vet[pd]>pivo) {
				pd--;
			}
			if ( pe < pd) {
			trocar(vet,pe,pd);
				pe++;
				pd--;
			}
		}	
		trocar (vet, i, pd);
		return pd;
	}
	private void trocar(int[] vet, int i, int j) {
		int aux = vet[i];
		vet [i] = vet[j];
		vet[j] = aux;
	}
}
