package Ej5;

public class Password {
	private int longitud;
	private String contrasena;
	
	final int LONGITUD_DEFAULT = 8;

	public Password() {
		this.longitud = LONGITUD_DEFAULT;
		this.contrasena = generarContrasena(longitud);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarContrasena(longitud);
	}

	public boolean esFuerte() {
		boolean esFuerte = false;
		int contMayus = 0;
		int contMinus = 0;
		int contNum = 0;

		//Cojo la contraseña y la recorro con un for
		for (int i = 0; i < contrasena.length(); i++) {
			//Y va mirando caracter por caracter (lo convierto en char para compararlo) si es un numero, en caso de que sea numero se añade al contador
			if (contrasena.charAt(i) >= '1' && contrasena.charAt(i) <= '9') {
				contNum++;
				
			//Si no es un numero, mira si es una letra minuscula
			} else if (contrasena.charAt(i) >= 'a' && contrasena.charAt(i) <= 'z') {
				//En caso de que sea una letra minuscula se añade al contador
				contMinus++;
			} else {
			//Y si no es ni una ni otra, simplemente se lo cuento al contador de las mayusculas
				contMayus++;
			}
		}

		//Y ejecuta este codigo para ver si cumple con los requisitos
		if (contMayus>=2 && contMinus>=1 && contNum>=5) {
			
			//Si tiene 2 mayusculas, 1 minuscula y 5 numeros saldra como que la contraseña es fuerte
			esFuerte = true;
		}
		
		//Y si no saldra como que la contraseña no es fuerte
		return esFuerte;
		
	}

	public static String generarContrasena(int longitud2) {
		//Genera una contraseña con numeros y caracteres
		String contra = "";
		int numRandom = 0;
		
		/*Para generar la contraseña lo primero que he hecho es crear un bucle que recorra la longitud de la contraseña*/
		for (int i = 0; i < longitud2; i++) {
			
			/*Genero un numero random del 1 al 3*/
			numRandom = (int) (Math.random() * (3 - 1 + 1) + 1);

			//Si el numero es igual a 1 se generara una letra mayuscula
			if (numRandom==1) {
				//Para la letra mayuscula le digo que genere el codigo ASCII de una letra
				int codigoAscii = (int)Math.floor(Math.random()*(122 -97)+97);
				
				//Lo convierto en char
				char caracterMayus = (char)codigoAscii;
				
				//Y a la hora de guardarlo lo guarda como string con el metodo toUpperCase para que sea mayuscula
				contra += String.valueOf(caracterMayus).toUpperCase();
				
				//Si el numero es igual a 2 se generara una letra minuscula
			} else if (numRandom==2) {
				//Con la letra minuscula funciona exactamente igual pero sin el ultimo paso del toUpperCase
				int codigoAscii = (int)Math.floor(Math.random()*(122 -97)+97);
				char caracterMinus = (char)codigoAscii;
				contra += String.valueOf(caracterMinus);
				
				//Si el numero es igual a 1 se generara una numero del 1 al 9
			} else if (numRandom==3){
				int numContrasena = (int)(Math.random() * (9 - 1 + 1) + 1);
				contra += String.valueOf(numContrasena);
			}
		}
		
		return contra;
		
	}
	
	

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}
		
	
}
