import java.text.DecimalFormat;
import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {

        // declaração de variáveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        double x, y;

        // entrada de dados
        System.out.print("x --> ");
        x = teclado.nextDouble();

        // processamento de dados
        y = x + (10 / Math.sqrt(4 + x * x));

        // saída de dados
        System.out.println("y = " + df.format(y));

    }
}
