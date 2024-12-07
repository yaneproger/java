
import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;
// import java.util.logging.Logger;
// import java.util.logging.Logger;

public class lesson251124log {

    static {

        try (
                FileInputStream inputstreamfile = new FileInputStream("log.config")) {

            LogManager.getLogManager().readConfiguration(inputstreamfile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Logger logmethod(String className) {
        return Logger.getLogger(className);
    }

}
