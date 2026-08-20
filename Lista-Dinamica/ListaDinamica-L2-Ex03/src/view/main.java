package view;
import br.edu.fateczl.*;
public class main {

	public static void main(String[] args)throws Exception {
		Lista <Integer> A = new Lista<>();
		A.addFirst(3);
		A.add(5, 1);
		A.add(8, 2);
		A.add(12, 3);
		A.add(9, 4);
		A.add(7, 5);
		A.addLast(16);
		
		Lista <Integer>B = new Lista<>();
		B.addFirst(9);
		B.add(6, 1);
		B.add(2, 2);
		B.add(3, 3);
		B.addLast(7);
		
		Lista<Integer> inter = new Lista<>();
		Lista<Integer> uni = new Lista<>();
		
		for(int i = 0; i< B.size();i++) {
			for(int j = 0; j<A.size();j++) {
				if(A.get(j) == B.get(i)) {
					inter.addLast(A.get(j));
				}
				uni.addLast(A.get(i));
				uni.addLast(B.get(i));
			}
		}
		
		System.out.println("Lista de Intersecção:");
		for(int j = 0; j<A.size();j++) {
			System.out.print(A.get(j) + " ");
		}
		
		System.out.println("Lista de União:");
		for(int j = 0; j<A.size();j++) {
			System.out.print(A.get(j) + " ");
		}
	}

}
