package Controller;
import edu.fatec.zl.com.br.*;
public class NPRController {
	

	Pilha p = new Pilha();
	
	public void insereValor(Pilha p, int x) {
		p.push(x);
		
	}
	
	public int npr(Pilha p, String op) throws Exception {
		
		if (!p.isEmpty()) {
			int a = p.pop();
			if(!p.isEmpty()) {
				int b = p.pop();
				
				if(op.equals("div")) 
				{
					int r= b/a;
					p.push(r);
					return r;
				}else { if(op.equals("mul"))
					{
						int r = b*a;
						p.push(r);
						return r;
					}else if(op.equals("som")) 
					{
						int r = a+b;
						p.push(r);
						return r;
					}else {
						int r = b-a;
						p.push(r);
						return r;
					}
				}
			
			}else{
				Exception e3 =new Exception("");
				System.err.println(e3);				
			}
		}else{
			Exception e3 =new Exception("");
			System.err.println(e3);	}
	return 0;
	}
	
}
