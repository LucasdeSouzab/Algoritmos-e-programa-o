
void main() {
    Scanner input = new Scanner(System.in);
    int[] Tdia = new int[5];
    double faturamentototal =0;
    double mediadevendas =0;
    double abaixodamedia;
    double quantabaixo = 0;


    for (int i = 0; i < 5; i++) {
        System.out.println("Digite o valor das vendas do dia " + (i + 1) + ":");
        Tdia[i] = input.nextInt();
        faturamentototal += Tdia[i];


    }
    mediadevendas = faturamentototal / 5;
    System.out.println("O faturamento total acumulado é R$ " + faturamentototal);
    System.out.println("A média diária de vendas é de R$ " + mediadevendas);


    for (int i = 0; i < 5; i++) {
        if (Tdia[i] < mediadevendas) {
            quantabaixo = mediadevendas - Tdia[i];
            System.out.printf("Dia %d ficou abaixo da média diária com R$ %.2f%n", i+1, quantabaixo);
        }
    }
}