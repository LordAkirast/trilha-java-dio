package edu.daniel.argumentos;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Entre com o nome: ");
        String nome = scanner.next();
        
        //String sobrenome = args[1];
        //int idade = Integer.valueOf(args[2]);
        System.out.println("Entre com a altura: ");
        double altura = scanner.nextDouble();
        
        System.out.println("Meu nome é " + nome + " E minha altura é: " + altura);

        //System.out.println("Olá! Eu me chamo " + nome + " " + sobrenome + " Tenho " + idade + " anos e tenho " + altura + " de altura.");


    }
}
