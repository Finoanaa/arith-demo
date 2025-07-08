package com.finoana.arith.endpoint.rest.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Profile("lambda")
@RestController
public class StoredIntController {

    private static final String FILE_PATH = "/tmp/stored-int.txt";

    @GetMapping("/stored-int")
    public String getStoredInt() throws IOException {
        File file = new File(FILE_PATH);
        if (file.exists()) {
            return Files.readString(file.toPath());
        } else {
            String random = String.valueOf(new Random().nextInt(1000));
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(random);
            }
            return random;
        }
    }
}
