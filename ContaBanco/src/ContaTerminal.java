import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /* Entradas da nova conta, via terminal */

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Por favor, digite o seu nome!");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o número da conta!");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o número da Agência!");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o saldo inicial da conta!");
            Float saldo = scanner.nextFloat();

            // System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua
            // agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            // nomeCliente,agencia,numero,saldo);
            System.out.println("Olá " + nomeCliente + ", obriagado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
