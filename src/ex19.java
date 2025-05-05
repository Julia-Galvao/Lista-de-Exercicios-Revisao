import java.util.Scanner;

public class ex19 {
        public static void main(String[] args) {

            // declaração de variáveis
            Scanner  teclado = new Scanner(System.in);
            int a, b, c, resultado;

            // entrada de dados
            System.out.print("a --> ");
            a = teclado.nextInt();
            System.out.print("b --> ");
            b = teclado.nextInt();
            System.out.print("c --> ");
            c = teclado.nextInt();

            // processamento de dados
            resultado = a * a + b * b + c * c;

            // saída de dados
            System.out.println("resultado --> " + resultado);
        }
}
