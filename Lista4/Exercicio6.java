
void main() {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> palpitesErrados= new ArrayList <Integer>();
    int tentativas=0;
    int palpite;
    int numerosecreto= 21;
    do {
        System.out.println("Dê o seu palpite: ");
        palpite = input.nextInt();

        tentativas++;

        if (palpite != numerosecreto){
            palpitesErrados.add (palpite);

            if (palpite < numerosecreto){
                System.out.println("O número secreto é maior.");
            }else {
                System.out.println("O número secreto é menor.");
            }
        }
    } while (palpite!= numerosecreto);

    System.out.println("PARABÉNS, VOCÊ ACERTOU!");
    System.out.println("Você tentou "+ tentativas + " vezes.");
    System.out.println("Seus palpites errados:");

    for (int i = 0; i < palpitesErrados.size(); i++) {
        System.out.println(palpitesErrados.get(i));
    }

}
