package 자바.이론.디자인패턴.adapter.decorator;

public class Decorator extends Coffee{

    Coffee coffee;
    public Decorator(Coffee coffee){
        this.coffee = coffee;
    }


    @Override
    public void brewing() {
        coffee.brewing();
    }
}
