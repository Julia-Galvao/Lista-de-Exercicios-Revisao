import java.text.DecimalFormat;
import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {

        // declaração de variáveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double m, i, c;
        int n;

        // entrada de dados
        System.out.print("capital a ser aplicado --> R$ ");
        c = sc.nextDouble();
        System.out.print("taxa de juros (em porcentagem) --> ");
        i = sc.nextDouble();
        System.out.print("tempo em meses --> ");
        n = sc.nextInt();

        // processamento de dados
        m = c * Math.pow(1 + i / 100.00, n);

        // saída de dados
        System.out.println("montante = R$ " + df.format(m));
    }
}
