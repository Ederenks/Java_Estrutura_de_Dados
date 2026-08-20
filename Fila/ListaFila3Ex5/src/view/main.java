package view;

import controller.ParqueController;
import model.Pessoa;
import br.edu.fateczl.fila.*;

public class main {

    public static void main(String[] args) {

        Fila fila = new Fila();
        ParqueController controller = new ParqueController();

        try {

            for (int i = 1; i <= 30; i++) {

                String nome = "Pessoa" + i;

                int idade = 10 + (int)(Math.random() * 31); // 10 a 40
                float altura = 1.35f + (float)(Math.random() * 0.65); // 1.35 a 2.00

                Pessoa p = new Pessoa(nome, idade, altura);

                fila.insert(p);
            }

            controller.brinquedo(fila);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}