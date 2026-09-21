import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Numero = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ola! Informe o numero de vezes que voce quer que a mensagem apareca:");
        Numero = entrada.nextInt();
        for (int i = 0 ; i < Numero; i++){
            System.out.println("Praticando logica de programacao");

        }

    }
}