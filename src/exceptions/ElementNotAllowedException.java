package exceptions;

public class ElementNotAllowedException extends NullPointerException {

	public ElementNotAllowedException(String msg) {
		super("¡¡ EXCEPCION !! --> " + msg);
	}

}
