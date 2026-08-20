package view;
import br.edu.fateczl.fila.Fila;
public class main {
	public static void main(String[]args) {
		Fila f = new Fila();
		f.insert(3);
		f.insert(10);
		f.insert(1);
		f.insert(20);
		f.insert(18);
		f.insert(7);
		f.insert(4);
		f.insert(16);
		f.insert(2);
		f.insert(9);
		f.insert(12);
		f.insert(14);
		//////////////
		System.out.println(f.remove());//3
		int v2 = (int) f.remove();//10
		int v1= (int) f.remove();//1
		System.out.println(f.remove());//20
		int v5 = (int) f.remove();//18
		int aux = (int) f.remove();//7
		int aux3 = (int) f.remove();//4
		System.out.println(f.remove());//16
		System.out.println(aux3);//4
		System.out.println(aux);//7
		int v3= (int) f.remove();//2
		int v4= (int) f.remove();//9
		aux = (int) f.remove();//12
		System.out.println(f.remove());
		System.out.println(aux);
		System.out.println("////////////////////");
		f.insert(v1);
		f.insert(v2);
		f.insert(v3);
		f.insert(v4);
		f.insert(v5);
		f.list();
		
		
		
		
	}
}
