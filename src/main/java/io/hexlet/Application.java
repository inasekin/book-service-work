package io.hexlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        if (args == null) {
            args = new String[]{};
        }
        SpringApplication.run(Application.class, args);
    }
}
