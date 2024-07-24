import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int numero_conta = scanner.nextInt();

        System.out.println("Número da agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nome_cliente = scanner.next();

        System.out.println("Insira o saldo da conta: ");
        Double saldo = scanner.nextDouble();


        System.out.println("Olá "+nome_cliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero_conta+" e seu saldo R$"+saldo+" já está disponível para saque!");
    }
}
