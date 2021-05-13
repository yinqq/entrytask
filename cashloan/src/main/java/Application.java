import com.entrytask.controller.CashloanController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.entrytask.config","com.entrytask.interceptors"})
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);

    }
}
