import java.util.Scanner;
import Conta.Conta;
public class ContaTerminal {
    public static void main(String[] args) {
        int opcao;
        Scanner resposta = new Scanner(System.in).useLocale(Locale.US);
        Conta conta = new Conta();

        System.out.println("Olá, deseja criar uma conta? \n 1- Sim \n 2 - Não");

    }
}