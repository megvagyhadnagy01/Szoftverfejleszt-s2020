package pkg;

import org.tinylog.Logger;

public class main {


    public static void main(String[] args) {
        Logger.error("This is an ERROR message");
        Logger.warn("This is WARN message");
        Logger.info("This is an INFO message");
        Logger.debug("This is DEBUGmessage");
        Logger.trace("This is TRACE message");
        Logger.info("User's name is {}", System.getProperty("user.name")); //nincs string konkatenácio ás példányositás müvelet csökentés
        Logger.info("User's name is {}" + System.getProperty("user.name"));
        Logger.error(new RuntimeException("Osps:P"),"Something is wrong");


    }
}
