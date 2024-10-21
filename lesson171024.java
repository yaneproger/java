
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class lesson171024 {

    public static void main(String[] args) throws IOException {
        lesson();

    }

    public static void lesson() throws IOException {

        Logger logger = Logger.getLogger(lesson171024.class.getName());

        FileHandler fh = new FileHandler("lesson171024.xml");

        // ConsoleHandler ch = new ConsoleHandler();
        // logger.addHandler(ch);
        logger.addHandler(fh);

        // SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        // ch.setFormatter(sFormat);
        // ch.setFormatter(xml);
        fh.setFormatter(xml);

        logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Test logging 1 ");
        logger.info("Test logging 2");

    }

}
