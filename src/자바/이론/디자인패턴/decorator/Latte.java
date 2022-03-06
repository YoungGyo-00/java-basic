package 자바.이론.디자인패턴.adapter.decorator;

public class Latte extends Decorator{

    public Latte(Coffee coffee) {
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.println("Adding Milk");
    }
}
