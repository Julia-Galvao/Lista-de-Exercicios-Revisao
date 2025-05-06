import java.text.DecimalFormat;
import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {

        // declaração de variáveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double a, b, c, sp, area;

        // entrada de dados
        System.out.print("lado 1 --> ");
        a = sc.nextDouble();
        System.out.print("lado 2 --> ");
        b = sc.nextDouble();
        System.out.print("lado 3 --> ");
        c = sc.nextDouble();

        // processamento de dados
        sp = (a + b + c) / 2;
        area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));

        // saída de dados
        System.out.println("area = " + df.format(area));

    }
}
