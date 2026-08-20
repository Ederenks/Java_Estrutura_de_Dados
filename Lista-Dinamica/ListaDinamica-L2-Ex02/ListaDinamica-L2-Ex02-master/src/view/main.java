package view;
import br.edu.fateczl.*;
import Controller.operacoesController;
public class main {

	public static void main(String[] args)throws Exception {

		    Lista <Integer> lista = new Lista<>();
		    lista.addFirst(10);
		    lista.add(5, 1);
		    lista.add(8, 2);
		    lista.add(1, 3);
		    lista.add(9, 4);
		    lista.add(2, 5);
		    lista.add(4, 6);
		    lista.add(7, 7);
		    lista.add(3, 8);
		    lista.addLast(6);


		    System.out.println("Lista original:");
		    for(int i = 0; i< lista.size();i++) {
			    System.out.print(lista.get(i)+" ");
		    }
System.out.println("\n");
		    operacoesController.ordenar(lista);
		    
		    System.out.println("Lista ordenada:");
		    for(int i = 0; i< lista.size();i++) {

			    System.out.print(lista.get(i)+" ");
		    }


		
	
	}

}
