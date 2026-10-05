
void main() {
    int numint = 0;
    int resultado = 1;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Informe um numero inteiro: ");
    numint = entrada.nextInt();
    for (int i = numint; i >= 1; i--) {
        resultado = resultado * i;

    }System.out.println("O resultado fatorial desse número é: ");
    System.out.println(resultado);
}
