package view;
import javax.swing.JOptionPane;
import Controller.filaController;
import fila.edu.fatec.zl.br.*;
public class main {
	
	/*
	 * Objetivo: Esse novo projeto simulará uma
		necessidade de muitas empresas e ins�tuições que atendem clientes,
		que é criar um canal de geração de senhas para
		pessoas com alguma prioridade e pessoas que não tem nenhuma	prioridade.
*/
	public static void main(String[]args)throws Exception {
		Fila fila = new Fila();
		Fila fprio = new Fila();
		filaController op = new filaController();
		int c = 0;
		int prio = 0;
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite uma opção\n1-Adicionar Senha (sem prioridade)"
					+ "\n2-Adicionar Senha (Prioridade)\n3-Chamar senha\n4-Verificar Filas\n9-Encerrar"));
		switch(opc) {
		
		case 1:
			c++;
			System.out.println("Senha comum ' " + c + " ' adicionada");
			op.filaComum(fila,c);
			break;
			
		case 2: 
			c++;
			System.out.println("Senha prioritária ' " + c + " ' adicionada");

			op.filaprio(fprio, c);
			break;
			
		case 3:

			if ((fprio.isEmpty() && fila.isEmpty()) || fila.isEmpty()) {
				System.err.println("Não há senha na fila");
				break;
			}else {
				if(!fprio.isEmpty()) {
					if(prio<3) {
						op.chamar(fprio);
						prio++;
						break;
					}else {
						op.chamar(fila);
						prio =0;
						break;}
				}else {
					op.chamar(fila);
					prio =0;
					break;
				}
			}

			
		case 4:
			System.out.print("\n Fila comum: ");
			fila.list();
			System.out.print("\n Fila prioritaria: ");
			if(!fprio.isEmpty()) {
				fprio.list();

			}
			System.out.println();
			break;
		case 9:
			System.out.println("------------------\n------------------\n       Fim\n------------------\n------------------");
			System.exit(opc);
		default:
			System.err.println("Inválido");
			break;
			
			
		}
	}
			
		
		
		
	}
}
