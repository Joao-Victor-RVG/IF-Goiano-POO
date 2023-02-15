/*
Joao Victor Rocha Vilela Godoi

3 perido 2023/1

Lista -1
Atividade 1
 */

import java.util.HashMap;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as cores das faixas do seu resisitor:");

        String[] colorEntry = sc.nextLine().replace(" ", "-").split("-");

        HashMap<String, Integer> colorNumber = new HashMap<>();
        colorNumber.put("preto", 0);
        colorNumber.put("marrom", 1);
        colorNumber.put("vermelho", 2);
        colorNumber.put("laranja", 3);
        colorNumber.put("amarelo", 4);
        colorNumber.put("verde", 5);
        colorNumber.put("azul", 6);
        colorNumber.put("violeta", 7);
        colorNumber.put("cinza", 8);
        colorNumber.put("branco", 9);


        System.out.printf("O seu ressitor tem: %s%s OHMs", colorNumber.get(colorEntry[0].toLowerCase()), colorNumber.get(colorEntry[1].toLowerCase()));

    }
}
