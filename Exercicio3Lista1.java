import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int idade;
        int idadeemmeses;

        System.out.println("Qual sua idade?");
        idade = input.nextInt();
        idadeemmeses = idade *12;

        System.out.println("Sua idade em meses é: "+ ""+ idadeemmeses);
    }

    }
