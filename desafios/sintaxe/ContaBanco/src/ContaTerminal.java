import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        Double conta = Math.random() * agencia.hashCode();
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        float saldo = 200.00f;

        System.out.println("Olá " + nomeCliente + " " + "obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + " e seu saldo: R$" + saldo +" já está disponível.");

    }
}
