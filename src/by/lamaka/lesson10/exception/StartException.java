package by.lamaka.lesson10.exception;

public class StartException extends Exception {

    public StartException() {
        super();
    }

    public StartException(String message) {
        super(message);
    }

    public StartException(Exception e) {
        super(e);
    }

    public StartException(String message, Exception e) {
        super(message, e);
    }
}
