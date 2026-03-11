package hiber.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("hiber")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
public class AppConfig {
}