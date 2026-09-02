import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kWh;
        double valor;

        System.out.println("qual a quantidade de kWh consumido:");
        kWh = input.nextInt();
        if (kWh >= 0 && kWh <=100) {
            valor = kWh*0.50;
            System.out.printf("o valor do kWh é de 0,50 e o valor da sua conta é: R$ %.%2f%n" , valor);
        }else if ( kWh >= 101 && kWh <= 200){
            valor = kWh*0.70;
            System.out.printf("o valor do kWh é de 0,70 e o valor da sua conta é: R$ %.%2f%n" , valor);
        }else {
            valor = kWh * 0.90;
            System.out.printf("o valor do kWh é de 0,90, e o valor da sua conta é: R$ %.%2f%n", valor);
        }

    }
}