package logdemo;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.logging.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws FileNotFoundException {
       System.setOut(new PrintStream(new FileOutputStream("out.log")));
       System.out.println("printLN");
       System.err.println("printLNError");
        logger.info("Это сообщение уровня INFO");
        logger.warning("Это предупреждение уровня WARNING");
        logger.severe("Это ошибка уровня SEVERE");
        System.out.println("hellooooo");
    }
}