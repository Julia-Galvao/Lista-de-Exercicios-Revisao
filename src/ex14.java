import java.text.DecimalFormat;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

            // declaração de variáveis
            DecimalFormat df = new DecimalFormat("0.000");
            Scanner teclado = new Scanner(System.in);
            double area, raio, altura;

            // entrada de dados
            System.out.print("Raio --> ");
            raio = teclado.nextDouble();
            System.out.print("Altura --> ");
            altura = teclado.nextDouble();

            // processamento de dados
            area = Math.PI * Math.pow(raio, 2) * altura;

            // saída de dados
            System.out.println("área = " + df.format(area));
        System.out.println( "raio = " + raio);
        }
    }


