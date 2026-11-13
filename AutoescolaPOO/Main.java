import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Alunos aluno = new Alunos();

        System.out.print("Nome: ");
        aluno.nome = entrada.nextLine();

        System.out.print("Idade: ");
        aluno.idade = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Categoria: ");
        aluno.categoria = entrada.nextLine();

        System.out.print("CPF: ");
        aluno.cpf = entrada.nextLine();

        System.out.print("Telefone: ");
        aluno.telefone = entrada.nextLine();

        System.out.println("\n--- CADASTRO AUTOESCOLA ---");

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Categoria: " + aluno.categoria);
        System.out.println("CPF: " + aluno.cpf);
        System.out.println("Telefone: " + aluno.telefone);

        entrada.close();
    }
}
