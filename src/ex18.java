import java.text.DecimalFormat;
import java.util.Scanner;

public class ex18 {
        public static void main(String[] args) {

            // declaração de variáveis
            DecimalFormat df = new DecimalFormat("0.00");
            Scanner sc = new Scanner(System.in);
            double valorReal, valorDolar, cotacao;

            // entrada de dados
            System.out.print("Quanto dólares serão convertidos? ");
            valorDolar = sc.nextDouble();
            System.out.print("Qual a cotação do dia? ");
            cotacao = sc.nextDouble();

            // processamento de dados
            valorReal = valorDolar * cotacao;

            // saída de dados
            System.out.println("Quantidade de Reais R$ " + df.format(valorReal));
        }
    }
