package javacode.활용.스트림;

import javacode.활용.스트림.TravelCustomer;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        TravelCustomer CustomerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer CustomerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer CustomerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customer = new ArrayList<>();
        customer.add(CustomerLee);
        customer.add(CustomerKim);
        customer.add(CustomerHong);

        System.out.println("< 고객의 명단 출력 >");
        customer.stream().map(c->c.getName()).forEach(s-> System.out.println(s));

        int total = customer.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("total : " + total);
        customer.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(c-> System.out.println(c));
    }
}