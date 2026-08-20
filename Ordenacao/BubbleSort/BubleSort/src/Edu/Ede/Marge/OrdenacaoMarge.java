package Edu.Ede.Marge;

public class OrdenacaoMarge {
	
	public OrdenacaoMarge() {
		super();
	}
	
	public int [] mergeSort(int[] vet, int i, int f) {
		if (i < f) {
			int m = (i + f)/2;
			mergeSort(vet,i,m);
			mergeSort(vet,m+1,f);
			intercala(vet,i,m,f);
		}
		return vet;
	}
	private void intercala(int[] vet, int i, int m, int f) {
		int aux []= new int [vet.length];
		for (int l = i; l<=f; l++) {
			aux[i]=vet[i];
		}
		
		int e = i;
		int d = m +1;
		
		for(int c = i; c<= f; c++) {
			if (e > m) {
				vet[c]= aux[d];
				d++;
			}else if(d>f) {
				vet[c] = aux[e];
				e++;
			}else if (aux[e] < aux[d]) {
				vet[c] = aux [e];
				e++;
			}else {
				vet[c] = aux[d];
				d++;
			}
		}
	}
}
