import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        double resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o numero:");
        numero = entrada.nextInt();
        if (numero % 2 == 0){

            resultado = numero * numero;
            System.out.printf("O numero que voce informou e par,e seu rsultado ao quadrado é: %.2f%n", resultado);
        }else{
            resultado = numero * numero * numero;
            System.out.printf("Seu numero é impar e o seu resultado ao cubo é: %.2f%n", resultado);
        }



    }
}
