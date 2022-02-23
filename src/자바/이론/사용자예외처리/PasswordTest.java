package 자바.이론.사용자예외처리;

public class PasswordTest {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException{

        if (password == null) {
            throw new PasswordException("비밀번호는 null일 수 없다");
        } else if (password.length() < 5){
            throw new PasswordException("비밀번호는 최소 5자 이상");
        } else if (password.matches("[a-zA-Z]+")){
            throw new PasswordException("비밀번호는 숫자나 특수문자를 포함");
        }

        this.password = password;
    }

    public static void main(String[] args) {
        PasswordTest test = new PasswordTest();
        String password = null;
        try {
            test.setPassword(password);
            System.out.println("오류 없음 1");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcd";
        try {
            test.setPassword(password);
            System.out.println("오류 없음 2");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "sdawdw";
        try {
            test.setPassword(password);
            System.out.println("오류 없음 3");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcddwa1@";
        try {
            test.setPassword(password);
            System.out.println("오류 없음 4");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
