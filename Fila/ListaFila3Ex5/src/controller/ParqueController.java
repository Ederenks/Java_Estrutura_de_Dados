package controller;

import br.edu.fateczl.fila.*;
import model.Pessoa;

public class ParqueController {

    public void brinquedo(Fila fila) throws Exception {

        if (fila.isEmpty()) {
            throw new Exception("Fila vazia!");
        }

        while (!fila.isEmpty()) {

            Pessoa p = (Pessoa) fila.remove();

            if (p.getIdade() > 16 && p.getAltura() > 1.60) {
                System.out.println(p.getNome() + " -> Pode entrar no brinquedo");
            } else {

                String motivo = "";

                if (p.getIdade() <= 16) {
                    motivo += "Idade insuficiente ";
                }

                if (p.getAltura() <= 1.60) {
                    motivo += "Altura insuficiente";
                }

                System.out.println(p.getNome() + " -> NÃO pode entrar (" + motivo + ")");
            }
        }
    }
}