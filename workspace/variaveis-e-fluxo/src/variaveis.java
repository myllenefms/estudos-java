
public class variaveis {
	public static void main(String[] args) {
		System.out.println("ola mundo!");
		
		//tipos primitivos
		System.out.println("\nExemplos de concatenacao e operacoes entre tipos");
		
		int idade = 21;
		double altura = 1.71;
		double salario = 638.50;
		
		System.out.println("idade: "+idade+" - altura: "+altura+" - salario: "+salario);
		System.out.println("divisao da altura: "+ altura/2);
		System.out.println("divisao da idade por int: "+idade/2);
		System.out.println("divisao da idade por double: "+idade/2.0);
		
		//conversões entre tipos - casting
		System.out.println("\n\nExemplos de conversao e outros tipos");
		
		int valor = (int)salario;
		System.out.println("Salario em int: "+valor);
		
		//tipos de caracteres
		System.out.println("\n\nExemplos de tipos de caracteres");
		char letra = 'a';
		System.out.println(letra);
		String frase = "meu nome eh myllene";
		String frase2 = " minha idade eh: ";
		System.out.println(frase+frase2+idade);
		
	}
}
