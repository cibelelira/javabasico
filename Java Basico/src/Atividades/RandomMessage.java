package Atividades;

import java.util.Scanner;

public class RandomMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número entre 1 a 10: ");
        int numero = scanner.nextInt();

        if (numero >= 1 || numero <= 5)
                System.out.println("Hoje é um dia de sorte!!");
        else
            System.out.println("Sua sorte não está ao seu favor hoje.");

        scanner.close();
    }
}
