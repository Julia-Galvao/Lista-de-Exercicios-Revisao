import java.text.DecimalFormat;
import java.util.Scanner;

public class ex17 {
        public static void main(String[] args) {

            // declaração de variáveis
            DecimalFormat df = new DecimalFormat("0.00");
            Scanner teclado = new Scanner(System.in);
            double comprimento, largura, altura, volume;

            // entrada de dados
            System.out.print("comprimento da caixa --> ");
            comprimento = teclado.nextDouble();
            System.out.print("largura da caixa --> ");
            largura = teclado.nextDouble();
            System.out.print("altura da caixa --> ");
            altura = teclado.nextDouble();

            // processamento de dados
            volume = comprimento * largura * altura;

            // saída de dados
            System.out.println("volume da caixa --> " + df.format(volume));
        }
}
