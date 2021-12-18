package challenges.week3.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        System.out.println("This is a message");
        // sout - leaving messages in, level of detail
        // debugger = tied to the IDE, record

        Logger logger = Logger.getLogger("myLogger");
        
        try {
            Handler fileHandler = new FileHandler("src/main/java/challenges/week3/logging/myLog.log");
            logger.addHandler(fileHandler);
//            System.setProperty("java.util.logging.SimpleFormatter.format");
            fileHandler.setFormatter(new CustomFormatter());

        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.setLevel(Level.INFO);
        logger.setFilter(new CustomFilter());
        logger.log(Level.INFO, "This is an Info Message");
        logger.log(Level.WARNING, "This is a Warning Message");
    }
}
