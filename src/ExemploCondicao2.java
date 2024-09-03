import java.util.Scanner;

public class ExemploCondicao2 {

    //Quero add um desconto gradativo
    // valor Maior que 1000  - 10%
    // valor Maior que 2000  - 20%
    // valor Maior que 3000  - 30%

    // valor Menor que 1000  - 0%

    public static void main(String[] args) {

        double valorBruto = 3000;
        double desconto;

        // && E
        // || ou

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor bruto:");
        valorBruto = scan.nextDouble();


        if (valorBruto >= 3000){
            desconto = valorBruto * 0.3;
        } else if (valorBruto >= 2000) {
            desconto = valorBruto * 0.2;
        } else if (valorBruto >= 1000) {
            desconto = valorBruto * 0.1;
        }else{
            desconto = 0;
        }

        System.out.println("Valor Bruto é: " + valorBruto);
        System.out.println("Valor do desconto é: " + desconto);
        System.out.println("O valor liquido é: " + (valorBruto - desconto));

    }
}
