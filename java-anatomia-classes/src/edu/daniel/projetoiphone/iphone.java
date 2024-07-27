package edu.daniel.projetoiphone;

import java.util.Scanner;

public class iphone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        
        
        

        

        aparelhoTelefonico aparelho = new aparelhoTelefonico();
        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioDeVoz();

        NavegarNaInternet navegar = new NavegarNaInternet();
        navegar.exibirPagina();
        navegar.atualizarPagina();
        navegar.atualizarPagina();

        System.out.println("\n1 - aparelho \n 2 - reprodutor \n 3 - navegar");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("\n---- Reprodutor ----\n");
            System.out.println("\n1 - selecionar musica \n 2 - tocar musica \n 3 - pausar musica\n");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    reprodutor.selecionarMusica();
                    break;
                case 2:
                    reprodutor.tocarMusica();
                case 3: 
                    reprodutor.pausarMusica();
                default:
                    throw new AssertionError();
            }
        } else if (opcao == 2) {
            System.out.println("\n---- Aparelho ----\n");
            System.out.println("\n1 - selecionar musica \n 2 - tocar musica \n 3 - pausar musica\n");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    reprodutor.selecionarMusica();
                    break;
                case 2:
                    reprodutor.tocarMusica();
                case 3: 
                    reprodutor.pausarMusica();
                default:
                    throw new AssertionError();
            }

        }



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

        public static class aparelhoTelefonico {

            public void ligar() {
                System.out.println("Ligando aparelho...");
                System.out.println("Aparelho ligado.");
            }
            
            public void atender() {
                System.out.println("Atendendo ligação...");
            }
    
            public void iniciarCorreioDeVoz() {
                System.out.println("Iniciando correio de voz...");
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

