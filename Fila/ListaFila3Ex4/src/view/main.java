package view;

import Controller.ImpressoraController;
import br.edu.fateczl.fila.*;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        Fila fila = new Fila();
        ImpressoraController controller = new ImpressoraController();

        int opcao = 0;

        while (opcao != 3) {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Inserir Documento\n2 - Imprimir\n3 - Sair"));

            switch (opcao) {

                case 1:
                    String entrada = JOptionPane.showInputDialog(
                            "Digite no formato: ID_PC;Nome_Arquivo");

                    if (entrada != null && entrada.contains(";")) {
                        controller.insereDocumento(fila, entrada);
                    } else {
                        JOptionPane.showMessageDialog(null, "Formato inválido!");
                    }
                    break;

                case 2:
                    try {
                        controller.imprime(fila);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Encerrando...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}