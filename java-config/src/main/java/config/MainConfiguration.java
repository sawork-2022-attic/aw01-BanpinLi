package config;

import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {

    @Bean("CP437_8x8")
    public AsciiFont getCP437_8x8Font() {
        return AsciiFont.CP437_8x8;
    }

    @Bean("CP437_9x16")
    public AsciiFont getCP437_9x16Font() {
        return AsciiFont.CP437_9x16;
    }

    @Bean
    public AsciiPanel getAsciiPanel() {
        AsciiPanel panel = new AsciiPanel();
        panel.setAsciiFont(getCP437_8x8Font());
        return panel;
    }

}
