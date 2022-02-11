package exception;


public class NegativeNumberException extends Exception {

	public NegativeNumberException(String name, double additionalW) {
		
		super("No se puede usar numeros negativos"+ additionalW + "para el ingrediente"+name);
	}


}
