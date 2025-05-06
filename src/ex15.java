import java.text.DecimalFormat;
import java.util.Scanner;

public class ex15 {
        public static void main(String[] args) {

            // declaração de variáveis
            DecimalFormat df = new DecimalFormat("0.00");
            Scanner sc = new Scanner(System.in);
            double prestacao, valor, taxa;
            int tempo;

            // entrada de dados
            System.out.print("Qual o valor da parcela? ");
            valor = sc.nextDouble();
            System.out.print("Qual o a taxa de juros cobrada? ");
            taxa = sc.nextDouble();
            System.out.print("Quantos dias de atraso? ");
            tempo = sc.nextInt();

            // processamento de dados
            prestacao = valor + (valor * taxa / 100 * tempo);

            // saída de dados
            System.out.println("Valor final da prestação: R$ " + df.format(prestacao));
        }
    }
