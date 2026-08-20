package model;

public class arvore {

    private No raiz;

    public void insert(char valor) {
        raiz = insertRec(raiz, valor);
    }

    private No insertRec(No atual, char valor) {

        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.dado) {
            atual.esquerda = insertRec(atual.esquerda, valor);
        }
        else if (valor > atual.dado) {
            atual.direita = insertRec(atual.direita, valor);
        }

        return atual;
    }

    public void infixa() {
        infixaRec(raiz);
        System.out.println();
    }

    private void infixaRec(No atual) {

        if (atual != null) {
            infixaRec(atual.esquerda);
            System.out.print(atual.dado + " ");
            infixaRec(atual.direita);
        }
    }

    public void prefixa() {
        prefixaRec(raiz);
        System.out.println();
    }

    private void prefixaRec(No atual) {

        if (atual != null) {
            System.out.print(atual.dado + " ");
            prefixaRec(atual.esquerda);
            prefixaRec(atual.direita);
        }
    }

    public void posfixa() {
        posfixaRec(raiz);
        System.out.println();
    }

    private void posfixaRec(No atual) {

        if (atual != null) {
            posfixaRec(atual.esquerda);
            posfixaRec(atual.direita);
            System.out.print(atual.dado + " ");
        }
    }

    public boolean busca(char valor) {
        return buscaRec(raiz, valor);
    }
    
    public void remove(char valor) {
        raiz = removeRec(raiz, valor);
    }
    
    private No removeRec(No atual, char valor) {

        if (atual == null) {
            return null;
        }

        if (valor < atual.dado) {
            atual.esquerda = removeRec(atual.esquerda, valor);
        }
        else if (valor > atual.dado) {
            atual.direita = removeRec(atual.direita, valor);
        }
        else {

            // Caso 1: nó sem filhos
            if (atual.esquerda == null && atual.direita == null) {
                return null;
            }

            // Caso 2: apenas filho direito
            if (atual.esquerda == null) {
                return atual.direita;
            }

            // Caso 3: apenas filho esquerdo
            if (atual.direita == null) {
                return atual.esquerda;
            }

            // Caso 4: dois filhos
            No predecessor = maiorDaEsquerda(atual.esquerda);

            atual.dado = predecessor.dado;

            atual.esquerda =
                    removeRec(atual.esquerda, predecessor.dado);
        }

        return atual;
    }
    
    private No maiorDaEsquerda(No atual) {

        while (atual.direita != null) {
            atual = atual.direita;
        }

        return atual;
    }
    private boolean buscaRec(No atual, char valor) {

        if (atual == null) {
            return false;
        }

        if (valor == atual.dado) {
            return true;
        }

        if (valor < atual.dado) {
            return buscaRec(atual.esquerda, valor);
        }

        return buscaRec(atual.direita, valor);
    }
}