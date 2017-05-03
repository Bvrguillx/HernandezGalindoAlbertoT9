package exceptions;

public class ListSizeOverflownException extends RuntimeException {

	public ListSizeOverflownException(String msg) {
		super("¡¡ EXCEPCION !! --> " + msg);
	}

}
