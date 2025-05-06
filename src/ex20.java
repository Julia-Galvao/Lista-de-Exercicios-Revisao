import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        int produto, soma;

        // entrada de dados
        System.out.print("primeiro valor --> ");
        a = sc.nextInt();
        System.out.print("segundo valor --> ");
        b = sc.nextInt();
        System.out.print("terceiro valor --> ");
        c = sc.nextInt();
        System.out.print("quarto valor --> ");
        d = sc.nextInt();

        // processamento de dados
        produto = a * c;
        soma = b + d;

        // saída de dados
        System.out.println("produto --> " + produto);
        System.out.println("soma --> " + soma);
    }
}
