import asciiPanel.AsciiPanel;
import config.MainConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfiguration.class);

        AsciiPanel panel = app.getBean(AsciiPanel.class);
        System.out.println(panel);
    }
}
