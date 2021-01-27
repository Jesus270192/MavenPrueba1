import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jHelloWorld {

    private final Logger _logger = Logger.getLogger(Log4jHelloWorld.class);

    public Log4jHelloWorld()
    {
        //Configure logger
        BasicConfigurator.configure();
        _logger.debug("Hello World!");
        _logger.error("Hello World!");
    }
}