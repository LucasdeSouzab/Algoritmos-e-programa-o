import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senhacerta = 2007;
        int tentativa;
        int contador = 0;
        System.out.print("Informe a senha:");
         tentativa = entrada.nextInt();
         contador++;
        while (tentativa != senhacerta) {
            System.out.println("Senha incorreta! tente novamente");
            System.out.print("Informe a senha:");
            tentativa = entrada.nextInt();
        }
        System.out.println("Senha correta!");
        System.out.println("Total de tentativas " + contador);
    }
}
