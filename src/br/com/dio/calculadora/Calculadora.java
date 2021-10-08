package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float a, b;
		
		System.out.println("Digite o primeiro Valor:");
		a=scan.nextFloat();
		System.out.println("Digite o segundo numero");
		b=scan.nextFloat();
		
		float soma = soma(a,b);
		float multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		float subtracao = subtracao(a,b);
		
		System.out.println("Soma: "+soma);
		System.out.println("Subtra: "+subtracao);
		System.out.println("Divisao: "+divisao);
		System.out.println("Multiplicação: "+multiplicacao);
	}
	
	public static float soma(float a, float b) {
		return a+b;
	}
	public static float divisao(float a,float  b) {
		return a/b;
	}
	public static float multiplicacao(float a,float  b) {
		return a*b;
	}
	public static float subtracao(float a,float  b) {
		return a-b;
	}
	

}
