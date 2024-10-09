import java.util.Scanner;
import Conta.Conta;
public class ContaTerminal {
    public static void main(String[] args) {
        int opcao;
        Scanner resposta = new Scanner(System.in);
        Conta conta = new Conta();
        String retorno = "";
        System.out.println("Olá, deseja cadastrar uma conta? \n 1- Sim \n 2 - Não");

        opcao = resposta.nextInt();
        resposta.nextLine();
        switch (opcao) {
            case 1:
                resposta.reset();

                System.out.println("Digite seu nome:");
                String nome = resposta.nextLine();
                retorno = conta.preencherNomeCliente(nome);
                if (!retorno.isEmpty())
                {
                    System.out.println(retorno);
                    break;
                }
                resposta.reset();

                System.out.println("Digite o número da conta:");
                int num = resposta.nextInt();
                resposta.nextLine();
                retorno = conta.preencherNumeroConta(num);
                if (!retorno.isEmpty())
                {
                    System.out.println(retorno);
                    break;
                }
                resposta.reset();

                System.out.println("Digite o número da Agência:");
                String agencia = resposta.nextLine();
                retorno = conta.preencherAgenciaConta(agencia);
                if (!retorno.isEmpty())
                {
                    System.out.println(retorno);
                    break;
                }
                resposta.reset();

                resposta.close();

                System.out.println(String.format("Dados da Conta Cadastrada: \n Nome - %s \n Numero da Conta - %d \n Agencia - %s \n", conta.getNomeCliente(), conta.getNumero(), conta.getAgencia()));

                break;
        
            default:
                System.out.println("Obrigada! Volte Sempre!");
                break;
        }

        
    }
}