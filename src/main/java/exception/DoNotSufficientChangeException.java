package exception;

public class DoNotSufficientChangeException extends RuntimeException {
    private String message;

    public DoNotSufficientChangeException (String string) {
        this.message = string;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
