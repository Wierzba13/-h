package handle_exceptions;

public class MyOwnException extends Exception {
    public MyOwnException() {
        super();
    }

    public MyOwnException(String message) {
        super(message);
    }

    public MyOwnException(String message, Throwable cause) {
        super(message, cause);
    }
}
