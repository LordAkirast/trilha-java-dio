package edu.daniel.identacaoifelse;


public class BoletimEstudantil { ///classe
    public static void main(String[] args) { ///metodo
        int mediaFinal = 2; ///fluxo
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
        else if(mediaFinal == 6)
            System.out.println("PROVA DE MINERVA");
        else
            System.out.println("APROVADO");
    }
}
