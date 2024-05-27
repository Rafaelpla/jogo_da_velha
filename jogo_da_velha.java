import java.util.Scanner;
import java.util.Random;

public class jogo_da_velha {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Random ran = new Random();
        String jogar_novamente;
        String[][] velha = new String[3][3];
        int contador = 0;
        int posicaoLinha = 0, posicaoColuna = 0;
        String[][] nomePreferencia = new String[2][2];
        boolean jogo = true;
        boolean tentativa = true;

        while (jogo) {
            

            // nome dos jogadores
            System.out.println("Insira o nome do jogador 1: ");
            nomePreferencia[0][0] = sc.nextLine();

            System.out.println("Insira o nome do jogador 2: ");
            nomePreferencia[1][0] = sc.nextLine();

            // inserir valor à velha
            for (int i = 0; i < velha.length; i++) {
                for (int j = 0; j < velha.length; j++) {
                    velha[i][j] = "_";
                }

            }

            // sortear jogador
            int iniciar = ran.nextInt(2);
            System.out.println("O jogador que irá iniciar é: ");
            if (iniciar == 1) {
                System.out.println(nomePreferencia[0][0]);
            } else {
                System.out.println(nomePreferencia[1][0]);
            }

            // bolinha ou xis
            System.out.println("Prefere 'O' ou 'X'?");
            if (iniciar == 1) {
                String escolha = sc.nextLine();
                if (escolha.equals("X")) {
                    nomePreferencia[0][1] = "X";
                    nomePreferencia[1][1] = "O";
                } else {
                    nomePreferencia[0][1] = "O";
                    nomePreferencia[1][1] = "X";
                }
            } else {
                String escolha = sc.nextLine();
                if (escolha.equals("X")) {
                    nomePreferencia[1][1] = "X";
                    nomePreferencia[0][1] = "O";
                } else {
                    nomePreferencia[1][1] = "O";
                    nomePreferencia[0][1] = "X";
                }
            }

            // imprimir velha
            for (int i = 0; i < velha.length; i++) {
                for (int j = 0; j < velha.length; j++) {
                    System.out.print(" | " + velha[i][j]);
                }
                System.out.println(" | ");
            }

            // inicio do jogo
            while (tentativa) {
                System.out.println("Em qual linha você deseja jogar: ");
                posicaoLinha = scInt.nextInt();
                System.out.println("Em qual coluna você deseja jogar: ");
                posicaoColuna = scInt.nextInt();

                // posição disponível
                if (velha[posicaoLinha][posicaoColuna].equals("X") || velha[posicaoLinha][posicaoColuna].equals("O")) {
                    System.out.println("Já há um elemento neste local. Perdeu a chance.");
                } else if (iniciar == 1) {
                    velha[posicaoLinha][posicaoColuna] = nomePreferencia[0][1];
                    iniciar--;
                    contador++;
                } else if (iniciar == 0) {
                    velha[posicaoLinha][posicaoColuna] = nomePreferencia[1][1];
                    iniciar++;
                    contador++;
                }
                // velha
                for (int i = 0; i < velha.length; i++) {
                    for (int j = 0; j < velha.length; j++) {
                        System.out.print(" | " + velha[i][j]);
                    }
                    System.out.println(" | ");
                }
                // vencedor X
                if (velha[0][0].equals("X") && velha[0][1].equals("X") && velha[0][2].equals("X")) {
                    System.out.println("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("X")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[1][0].equals("X") && velha[1][1].equals("X") && velha[1][2].equals("X")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("X")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[2][0].equals("X") && velha[2][1].equals("X") && velha[2][2].equals("X")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("X")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[0][0].equals("X") && velha[1][0].equals("X") && velha[2][0].equals("X")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("X")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[0][1].equals("X") && velha[1][1].equals("X") && velha[2][1].equals("X")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("X")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[0][2].equals("X") && velha[1][2].equals("X") && velha[2][2].equals("X")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("X")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[0][0].equals("X") && velha[1][1].equals("X") && velha[2][2].equals("X")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("X")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[0][2].equals("X") && velha[1][1].equals("X") && velha[2][0].equals("X")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("X")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                }
                //vencedor O
                if (velha[0][0].equals("O") && velha[0][1].equals("O") && velha[0][2].equals("O")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("O")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[1][0].equals("O") && velha[1][1].equals("O") && velha[1][2].equals("O")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("O")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[2][0].equals("O") && velha[2][1].equals("O") && velha[2][2].equals("O")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("O")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[0][0].equals("O") && velha[1][0].equals("O") && velha[2][0].equals("O")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("O")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[0][1].equals("O") && velha[1][1].equals("O") && velha[2][1].equals("O")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("O")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[0][2].equals("O") && velha[1][2].equals("O") && velha[2][2].equals("O")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("O")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[0][0].equals("O") && velha[1][1].equals("O") && velha[2][2].equals("O")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("O")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                } else if (velha[0][2].equals("O") && velha[1][1].equals("O") && velha[2][0].equals("O")) {
                    System.out.print("Jogador vencedor: ");
                    if (nomePreferencia[0][1].equals("O")) {
                        System.out.println(nomePreferencia[0][0]);
                    } else {
                        System.out.println(nomePreferencia[1][0]);
                    }
                    break;
                }

                // empate
                if (contador  > 8) {
                    System.out.println("\nVelha");
                    System.out.println("Deseja tentar denovo? (SIM ou NAO)");
                    contador = 0;
                    String novamente = sc.nextLine();
                    if (novamente.toUpperCase().equals("NAO")) {
                        System.out.println("Tentativa finalizada!");
                        tentativa = false;
                    }else{
                        for (int i = 0; i < velha.length; i++) {
                            for (int j = 0; j < velha.length; j++) {
                                velha[i][j] = "_";
                            }
            
                        }
                    }
                }
            }
            System.out.println("Deseja jogar novamente? (SIM ou NAO)");
            jogar_novamente = sc.nextLine();
            if (jogar_novamente.toUpperCase().equals("NAO")) {
                System.out.println("Obrigado por jogar!");
                jogo = false;
            }else if(jogar_novamente.toUpperCase().equals("SIM")){
                contador = 0;
            }else{
                System.out.println("Resposta Inváida");
                jogo=false;
                tentativa=false;
            }
        }
    }
}
