import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorrenda;
        double valorpm;

        System.out.println("Informe a sua renda mensal:");
        valorrenda = entrada.nextDouble();
        System.out.println("Qual o valor que voce deseja pagar no financiamento?");
        valorpm = entrada.nextDouble();
        if (valorpm > 0.30 * valorrenda) {
            System.out.println("Financiamento negado por alta prestacao!");
        } else if (valorpm > 3000 && valorrenda < 10000) {
            System.out.println("Financiamento negado por baixa renda!");
        } else {
            System.out.println("Financiamento aprovado!");

        }
    }
}
