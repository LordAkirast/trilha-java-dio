package edu.daniel.argumentos;

public class AboutMe {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá! Eu me chamo " + nome + " " + sobrenome + " Tenho " + idade + " anos e tenho " + altura + " de altura.");


    }
}
