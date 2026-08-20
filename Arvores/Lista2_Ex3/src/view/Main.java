package view;

import model.arvore;

public class Main {

    public static void main(String[] args) {

        char[] vet = {
            'k','d','m','b','f',
            'l','t','c','p','z','r'
        };

        arvore ar = new arvore();

        for(char c : vet) {
            ar.insert(c);
        }
        ar.remove('m');
        System.out.println("Prefixa:");
        ar.prefixa();

        System.out.println("Infixa:");
        ar.infixa();

        System.out.println("Posfixa:");
        ar.posfixa();

    }
}