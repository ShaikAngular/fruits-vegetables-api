package commergingcolumns.differenttables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DifferentTablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DifferentTablesApplication.class, args);
		System.out.println("merging different columns from different tables and displaying in single json response");
	}

}
