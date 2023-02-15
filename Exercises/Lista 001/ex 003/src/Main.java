/*
Joao Victor Rocha Vilela Godoi
3 perido 2023/1
Lista -1
Atividade 3
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        System.out.println("Digite numeros aleatorios e quando quiser parar digite (-1)");

        while (true) {
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            count++;
            sum += num;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        if (count == 0) {
            System.out.println("Valor invalido");
        } else {
            double media = (double) sum / count;

            System.out.println("A quantidade de números digitados pelo usuário; " + count);
            System.out.println("O maior número digitado; " + max);
            System.out.println("O menor número digitado;" + min);
            System.out.println("A média dos números digitados; " + media);
        }

        scanner.close();
    }
}
