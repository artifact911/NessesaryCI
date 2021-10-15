package org.example.core.logger;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Подключены зависимости в POM.xml
 * Добавлен файл в logback.xml в resources
 */
public class Slf4jLogbackExample {

    private static final Logger logger = LoggerFactory.getLogger(Slf4jLogbackExample.class);

    private static final String FILENAME = "/file/does/not/exist";


    public static void main(String[] args) {

        logger.info("Just a log message");
        logger.debug("Message for debug level.");

        try {
            Files.readAllBytes(Paths.get(FILENAME));
        } catch (IOException e) {
            logger.error("Failed to read file {}", FILENAME, e);
        }
    }

}
