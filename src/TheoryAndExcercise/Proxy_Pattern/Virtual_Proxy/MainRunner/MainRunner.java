package TheoryAndExcercise.Proxy_Pattern.Virtual_Proxy.MainRunner;

import TheoryAndExcercise.Proxy_Pattern.Virtual_Proxy.Concrete_Components.ProxyParser;
import TheoryAndExcercise.Proxy_Pattern.Virtual_Proxy.Interface.Parser;

public class MainRunner {
    public static void main(String[] args) {
        String data = "hello world \n how are we doing today?";
        Parser parser = new ProxyParser(data);

        System.out.println(parser.getNumOfLines());
        System.out.println(parser.getNumOfVowels());
        System.out.println(parser.getNumOfWords());
    }
}
