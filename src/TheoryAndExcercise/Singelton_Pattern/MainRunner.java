package TheoryAndExcercise.Singelton_Pattern;
public class MainRunner {
    public static void main(String[] args) throws Exception {
        Logger.LOGGER.info("Hello this is info");
        Logger.LOGGER.error("Hello this is Error");
        Thread.sleep(1000);
        Logger.LOGGER.info("Hello this is info - 2");
        Logger.LOGGER.info("Hello this is info - 3");
        Logger.LOGGER.error("Hello this is Error-1");
    }
}
