package Atividades;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qualquer coisa: ");
        String input = scanner.next(); //entrada de dados

        System.out.println(input); //saida de dados

        scanner.close();
    }
}
