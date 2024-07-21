package edu.daniel.controlefluxo;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.00;
        double valorSolicitado = 17.00;

        if (saldo < valorSolicitado) {
            System.out.println("/nValor solicitado maior que o saldo!");
        } else {
            saldo = saldo - valorSolicitado;
            System.out.print("\n" + saldo);
        }
    }
    
    
}
