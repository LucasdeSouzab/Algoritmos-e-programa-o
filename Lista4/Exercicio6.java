
void main() {
    Scanner entrada = new Scanner(System.in);
    ArrayList<Integer> palpitesErrados = new ArrayList<Integer>();
    int numerosecreto = 45;
    int tentativa = 0;
    int palpite;
    do {

        System.out.println("De o seu palpite: ");
        palpite = entrada.nextInt();
        tentativa++;


        if (palpite != numerosecreto) {
            palpitesErrados.add(palpite);
        }
            if (palpite < numerosecreto)
                System.out.println("O numero secreto é maior! ");
        else {
            System.out.println("O numero secreto é menor! ");
        }
    }while (palpite != numerosecreto);

    System.out.println("Parabens voce acertou! ");
    System.out.println("Voce tentou " + tentativa + "vezes!");
    System.out.println("Seus palpites errados foram: ");

    for (int i = 0; i < palpitesErrados.size(); i++) {
        System.out.println(palpitesErrados.get(i));
    }

}




