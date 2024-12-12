import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();
        aluno.nome = scan.nextLine();
        aluno.nota1 = scan.nextDouble();
        aluno.nota2 = scan.nextDouble();
        aluno.nota3 = scan.nextDouble();

        aluno.calcularMedia();
    }
}
