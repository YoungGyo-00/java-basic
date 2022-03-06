package 자바.이론.디자인패턴.adapter.aop;

import 자바.이론.디자인패턴.adapter.proxy.Html;

public class AopProxy implements IAopBrowser{

    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public AopProxy(String url){
        this.url = url;
    }

    public AopProxy(String url, Runnable before, Runnable after){
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() {
        after.run();

        if (html == null){
            this.html = new Html(url);
            System.out.println("loading");
        }
        System.out.println("cache");
        before.run();
        return html;
    }
}
