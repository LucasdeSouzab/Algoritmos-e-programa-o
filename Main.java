import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double valor;
        double porcentagem;
        double novovalor;
        System.out.println("Digite o valor do produto: ");
        valor = input.nextInt();
        porcentagem = valor * 10/100;
        novovalor = valor - porcentagem;

        System.out.println("O produto com 10% de desconto é" + " " + novovalor);
    }

    }
