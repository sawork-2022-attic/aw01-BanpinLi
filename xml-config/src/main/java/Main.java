import asciiPanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        AsciiPanel panel = app.getBean(AsciiPanel.class);
        System.out.println(panel);
    }
}
