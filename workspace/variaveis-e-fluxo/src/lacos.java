
public class lacos {
	public static void main(String[] args) {
		//while
		int num=1;
		while(!(num>10)) {
			System.out.println(num);
			num++;
		}
		int total=0;
		int cont=1;
		while (cont<=10) {
			total += cont;
			cont++;
		}
		System.out.println("Prog Aritmética: "+ total);
		
		//for
		int diasDoMes = 0;
		for(int i=1; i<=30; i++) {
			diasDoMes++;
		}
		System.out.println("Quantidade do dia: "+diasDoMes);
		
		
		//laços encadeados
		for(int mult = 0; mult<=10; mult++){
			System.out.println("\nTABUADA DO "+ mult);
			for(int i=0; i<=10; i++) {
				System.out.println(mult +"*"+i+"="+mult*i);
			}
			System.out.println("FIM\n");
		}
		
		int linhas=1, colunas=1;
		while(linhas<=10) {
			//System.out.println("*");
			while(colunas<=10) {
				if(colunas<linhas) {
					System.out.print("*");
				}
				colunas++;
			}
			System.out.println();
			colunas=1;
			linhas++;
		}
		
		//múltiplos de 3
		System.out.println("\n\nMúltiplos de 3\n");
		for (int i =1; i<=100; i++) {
			if(i%3==0) {
				System.out.print(i+" - ");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
		
		//fatorial
		System.out.println("\n\nFatorial");
		for(int i=1; i<=10; i++) {
			int fatorial =1;
			int j = i;
			while(j!=0) {
				fatorial *= j;
				j--;
			}
			System.out.println("Fatorial de "+i+" = "+fatorial);
		}
		
	}
}
