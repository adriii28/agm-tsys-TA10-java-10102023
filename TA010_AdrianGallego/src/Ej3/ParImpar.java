package Ej3;

import CustomException.AdriException;

public class ParImpar {
	
	private int numGenerado;
	
	/*Defino como constante los valores entre los que se generara el num aleatorio*/
	private final int RANGO_MAX = 900;
	private final int RANGO_MIN = 1;

	/*Constructor por defecto, al crear el objeto se ejecuta*/
	public ParImpar() {		
		//Metodo que devuelve un numero random
		this.numGenerado = random();
		
		//Metodo que lanza las excepciones
		esParOImpar(numGenerado);
	}

	private void esParOImpar(int numGenerado2) {
		
		System.out.println("El numero aleatorio generado es: "+ numGenerado2);

		try {
			
			//He reutilizado la clase creada en el anterior ejercicio
			if (numGenerado2%2==0) {throw new AdriException(222);}
			else {throw new AdriException(333);}
			
		} catch (AdriException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private int random() {
		System.out.println("Generando numero aleatorio...");
		return (int) (Math.random() * (RANGO_MAX - RANGO_MIN + 1) + RANGO_MIN);
	}
	
	

}
