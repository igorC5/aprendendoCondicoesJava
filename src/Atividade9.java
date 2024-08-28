import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = input.nextInt();

        if (num > 0){
            System.out.println("Maior que 0");
        } else if (num < 0) {
            System.out.println("Menor que 0");
        } else if (num == 0) {
            System.out.println("Igual a 0");
        }
    }
}
