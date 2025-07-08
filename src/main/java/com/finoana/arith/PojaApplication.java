package com.finoana.arith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PojaApplication {
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(PojaApplication.class);
    app.setAdditionalProfiles("lambda");
    app.run(args);
  }
}

