import java.util.logging.Level;
import java.util.logging.Logger;

public class Car implements Vehicle {

    @Override
    public void ChangeTires() {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.log(Level.INFO,"Change Tires 4");
    }
}
