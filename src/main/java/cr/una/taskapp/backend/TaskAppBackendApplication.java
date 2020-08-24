package cr.una.taskapp.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.util.Properties;

@SpringBootApplication(exclude= HibernateJpaAutoConfiguration.class)
public class TaskAppBackendApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TaskAppBackendApplication.class);
        Properties props = new Properties();
        props.setProperty("server.port", "8083");

        app.setDefaultProperties(props);
        app.run(args);

    }

}
