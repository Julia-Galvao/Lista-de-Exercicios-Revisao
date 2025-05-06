import java.text.DecimalFormat;
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {

        // declaração de variáveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double raio, area;

        // entrada de dados
        System.out.print("raio -->  ");
        raio = sc.nextDouble();

        // processamento de dados
        area = Math.PI * raio * raio;

        // saída de dados
        System.out.println("área = " + df.format(area));
    }
}

