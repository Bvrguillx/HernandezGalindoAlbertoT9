package exceptions;

public class ColaExceededSizeException extends RuntimeException {

	public ColaExceededSizeException(String msg) {
		super("¡¡ EXCEPCION !! --> " + msg);
	}

}
