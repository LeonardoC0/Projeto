package Projeto;
import java.util.Scanner;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		int num1, num2, soma;
		
		System.out.println("Entre com o primeiro n�mero:");
		num1 = sc.nextInt();
		System.out.println("Entre com o outro n�mero:");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("Soma: " + soma);
	}

}

