package 자바.이론.스트림;

public class TravelCustomer {
    private int age;
    private int price;
    private String name;

    public TravelCustomer(String name, int age, int price){
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
