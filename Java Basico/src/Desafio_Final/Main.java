package Desafio_Final;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Joao", 2025, 8.0);
        Estudante estudante2 = new Estudante( "Maria", 2028, 10.0);

        System.out.println(estudante1.anoParaFormatura);
        System.out.println(estudante2.anoParaFormatura);
    }
}
