
public class fluxo {
	public static void main(String[] args) {
		//condicionais
		System.out.println("\nExemplos de condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean podeEntrar = (idade>18)||quantidadePessoas>=2;
		if(podeEntrar) {
			System.out.println("\nMaior de idade ou Acompanhado, pode entrar");
		} else {
			System.out.println("\nMenor de idade e não acompanhado");
		}
		
		int mes =9;
		double preco = 500;
		System.out.println("\nValor do Ingresso:");
		switch (mes) {
		case 1:
			System.out.println("\nJaneiro: -5%");
			preco -= preco*0.05;
			System.out.println("\nR$ "+preco);
			break;
		case 2:
			System.out.println("\nFevereiro: -8%");
			preco -= preco*0.08;
			System.out.println("\nR$ "+preco);
			break;
		case 3:
			System.out.println("\nMarço: +3%");
			preco += preco*0.03;
			System.out.println("\nR$ "+preco);
			break;
		case 4:
			System.out.println("\nAbril: +4%");
			preco += preco*0.04;
			System.out.println("\nR$ "+preco);
			break;
		case 5:
			System.out.println("\nMaio: +9%");
			preco += preco*0.09;
			System.out.println("\nR$ "+preco);
			break;
		case 6:
			System.out.println("\nJunho: -6%");
			preco -= preco*0.06;
			System.out.println("\nR$ "+preco);
			break;
		default:
			System.out.println("Valor Padrão");
			System.out.println("R$ "+preco);
			break;
		
		}
			
		
		
	}
}
