package com.SpringAssigment.SpringAssigment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public @interface SpringBootApplication {

    @SpringBootApplication
    public class SpringAssigmentApplication { // 🔁 Class name should match the file name & start with uppercase

        public static void main(String[] args) {
            SpringApplication.run(SpringAssigmentApplication.class, args); // 🔁 Match correct class name
        }

    }



}
