package neo.singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void classLogg(Object obj, String info) {
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yy"));
        System.out.println("Log info: " + date + " - " + obj.getClass().getSimpleName() + " - " + info);
    }
}