package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a;
		String b;
		
		System.out.println("Digite o primeiro valor:");
		a = scan.next();
		System.out.println("Digite o segundo valor");
		b = scan.next();
		
		String soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a,b);
		
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		
	}
	private static int divisao(String a, String b) {
		// TODO Auto-generated method stub
		return 0;
	}
	private static int subtracao(String a, String b) {
		// TODO Auto-generated method stub
		return 0;
	}
	private static int multiplicacao(String a, String b) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static String soma(String a, String b) {
		return a + b;
	}
	public static int soma1(int a, int b) {
		return a - b;
	}
	public static int soma11(int a, int b) {
		return a / b;
	}
	public static int soma(int a, int b) {
		return a * b;
	}
}
