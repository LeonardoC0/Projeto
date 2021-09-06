package Projeto;
import java.util.Scanner;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		int num1, num2, soma;
		
		System.out.println("Entre com o primeiro número:");
		num1 = sc.nextInt();
		System.out.println("Entre com o outro número:");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("Soma: " + soma);
	}

}

