package api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan(basePackages = {"common", "api"})
public class BookStoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApiApplication.class, args);
	}
}
