package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa o tamanho em metro da Area a ser pintada");
		double area = scan.nextDouble();

		double litro = 6;
		double lata = 18 * litro;
		
		double galao = 25.00;
		double tinta = 80.00;
		
		
		

		double quantidadeLatas = area / lata;
		double preco = quantidadeLatas * tinta;
		
		double preco1 = quantidadeLatas * galao;

		System.out.println("Quantidade de latas de titas a serem compradas " + "R$ " + quantidadeLatas);
		System.out.println("O Preco total da Compra com o preco de " +tinta+ " fica " + "R$ " + preco);
		System.out.println("O Preco total da Compra com o preco de " +galao+ " fica " + "R$ " + preco1);


	}

}
