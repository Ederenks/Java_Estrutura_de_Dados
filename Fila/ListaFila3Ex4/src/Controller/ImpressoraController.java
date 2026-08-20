package Controller;

import br.edu.fateczl.fila.*;
import java.util.Random;

public class ImpressoraController {

    public void insereDocumento(Fila f, String documento) {
        f.insert(documento);
    }

    public void imprime(Fila f) throws Exception {

        if (f.isEmpty()) {
            throw new Exception("Fila de impressão vazia!");
        }

        Random r = new Random();

        while (!f.isEmpty()) {

            String doc = (String) f.remove();

            // separa ID_PC e Nome_Arquivo
            String[] partes = doc.split(";");
            String idPC = partes[0];
            String nomeArquivo = partes[1];

            System.out.println("[#PC: " + idPC + " – Arquivo: " + nomeArquivo + "]");

            // tempo entre 1 e 2 segundos
            int tempo = 1000 + r.nextInt(1000);

            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}