package TheoryAndExcercise.Proxy_Pattern.Virtual_Proxy.Concrete_Components;

import TheoryAndExcercise.Proxy_Pattern.Virtual_Proxy.Interface.Parser;

public class BookParser implements Parser {

    private String data;
    private int numOfWords;
    private int numOfLines;
    private int numOfVowels;
    private final char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public BookParser(String data){
        this.parse(data);
    }

    @Override
    public void parse(String data){
        this.data = data;
        numOfWords = this.data.split(" ").length;
        numOfLines = this.data.split("\n").length;
        int count  = 0;
        for(char i:vowels){
            for(char j:this.data.toCharArray()){
                if(i == j)count++;
            }
        }
        numOfVowels = count;
    }

    @Override
    public int getNumOfWords(){
        return numOfWords;
    }

    @Override
    public int getNumOfLines(){
        return numOfLines;
    }

    @Override
    public int getNumOfVowels(){
        return numOfVowels;
    }
}
