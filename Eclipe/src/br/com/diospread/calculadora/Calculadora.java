package br.com.diospread.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite os valores para a e b: ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a,b);
		int subtracao = subtracao(a,b);
		
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicacao);
		
		
		
		
		
		
		
		
	}
	

	
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int divisao(int a, int b) {
		return a / b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}

}
