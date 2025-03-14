package Atividades;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("Qual o maior planeta do sistema solar?" + " " + "1) Terra 2) Saturno 3) Jupiter");

        System.out.println("Digite a letra de acordo com sua resposta (1, 2 ou 3): ");
        Scanner scanner = new Scanner(System.in);

        int resposta = scanner.nextInt();
        scanner.close();

        if (resposta == 3)
            System.out.println("Resposta correta!");
        else
            System.out.println("Resposta incorreta, reposta correta 3");

        scanner.close();
    }
}
