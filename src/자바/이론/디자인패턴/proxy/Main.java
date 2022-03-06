package 자바.이론.디자인패턴.adapter.proxy;

import 자바.이론.디자인패턴.adapter.aop.AopProxy;
import 자바.이론.디자인패턴.adapter.aop.IAopBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        IBrowser Browser = new BrowserProxy("www.naver.com");
        Browser.show();
        Browser.show();

        AtomicLong startTime = new AtomicLong();
        AtomicLong endTime = new AtomicLong();

        IAopBrowser aopBrowser = new AopProxy(
                "www.google.com",
                () -> {
                    System.out.println("before");
                    startTime.set(System.currentTimeMillis());
                },
                () -> {
                    System.out.println("end");
                    endTime.set(System.currentTimeMillis() - startTime.get());
                }
        );

        aopBrowser.show();
        System.out.println(endTime);
    }
}
