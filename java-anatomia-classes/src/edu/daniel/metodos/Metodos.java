package edu.daniel.metodos;

public class Metodos {

    public double dividir(int dividendo, int divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("Não pode dividir por zero.");
        }
        return (double) dividendo / divisor;
    }

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        try {
            System.out.println(metodos.dividir(10, 2)); // Saída: 5.0
            System.out.println(metodos.dividir(10, 0)); // Exceção será lançada
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Saída: Não pode dividir por zero.
        }
    }
}
