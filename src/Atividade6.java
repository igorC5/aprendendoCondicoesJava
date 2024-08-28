import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira sua média final:");
        double mediaFinal = input.nextDouble();

        if (mediaFinal >= 7){
            System.out.println("Aprovado!");
        } else if (mediaFinal >= 5) {
            System.out.println("Está em recuperação");
        } else if (mediaFinal < 5) {
            System.out.println("Reprovado!");
        }

    }
}
