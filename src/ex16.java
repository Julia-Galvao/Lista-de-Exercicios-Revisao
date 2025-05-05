import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner  teclado = new Scanner(System.in);
        int a, b;

        // entrada de dados
        System.out.print("valor de a --> ");
        a = teclado.nextInt();
        System.out.print("valor de b --> ");
        b = teclado.nextInt();

        // processamento de dados
        a = a + b;
        b = a - b;
        a = a - b;

        // saída de dados
        System.out.println("valor final de a --> " + a);
        System.out.println("valor final de b --> " + b);
    }
}

