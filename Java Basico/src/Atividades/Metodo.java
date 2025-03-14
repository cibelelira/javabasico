package Atividades;

public class Metodo {
    public static void main(String[] args) {
        alarmeIntervalo();
        calcularMedia(7.0, 8.0, 9.0);
        calcularMedia(5.0, 3.0, 7.0);
    }

    public static void alarmeIntervalo() {
        System.out.println("Intervalo");
    }

    public static void calcularMedia (double nota1, double nota2, double nota3){
        double mediaAritmetica = (nota1 + nota2 + nota3) / 3.0;
        System.out.println(mediaAritmetica);

        if (mediaAritmetica >= 6)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");
    }
}
