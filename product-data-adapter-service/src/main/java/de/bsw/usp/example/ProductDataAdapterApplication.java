package de.bsw.usp.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main class of the product data adapter service.
 * <br>
 * Use this to start the service.
 * Keep the resulting console open.
 */
@SpringBootApplication
public class ProductDataAdapterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductDataAdapterApplication.class, args);
    }
}