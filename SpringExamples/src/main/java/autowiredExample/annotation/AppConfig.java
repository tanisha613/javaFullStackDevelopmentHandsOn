package autowiredExample.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "autowiredExample.annotation")
public class AppConfig {
}
