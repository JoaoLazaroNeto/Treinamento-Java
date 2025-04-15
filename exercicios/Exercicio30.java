package exercicios;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebendo os vértices do primeiro retângulo
        System.out.println("Digite os vértices do primeiro retângulo:");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        int x4 = sc.nextInt(), y4 = sc.nextInt();

        // Recebendo os vértices do segundo retângulo
        System.out.println("Digite os vértices do segundo retângulo:");
        int x5 = sc.nextInt(), y5 = sc.nextInt();
        int x6 = sc.nextInt(), y6 = sc.nextInt();
        int x7 = sc.nextInt(), y7 = sc.nextInt();
        int x8 = sc.nextInt(), y8 = sc.nextInt();

        // Validando os retângulos
        if (!isRetanguloValido(x1, y1, x2, y2, x3, y3, x4, y4)) {
            System.out.println("Os vértices do primeiro retângulo não formam um retângulo válido.");
            return;
        }
        if (!isRetanguloValido(x5, y5, x6, y6, x7, y7, x8, y8)) {
            System.out.println("Os vértices do segundo retângulo não formam um retângulo válido.");
            return;
        }

        // Determinando os limites dos retângulos
        int[] limites1 = getLimites(x1, y1, x2, y2, x3, y3, x4, y4);
        int[] limites2 = getLimites(x5, y5, x6, y6, x7, y7, x8, y8);

        // Verificando interseção
        if (intersecta(limites1, limites2)) {
            System.out.println("Os dois retângulos se interceptam.");
        } else {
            System.out.println("Os dois retângulos não se interceptam.");
        }

        sc.close();
    }

    // Função para verificar se os vértices formam um retângulo válido
    private static boolean isRetanguloValido(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return (x1 != x2 || y1 != y2) && (x3 != x4 || y3 != y4) &&
                (x1 != x3 || y1 != y3) && (x2 != x4 || y2 != y4);
    }

    // Função para obter os limites do retângulo (mínimo e máximo de x e y)
    private static int[] getLimites(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int minX = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        int maxX = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        int minY = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        int maxY = Math.max(Math.max(y1, y2), Math.max(y3, y4));
        return new int[]{minX, maxX, minY, maxY};
    }

    // Função para verificar se dois retângulos se interceptam
    private static boolean intersecta(int[] limites1, int[] limites2) {
        return !(limites1[1] < limites2[0] || // Retângulo 1 está à esquerda do Retângulo 2
                limites1[0] > limites2[1] || // Retângulo 1 está à direita do Retângulo 2
                limites1[3] < limites2[2] || // Retângulo 1 está abaixo do Retângulo 2
                limites1[2] > limites2[3]);  // Retângulo 1 está acima do Retângulo 2
    }
}