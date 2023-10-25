package a1025.ExceptionCheck.ex_7;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
