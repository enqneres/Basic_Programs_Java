package exercicios_estrutura_Sequencial;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Soma = A + B;
		
		System.out.println("Resultado da soma: " + Soma);
		
		sc.close();
	}
}
