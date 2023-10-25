package a1025.ExceptionCheck.ex_7;

public class NotExistIDException extends Exception{
    public NotExistIDException() {
    }

    public NotExistIDException(String message) {
        super(message);
    }
}
