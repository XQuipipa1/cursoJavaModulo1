package com.quipipa.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		for( int i = 0; i < 5; i++) {
			System.out.println(" i tem o valor: "+i);
		}
		
		//System.out.println(i);
		
		for(int i = 5; i >= 0; i--) {
			System.out.println(" i tem o valor: "+i);
		}
		
		for(int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = "+i+"; j = "+j);
			
			
		}

	}

}
 