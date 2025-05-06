import java.util.Scanner;

public class ex19 {
        public static void main(String[] args) {

            // declaração de variáveis
            Scanner sc = new Scanner(System.in);
            int a, b, c, resultado;

            // entrada de dados
            System.out.print("a --> ");
            a = sc.nextInt();
            System.out.print("b --> ");
            b = sc.nextInt();
            System.out.print("c --> ");
            c = sc.nextInt();

            // processamento de dados
            resultado = a * a + b * b + c * c;

            // saída de dados
            System.out.println("resultado --> " + resultado);
        }
}
