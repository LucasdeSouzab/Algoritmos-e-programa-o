import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        int N1;
        int N2;
        int N3;
        int maior;
        System.out.println("Digite o primeiro numero:");
        N1 = entrada.nextInt();
        System.out.println("Digite o segundo numero:");
        N2 = entrada.nextInt();
        System.out.println("Digite o terceiro numero:");
        N3 = entrada.nextInt();
         if (N1>=N2 && N1>=N3 ) {
             maior = N1;
             System.out.printf("O maior numero é:" + "" + N1);
         }else if (N2>=N1 && N2>=N3) {
             maior = N2;
             System.out.printf("O maior numero é:" + "" + N2);
         }else{
             System.out.printf("O maior numero é:" + "" + N3);

         }
    }
}
