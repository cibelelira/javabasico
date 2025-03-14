package Atividades;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        boolean greenLight = true;

        while (greenLight == true) {
            System.out.println("Qual a cor do sinal? ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Siga em frente");
            greenLight = scanner.nextBoolean();

        }
        System.out.println("Sinal vermelho, pare.");
    }
}
