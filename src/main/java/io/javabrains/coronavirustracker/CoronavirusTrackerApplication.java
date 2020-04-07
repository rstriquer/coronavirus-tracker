package io.javabrains.coronavirustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusTrackerApplication.class, args);
	}

}
/*
/usr/java/jdk-12.0.2/bin/java
		-Dfile.encoding=UTF-8
		-classpath ./target/classes:./target/dependency
		io.javabrains.coronavirustracker.CoronavirusTrackerApplication
 */