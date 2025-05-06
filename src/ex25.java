import java.text.DecimalFormat;
import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {

        // declaração de variáveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double pes, metros;

        // entrada de dados
        System.out.print("Distância em pés --> ");
        pes = sc.nextDouble();

        // processamento de dados
        metros = pes * 0.3048;

        // saída de dados
        System.out.println("distância em metros = " + df.format(metros));

    }
}
