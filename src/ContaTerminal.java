import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static int numeroConta;
    public static String agenciaConta;
    public static String nomeCliente;
    public static double saldoConta;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da agência:");
        agenciaConta = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta:");
        saldoConta = scanner.nextDouble();

        scanner.close();

        imprimirDadosInformados();
    }

    public static void imprimirDadosInformados() {
        String saudacao = "";
        saudacao += "Olá ";
        saudacao += nomeCliente;
        saudacao += ", obrigado por criar uma conta em nosso banco, sua agência é ";
        saudacao += agenciaConta;
        saudacao += ", conta ";
        saudacao += numeroConta;
        saudacao += " e seu saldo ";
        saudacao += saldoConta;
        saudacao += " já está disponível para saque.";
        System.out.println(saudacao);
    }
}