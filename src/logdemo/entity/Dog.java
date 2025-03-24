package logdemo.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog {
    private static final Logger logger = LoggerFactory.getLogger(Dog.class);
    private String name;

    public Dog(String name) {
        this.name = name;
        logger.info("Создан объект Dog с именем: {}", name);
    }
}