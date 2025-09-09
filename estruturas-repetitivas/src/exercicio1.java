import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// estrutura enquanto(while) V: executa e volta; F: pula fora
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while ( x != 0) {
			soma = soma + x; // também posso utilizar o operador de atribuição acumulativa +=  
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
