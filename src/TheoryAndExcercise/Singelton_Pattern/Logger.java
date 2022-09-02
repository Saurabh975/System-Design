package TheoryAndExcercise.Singelton_Pattern;

public class Logger {
    static Logger LOGGER = new Logger();

    private Logger(){}

    public Logger getOrCreateLogger(){
        if(LOGGER == null)LOGGER = new Logger();
        return LOGGER;
    }

    public void info(String message){
        System.out.println("INFO : " + message);
    }

    public void error(String message){
        System.err.println("ERROR : " +message);
    }
}
