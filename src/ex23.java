import java.text.DecimalFormat;
import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {

        // declaração de variáveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        int a, b, c, nulo, branco;
        int total;
        double pa, pb, pc, pnulo, pbranco;

        // entrada de dados
        System.out.print("Candidato A -->  ");
        a = sc.nextInt();
        System.out.print("Candidato B -->  ");
        b = sc.nextInt();
        System.out.print("Candidato C -->  ");
        c = sc.nextInt();
        System.out.print("Votos em branco -->  ");
        branco = sc.nextInt();
        System.out.print("Votos nulo -->  ");
        nulo = sc.nextInt();

        // processamento de dados
        total = a + b + c + nulo + branco;
        pa = (double) a / total * 100;
        pb = (double) b / total * 100;
        pc = (double) c / total * 100;
        pnulo = (double) nulo / total * 100;
        pbranco = (double) branco / total * 100;

        // saída de dados
        System.out.println("a) total de eleitores --> " + total);
        System.out.println("b) porcentagem de votos válidos 100%");
        System.out.println("c) porcentagem de votos do candidato A --> " + df.format(pa));
        System.out.println("d) porcentagem de votos do candidato B --> " + df.format(pb));
        System.out.println("e) porcentagem de votos do candidato C --> " + df.format(pc));
        System.out.println("f) porcentagem de votos nulos --> " + df.format(pnulo));
        System.out.println("g) porcentagem de votos em branco --> " + df.format(pbranco));


    }
}
