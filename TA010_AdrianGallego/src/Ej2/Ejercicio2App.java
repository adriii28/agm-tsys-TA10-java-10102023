package Ej2;

import CustomException.AdriException;

public class Ejercicio2App {
	public static void main(String[] args) {
		
		try {
			System.out.println("Mensaje mostrado por pantalla");
			
			throw new AdriException(111);
			
		} catch (AdriException ea) {
			System.out.println("Excepcion capturada con mensaje: "+ea.getMessage());
		} finally {
			System.out.println("Programa terminado");
		}
	}
}
