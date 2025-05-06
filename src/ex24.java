import java.text.DecimalFormat;
import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {

        // declaração de variáveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double velocidade, distancia, tempo;

        // entrada de dados
        System.out.print("Distância --> ");
        distancia = sc.nextDouble();
        System.out.print("tempo --> ");
        tempo = sc.nextDouble();

        // processamento de dados
        velocidade = (distancia * 1000) / (tempo * 60);

        // saída de dados
        System.out.println("velocidade = " + df.format(velocidade));

    }
}
