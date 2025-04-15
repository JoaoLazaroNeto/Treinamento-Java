
package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio29 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o ponto 1 (x1): ");
            int x1 = scanner.nextInt();
            System.out.println("Digite o ponto 1 (y1): ");
            int y1 = scanner.nextInt();

            System.out.println("Digite o ponto 2 (x2): ");
            int x2 = scanner.nextInt();
            System.out.println("Digite o ponto 2 (y2): ");
            int y2 = scanner.nextInt();

            if (x1 == x2 && y1 == y2) {
                System.out.println("Os pontos são iguais, não formam um retângulo.");
            } else if (x1 == x2) {
                System.out.println("Os pontos formam uma reta vertical.");
            } else if (y1 == y2) {
                System.out.println("Os pontos formam uma reta horizontal.");
            } else {
                System.out.println("Os pontos formam um retângulo.");
                int largura = Math.abs(x2 - x1);
                int altura = Math.abs(y2 - y1);
                int area = largura * altura;
                System.out.println("Área do retângulo: " + area);

                System.out.println("Digite o ponto 3 (x3 y3): ");
                int x3 = scanner.nextInt();
                int y3 = scanner.nextInt();

                if (x3 < Math.min(x1, x2) && y3 > Math.max(y1, y2)) {
                    System.out.println("O ponto está acima e à esquerda.");
                } else if (x3 > Math.max(x1, x2) && y3 > Math.max(y1, y2)) {
                    System.out.println("O ponto está acima e à direita.");
                } else if (x3 < Math.min(x1, x2) && y3 < Math.min(y1, y2)) {
                    System.out.println("O ponto está embaixo e à esquerda.");
                } else if (x3 > Math.max(x1, x2) && y3 < Math.min(y1, y2)) {
                    System.out.println("O ponto está embaixo e à direita.");
                } else if (y3 > Math.max(y1, y2)) {
                    System.out.println("O ponto está acima.");
                } else if (y3 < Math.min(y1, y2)) {
                    System.out.println("O ponto está embaixo.");
                } else if (x3 < Math.min(x1, x2)) {
                    System.out.println("O ponto está à esquerda.");
                } else if (x3 > Math.max(x1, x2)) {
                    System.out.println("O ponto está à direita.");
                } else if (x3 >= Math.min(x1, x2) && x3 <= Math.max(x1, x2) &&
                        y3 >= Math.min(y1, y2) && y3 <= Math.max(y1, y2)) {
                    System.out.println("O ponto está dentro do retângulo.");
                } else {
                    System.out.println("O ponto está na linha do retângulo.");
                }
            }
            scanner.close();
        }
    }