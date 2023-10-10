package Ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrdenadorJuego {
	
	private int numRandom;
	
	/*Defino como constante los valores entre los que se generara el num aleatorio*/
	private final int RANGO_MAX = 500;
	private final int RANGO_MIN = 1;


	/*Constructor por defecto, al crear el objeto se ejecuta*/
	
	public OrdenadorJuego() {
		//Para darle un valor, llamo a un metodo que devuelve un numero aleatorio
		this.numRandom = generarNumRandom();
		
		//Llamo al metodo para que el usuario adivine el numero
		adivinarNumRandom(numRandom);
	}

	private void adivinarNumRandom(int numRandom2) {
		Scanner sc = new Scanner(System.in);
		boolean esCorrecto = false;
		int contIntentos = 0;
		int numJugador =0;
		
		do {
			
			try {
				System.out.print("Intenta adivinar el valor entre 1 y 500: ");
				numJugador = sc.nextInt();
				
				contIntentos++;

				if (numJugador == numRandom2) {
					System.out.println("\n\u001B[32m"+"FELICIDADES, HAS ADIVINADO EL NUMERO"+"\u001B[0m\n");
					esCorrecto = true;
				} else if (numJugador <= numRandom2) {
					System.out.println("\u001B[36m"+"El numero que debes de adivinar es mas grande"+"\u001B[0m\n");
				} else {
					System.out.println("\u001B[33m"+"El numero que debes de adivinar es mas pequeño"+"\u001B[0m\n");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("\u001B[31m"+"Numero introducido invalido"+"\u001B[0m\n");
				contIntentos++;
				sc.next();
			}
			
			
			
		} while (!esCorrecto);
		
		sc.close();
		
		System.out.println("El numero a adivinar es: "+numRandom2);
		System.out.println("Intentos: " +contIntentos);
				
	}

	public int generarNumRandom() {
		return (int) (Math.random() * (RANGO_MAX - RANGO_MIN + 1) + RANGO_MIN);
	}

	
	

}
