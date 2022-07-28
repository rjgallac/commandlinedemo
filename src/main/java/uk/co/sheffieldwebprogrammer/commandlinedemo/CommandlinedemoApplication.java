package uk.co.sheffieldwebprogrammer.commandlinedemo;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CommandlinedemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
//		SpringApplication.run(CommandlinedemoApplication.class, args);
		new SpringApplicationBuilder(CommandlinedemoApplication.class)
				.logStartupInfo(false)
				.bannerMode(Banner.Mode.OFF)
				.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello world");
	}
}
