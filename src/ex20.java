import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner  teclado = new Scanner(System.in);
        int a, b, c, d;
        int produto, soma;

        // entrada de dados
        System.out.print("primeiro valor --> ");
        a = teclado.nextInt();
        System.out.print("segundo valor --> ");
        b = teclado.nextInt();
        System.out.print("terceiro valor --> ");
        c = teclado.nextInt();
        System.out.print("quarto valor --> ");
        d = teclado.nextInt();

        // processamento de dados
        produto = a * c;
        soma = b * d;

        // saída de dados
        System.out.println("produto --> " + produto);
        System.out.println("soma --> " + soma);
    }
}
