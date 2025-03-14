package Atividades;

import java.util.Scanner;

public class Calculadora_Trabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite o número de horas: ");
        double numeroHoras = scanner.nextDouble();

        double salario = calcularSalario(valorHora, numeroHoras);
        System.out.println(salario);
    }

    public static double calcularSalario(double valorHora, double numeroHoras) {
        double salario = valorHora * numeroHoras;
        return salario;
    }
}
