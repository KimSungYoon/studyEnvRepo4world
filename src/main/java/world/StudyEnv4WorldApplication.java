package world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyEnv4WorldApplication {

	public static void main(String[] args) {
		System.out.println("MyWorld   contents change!! Yahoo!!");
		
		System.out.println("Second LIne!!");
		
		SpringApplication.run(StudyEnv4WorldApplication.class, args);
	}

}
