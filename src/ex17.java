import java.text.DecimalFormat;
import java.util.Scanner;

public class ex17 {
        public static void main(String[] args) {

            // declaração de variáveis
            DecimalFormat df = new DecimalFormat("0.00");
            Scanner sc = new Scanner(System.in);
            double comprimento, largura, altura, volume;

            // entrada de dados
            System.out.print("comprimento da caixa --> ");
            comprimento = sc.nextDouble();
            System.out.print("largura da caixa --> ");
            largura = sc.nextDouble();
            System.out.print("altura da caixa --> ");
            altura = sc.nextDouble();

            // processamento de dados
            volume = comprimento * largura * altura;

            // saída de dados
            System.out.println("volume da caixa --> " + df.format(volume));
        }
}
