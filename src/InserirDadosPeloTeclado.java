import java.util.Scanner;

public class InserirDadosPeloTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		String nome;
		
		System.out.println(" Digite aqui o nome em seguida ENTER:");
		nome = scanner.next();
		
		System.out.println("voce digitou:" + nome);
		
		  // Entrada de numeros
		
		int numero;
		System.out.println(" Digite aqui o numero" + " em seguida ENTER:");
		numero = scanner.nextInt();
		        System.out.println("voce digitou: " + numero);
		        
		        scanner.close();
		        
		
	

	}

}
