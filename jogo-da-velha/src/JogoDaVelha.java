import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        char[][] tabuleiro = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char jogadorAtual = 'X';
        boolean jogoEmAndamento = true;

        while (jogoEmAndamento) {
            exibirTabuleiro(tabuleiro);
            realizarJogada(tabuleiro, jogadorAtual);
            jogoEmAndamento = verificarStatus(tabuleiro, jogadorAtual);

            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
    }

    private static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
        System.out.println();
    }

    private static void realizarJogada(char[][] tabuleiro, char jogador) {
        Scanner scanner = new Scanner(System.in);

        int linha, coluna;
        do {
            System.out.println("Jogador " + jogador + ", faça sua jogada (linha e coluna): ");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();
        } while (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || tabuleiro[linha][coluna] != ' ');

        tabuleiro[linha][coluna] = jogador;
    }

    private static boolean verificarStatus(char[][] tabuleiro, char jogador) {
        if (verificarVitoria(tabuleiro, jogador)) {
            exibirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogador + " venceu!");
            return false;
        }

        if (verificarEmpate(tabuleiro)) {
            exibirTabuleiro(tabuleiro);
            System.out.println("O jogo terminou em empate!");
            return false;
        }

        return true;
    }

    private static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        // Verificar linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }

        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
            (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }

        return false;
    }

    private static boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
