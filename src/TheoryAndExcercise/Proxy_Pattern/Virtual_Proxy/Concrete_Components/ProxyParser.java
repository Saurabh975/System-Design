package TheoryAndExcercise.Proxy_Pattern.Virtual_Proxy.Concrete_Components;

import TheoryAndExcercise.Proxy_Pattern.Virtual_Proxy.Interface.Parser;

/**
 * Lazy object creation. Helps in caching
 */
public class ProxyParser implements Parser {
    private BookParser bookParser;
    String data;

    public  ProxyParser(String data){
        this.parse(data);
    }

    @Override
    public void parse(String data){
        this.data = data;
    }

    @Override
    public int getNumOfWords(){
        if(bookParser == null)bookParser = new BookParser(this.data);
        return bookParser.getNumOfWords();
    }

    @Override
    public int getNumOfLines(){
        if(bookParser == null)bookParser = new BookParser(this.data);
        return bookParser.getNumOfLines();
    }

    @Override
    public int getNumOfVowels(){
        if(bookParser == null)bookParser = new BookParser(this.data);
        return bookParser.getNumOfVowels();
    }
}
