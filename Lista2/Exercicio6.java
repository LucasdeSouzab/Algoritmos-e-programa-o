import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int produto;
        int preco;
        int quantidade;
        double valordesc;
        double desc;
        System.out.println("Informe o codigo do produto:");
        produto = entrada.nextInt();
        if (produto >= 1 && produto <= 10) {
            preco = 10;
            System.out.println("Informe a quantidade:");
            quantidade = entrada.nextInt();
            valordesc = quantidade * preco;
            System.out.printf("O valor sem desconto é: %.2f%n", valordesc);

            if (valordesc >= 1 && valordesc <= 250) {
                System.out.println("Voce ganhou 5% de desconto na sua compra");
                desc = valordesc * 0.05;
                valordesc = valordesc - desc;
                System.out.printf("O valor com desconto é: %.2f%n", valordesc);

            } else if (valordesc >= 250 && valordesc <= 500) {
                System.out.println("Voce ganhou 10% de desconto na sua compra");
                desc = valordesc * 0.10;
                valordesc = valordesc - desc;
                System.out.printf("O valor com desconto é: %.2f%n", valordesc);
            } else {
                System.out.println("Voce ganhou 15% de desconto na sua compra");
                desc = valordesc * 0.15;
                valordesc = valordesc - desc;
                System.out.printf("O valor com desconto é: %.2f%n", valordesc);
            }


        } else if (produto >= 11 && produto <= 20) {
            preco = 15;
            System.out.println("Informe a quantidade:");
            quantidade = entrada.nextInt();
            valordesc = quantidade * preco;
            System.out.printf("O valor sem desconto é: %.2f%n", valordesc);

            if (valordesc >= 250 && valordesc <= 500) {
                System.out.println("Voce ganhou 5% de desconto na sua compra");
                desc = valordesc * 0.05;
                valordesc = valordesc - desc;
                System.out.printf("O valor com desconto é: %.2f%n", valordesc);

            } else if (valordesc >= 250 && valordesc <= 500) {
                System.out.println("Voce ganhou 10% de desconto na sua compra");
                desc = valordesc * 0.10;
                valordesc = valordesc - desc;
                System.out.printf("O valor com desconto é: %.2f%n", valordesc);
            } else {
                System.out.println("Voce ganhou 15% de desconto na sua compra");
                desc = valordesc * 0.15;
                valordesc = valordesc - desc;
                System.out.printf("O valor com desconto é: %.2f%n", valordesc);
            }

            } else if (produto >= 21 && produto <= 30) {
                preco = 20;
                System.out.println("Informe a quantidade:");
                quantidade = entrada.nextInt();
                valordesc = quantidade * preco;
                System.out.printf("O valor sem desconto é: %.2f%n", valordesc);

                if (valordesc >= 250 && valordesc <= 500) {
                    System.out.println("Voce ganhou 5% de desconto na sua compra");
                    desc = valordesc * 0.10;
                    valordesc = valordesc - desc;
                    System.out.printf("O valor sem desconto é: %.2f%n", valordesc);

                } else if (valordesc >= 250 && valordesc <= 500) {
                    System.out.println("Voce ganhou 10% de desconto na sua compra");
                    desc = valordesc * 0.10;
                    valordesc = valordesc - desc;
                    System.out.printf("O valor com desconto é: %.2f%n", valordesc);
                } else {
                    System.out.println("Voce ganhou 15% de desconto na sua compra");
                    desc = valordesc * 0.15;
                    valordesc = valordesc - desc;
                    System.out.printf("O valor com desconto é: %.2f%n", valordesc);
                }

                }else if (produto >= 31 && produto <= 40) {
                    preco = 30;
                    System.out.println("Informe a quantidade:");
                    quantidade = entrada.nextInt();
                    valordesc = quantidade * preco;
                    System.out.printf("O valor sem desconto é: %.2f%n", valordesc);

                    if (valordesc >= 1 && valordesc <= 250) {
                        System.out.println("Voce ganhou 5% de desconto na sua compra");
                        desc = valordesc * 0.05;
                        valordesc = valordesc - desc;
                        System.out.printf("O valor com desconto é: %.2f%n", valordesc);

                    } else if (valordesc >= 250 && valordesc <= 500) {
                        System.out.println("Voce ganhou 10% de desconto na sua compra");
                        desc = valordesc * 0.10;
                        valordesc = valordesc - desc;
                        System.out.printf("O valor com desconto é: %.2f%n", valordesc);
                    } else {
                        System.out.println("Voce ganhou 15% de desconto na sua compra");
                        desc = valordesc * 0.15;
                        valordesc = valordesc - desc;
                        System.out.printf("O valor com desconto é: %.2f%n", valordesc);
                    }
                    } else{
                        System.out.println("Produto invalido!");

                    }
                }


            }
