package TheoryAndExcercise.Proxy_Pattern.Protection_Proxy.Concrete_Component;

import TheoryAndExcercise.Proxy_Pattern.Protection_Proxy.Interface.Internet;

public class Actual_internet implements Internet {

    @Override
    public void connectTo(String url){
        System.out.println("Connecting to " + url);
    }
}
