package edu.daniel.projetoiphone;

import java.util.Scanner;

public class Iphone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        NavegarNaInternet navegar = new NavegarNaInternet();

        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Reprodutor Musical");
        System.out.println("2 - Aparelho Telefônico");
        System.out.println("3 - Navegar na Internet");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("\n---- Reprodutor Musical ----\n");
            System.out.println("1 - Selecionar música");
            System.out.println("2 - Tocar música");
            System.out.println("3 - Pausar música");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    reprodutor.selecionarMusica();
                    break;
                case 2:
                    reprodutor.tocarMusica();
                    break;
                case 3: 
                    reprodutor.pausarMusica();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } else if (opcao == 2) {
            System.out.println("\n---- Aparelho Telefônico ----\n");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Iniciar correio de voz");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    aparelho.ligar();
                    break;
                case 2:
                    aparelho.atender();
                    break;
                case 3: 
                    if (aparelho.estaLigado()) {
                        aparelho.iniciarCorreioDeVoz();
                    } else {
                        System.out.println("Você precisa ligar o aparelho primeiro!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } else if (opcao == 3) {
            System.out.println("\n---- Navegar na Internet ----\n");
            System.out.println("1 - Exibir página");
            System.out.println("2 - Adicionar página");
            System.out.println("3 - Atualizar página");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    navegar.exibirPagina();
                    break;
                case 2:
                    navegar.adicionarPagina();
                    break;
                case 3: 
                    navegar.atualizarPagina();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } else {
            System.out.println("Opção inválida! Tente novamente.");
        }

        scanner.close(); 
    }

    public static class ReprodutorMusical {
        
        public void tocarMusica() {
            System.out.println("A música está tocando...");
        }
        
        public void pausarMusica() {
            System.out.println("A música está pausada.");
        }

        public void selecionarMusica() {
            System.out.println("Selecionando música...");
        }
    }

    public static class AparelhoTelefonico {
        private boolean ligado = false;

        public void ligar() {
            if (!ligado) {
                System.out.println("Ligando aparelho...");
                ligado = true;
                System.out.println("Aparelho ligado.");
            } else {
                System.out.println("O aparelho já está ligado.");
            }
        }
        
        public void atender() {
            if (ligado) {
                System.out.println("Atendendo ligação...");
            } else {
                System.out.println("Você precisa ligar o aparelho primeiro!");
            }
        }

        public void iniciarCorreioDeVoz() {
            if (ligado) {
                System.out.println("Iniciando correio de voz...");
            } else {
                System.out.println("Você precisa ligar o aparelho primeiro!");
            }
        }

        public boolean estaLigado() {
            return ligado;
        }
    }

    public static class NavegarNaInternet {
        public void exibirPagina() {
            System.out.println("Exibindo página...");
        }
        
        public void adicionarPagina() {
            System.out.println("Adicionando página...");
        }

        public void atualizarPagina() {
            System.out.println("Atualizando página...");
        }
    }
}
