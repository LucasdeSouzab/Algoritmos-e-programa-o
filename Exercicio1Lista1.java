import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        double resultado;
        System.out.println("Informe o numero:");
        numero = entrada.nextDouble();
        resultado = numero*2;
        System.out.println("O dobro e:" + "" + resultado);


    }
}
