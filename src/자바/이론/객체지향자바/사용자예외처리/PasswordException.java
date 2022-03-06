package 자바.이론.사용자예외처리;

public class PasswordException extends IllegalArgumentException{
    public PasswordException(String message){
        super(message);
    }
}
