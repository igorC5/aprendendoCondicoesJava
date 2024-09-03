import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        String usuario = "igorC5";
        String senha = "102030";

        String usuario_digitado;
        String senha_digitado;

        Scanner input_atv4 =  new Scanner(System.in);

        System.out.println("Digite seu usuario");
        usuario_digitado = input_atv4.next();

        System.out.println("Digite sua senha");
        senha_digitado = input_atv4.next();

        if (usuario.equals(usuario_digitado) && senha.equals(senha_digitado)){
            System.out.println("Acesso feito com sucesso");
        }else{
            System.out.println("Ocorreu uma falha no acesso");
        }

    }
}
