package 자바.이론.예외처리;

public class ArrayExcceptionHandling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            for(int i=0; i<=5; i++){
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("정상 종료 시 실행됨");
    }
}
