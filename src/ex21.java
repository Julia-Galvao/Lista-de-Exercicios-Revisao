import java.text.DecimalFormat;
import java.util.Scanner;

public class ex21 {
        public static void main(String[] args) {

            // declaração de variáveis
            DecimalFormat df = new DecimalFormat("0.00");
            Scanner  teclado = new Scanner(System.in);
            double salario, reajuste, novoSalario;

            // entrada de dados
            System.out.print("Salário atual --> R$ ");
            salario = teclado.nextDouble();
            System.out.print("Reajuste -->  ");
            reajuste = teclado.nextDouble();

            // processamento de dados
            novoSalario = salario + salario * reajuste / 100;

            // saída de dados
            System.out.println("Novo salário --> R$ " + df.format(novoSalario));
        }
}
