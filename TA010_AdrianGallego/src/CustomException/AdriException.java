package CustomException;

public class AdriException extends Exception{
	
	private int codigoException;

	public AdriException(int codigoException) {
		super();
		this.codigoException = codigoException;
	}
	
	public AdriException() {
		super();
	}
	
	@Override
	public String getMessage() {
		String mensaje = "";
		
		switch (codigoException) {
		case 111:
			mensaje = "Error desde clase AdriException";
			break;
		case 222:
			mensaje = "Es par";
			break;
		case 333:
			mensaje = "Es impar";
			break;

		}
		return mensaje;
	}

}
