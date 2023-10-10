package Ej4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calcular {
	

	public Calcular() {
		Scanner sc = new Scanner(System.in);

		mostrarMenu(sc);
		
		sc.close();
	}
	

	public double suma(double num1, double num2) {
		return num1+num2;
	}
	
	public double resta(double num1, double num2) {
		return num1-num2;
	}
	
	public double multiplicacion(double num1, double num2) {
		return num1*num2;
	}
	
	public double potencia(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	public double raizCuadrada(double num1) {
		return Math.sqrt(num1);
	}
	
	public double raizCubica(double num1) {
		return Math.cbrt(num1);
	}
	
	public double division(double num1, double num2) {
		return num1/num2;
	}
	
	private void mostrarMenu(Scanner sc) {
		menu();
		try {
			System.out.print("Que desea hacer? (1-7): ");
			int opcion = sc.nextInt();
			
			System.out.print("Introduzca el valor 1: ");
			double num1 = sc.nextDouble();
			
			System.out.print("Introduzca el valor 2: ");
			double num2 = sc.nextDouble();
			
			switch (opcion) {
			case 1:
				System.out.println("\nLa suma es la siguiente: "+ num1+ " + " + num2+ " = "+suma(num1, num2));
				
				break;
			case 2:
				System.out.println("\nLa resta es la siguiente: "+ num1+ " - " + num2+ " = "+resta(num1, num2));

				break;
			case 3:
				System.out.println("\nLa multiplicacion es la siguiente: "+ num1+ " x " + num2+ " = "+multiplicacion(num1, num2));

				break;
			case 4:
				System.out.println("\nLa potencia es la siguiente: "+ num1+ " ^ " + num2+ " = "+potencia(num1, num2));

				break;
			case 5:
				System.out.println("\nEn caso de la raiz cuadrada se coge el primer valor introducido");
				System.out.println("La raiz cuadrada de  "+ num1+ " es : " +raizCuadrada(num1));

				break;
			case 6:
				System.out.println("\nEn caso de la raiz cubica se coge el primer valor introducido");
				System.out.println("La raiz cubica de  "+ num1+ " es : " +raizCubica(num1));
				
				break;
			case 7:
				System.out.println("\nLa division es la siguiente: "+ num1+ " / " + num2+ " = "+division(num1, num2));

				break;

			default:
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("\u001B[31m"+"Numero introducido invalido"+"\u001B[0m\n");
		}
	
	}


	private void menu() {
		System.out.println(" -- CALCULADORA --");
		System.out.println(" 1. Sumar"
				+ "\n 2. Restar"
				+ "\n 3. Multiplicar"
				+ "\n 4. Potencia"
				+ "\n 5. Raiz cuadrada"
				+ "\n 6. Raiz cubica"
				+ "\n 7. Division");
	}
	
	

}
