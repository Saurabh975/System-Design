package TheoryAndExcercise.Proxy_Pattern.Protection_Proxy.MainRuner;

import TheoryAndExcercise.Proxy_Pattern.Protection_Proxy.Concrete_Component.Proxy_Internet;
import TheoryAndExcercise.Proxy_Pattern.Protection_Proxy.Interface.Internet;

import java.io.IOException;

public class MainRuner {
    public static void main(String[] args) throws Exception {
        Internet internet = new Proxy_Internet();
        try {
            internet.connectTo("GFG.com");
            internet.connectTo("abc.com");
            internet.connectTo("walamrt.com");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
