package 자바.이론.디자인패턴.adapter.proxy;

public class BrowserProxy implements IBrowser{

    private String url;
    private Html html;

    public BrowserProxy(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        if(html == null){
            this.html = new Html(url);
            System.out.println("loading" + url);
        }
        System.out.println("cache" + url);
        return html;
    }
}
