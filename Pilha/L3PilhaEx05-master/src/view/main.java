package view;

import javax.swing.JOptionPane;
import controller.HistoricoController;
import edu.fatec.zl.com.br.PilhaString;

public class Main {

    public static void main(String[] args) {

        PilhaString historico = new PilhaString();
        HistoricoController controller = new HistoricoController();

        int opc = 0;

        while (opc != 9) {

            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "=== HISTÓRICO ===\n" +
                    "1 - Inserir site\n" +
                    "2 - Remover último\n" +
                    "3 - Consultar último\n" +
                    "9 - Sair"
                ));

                switch (opc) {

                    case 1:
                        String url = JOptionPane.showInputDialog("Digite a URL:");
                        controller.inserir(historico, url);
                        JOptionPane.showMessageDialog(null, "Site adicionado!");
                        break;

                    case 2:
                        String removido = controller.remover(historico);
                        JOptionPane.showMessageDialog(null, "Removido: " + removido);
                        break;

                    case 3:
                        String topo = controller.consultar(historico);
                        JOptionPane.showMessageDialog(null, "Último acessado: " + topo);
                        break;

                    case 9:
                        JOptionPane.showMessageDialog(null, "Encerrando...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
    }
}