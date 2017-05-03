package exceptions;

public class LaListaSeQuedaraVaciaException extends RuntimeException {

	public LaListaSeQuedaraVaciaException(String msg) {
		super("¡¡ EXCEPCION !! --> " + msg);
	}

}
