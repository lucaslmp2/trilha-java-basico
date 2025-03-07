import java.util.Locale;
import java.util.Scanner;
/*este desafio tem como propósito proporcionar o entendimento sobre as práticas
 de desenvolvimento de sintaxe do java ultilizando um exemplo de criação de conta bancaria*/
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);/*classe Scanner sendo instanciada de biblioteca */
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        Double conta = Math.random() * agencia.hashCode();/*método aleatório de criação de conta */
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        float saldo = 200.00f;/* saldo inicial de criação de conta */

        System.out.println("Olá " + nomeCliente + " " + "obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + " e seu saldo: R$" + saldo +" já está disponível.");

    }
}
