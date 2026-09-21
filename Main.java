import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        int resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um numero inteiro para multiplicar:");
        numero = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println("O resultado da multiplicacao de" + " "+ numero + "x" + i + " " + "é: " + resultado);

        }


    }
}