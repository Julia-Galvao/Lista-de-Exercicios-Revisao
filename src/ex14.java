import java.text.DecimalFormat;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

            // declaração de variáveis
            DecimalFormat df = new DecimalFormat("0.000");
            Scanner sc = new Scanner(System.in);
            double volume, raio, altura;

            // entrada de dados
            System.out.print("Raio --> ");
            raio = sc.nextDouble();
            System.out.print("Altura --> ");
            altura = sc.nextDouble();

            // processamento de dados
            volume = Math.PI * Math.pow(raio, 2) * altura;

            // saída de dados
            System.out.println("Volume = " + df.format(volume));
        }
    }


