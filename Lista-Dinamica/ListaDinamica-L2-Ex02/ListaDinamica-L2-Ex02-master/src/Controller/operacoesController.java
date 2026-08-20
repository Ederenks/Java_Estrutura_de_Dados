package Controller;

import br.edu.fateczl.*;

public class operacoesController {

    public static Lista<Integer> ordenar(Lista<Integer> x) throws Exception {

        int tamanho = x.size();

        for(int i = 0; i < tamanho; i++) {

            for(int j = 0; j < tamanho - 1; j++) {

                int a = x.get(j);
                int b = x.get(j + 1);

                if(a > b) {

                    x.remove(j + 1);
                    x.remove(j);

                    x.add(b, j);
                    x.add(a, j + 1);
                }
            }
        }

        return x;
    }
}