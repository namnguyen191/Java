package Lab2b;

public class Main {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new LoggerFactory();
        Logger logger = loggerFactory.getLogger();
        logger.log("Test data");
    }
}
