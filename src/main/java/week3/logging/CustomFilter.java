package week3.logging;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class CustomFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getLevel() != Level.WARNING;
    }
}
