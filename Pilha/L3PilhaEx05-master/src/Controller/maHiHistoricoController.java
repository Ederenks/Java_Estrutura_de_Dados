package Controller;

public class maHiHistoricoController{

    public HistoricoController() {
        super();
    }

    public void inserir(PilhaString p, String url) throws Exception {

        if (!url.startsWith("http://www.")) {
            throw new Exception("URL inválida! Deve começar com http://www.");
        }

        if (!url.contains(".")) {
            throw new Exception("URL inválida! Deve conter domínio (.com, .br, etc)");
        }

        p.push(url);
    }
    public String remover(PilhaString p) throws Exception {
        if (p.isEmpty()) {
            throw new Exception("Histórico vazio!");
        }
        return p.pop();
    }

    public String consultar(PilhaString p) throws Exception {
        if (p.isEmpty()) {
            throw new Exception("Histórico vazio!");
        }
        return p.top(); 
    }
}
}
