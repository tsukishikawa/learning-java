import java.util.Scanner;

public class treino {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String fruta;
		
		switch(x) {
		case 1:
			fruta = "banana";
			break;
		case 2:
			fruta = "maçã";
			break;
		case 3:
			fruta = "laranja";
			break;
		case 4:
			fruta = "pessego";
			break;
		default:
			fruta = "não temos";
			break;
			
		}
		
		System.out.println("Fruta do dia: " + fruta);
		sc.close();
	}

}
