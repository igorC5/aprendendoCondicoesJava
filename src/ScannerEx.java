import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome = "";
        Integer idade = 0;
        Double peso = 0.0;

        System.out.println("Escreva seu nome: ");
        nome = input.nextLine();

        System.out.println("Escreva sua idade: ");
        idade = input.nextInt();

        System.out.println("Escreva sua peso: ");
        peso = input.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);


    }
}
