import java.util.Date;


class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        Date date = new Date();
        System.out.println("[" + date + "] " + message);
    }
}