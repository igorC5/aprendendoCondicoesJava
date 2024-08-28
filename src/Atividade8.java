import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println("Insira uma temperatura em graus celsius: ");
        double temp = input.nextDouble();

        if(temp > 30){
            System.out.println("Quente");
        }else if(temp > 15 && temp <= 30){
            System.out.println("Agradável");
        }else if(temp < 15){
            System.out.println("Frio");
        }

    }
}
