void main() {
    Scanner input = new Scanner(System.in);

    int[] tdia = new int[5];
    double total = 0;
    double mediatemp = 0;
    for (int i = 0; i < 5; i++) {
        System.out.println("Digite a temperatura do dia " + (i+1));
        tdia [i] = input.nextInt();
        total += tdia[i];
    }
    mediatemp = total / 5;
    System.out.println("Temperatura média: " + mediatemp);
    System.out.println("Dias com temperatura acima da média:");
    for (int i = 0; i <  5; i++)
        if (tdia[i] > mediatemp) {
            System.out.println("Dia "+ (i+1) + ": "+ tdia[i]);

        }


}