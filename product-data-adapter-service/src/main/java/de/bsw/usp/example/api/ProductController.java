package de.bsw.usp.example.api;

import de.bsw.usp.example.model.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * A simple REST controller for retrieving products.
 * <br>
 * So far only with hardcoded data.
 */
@RestController
public class ProductController {

    private static final Map<String, ProductDto> DB = Map.of(
            "ABC123", new ProductDto("ABC123", "Recurve Bow Alpha", 199.99),
            "XYZ789", new ProductDto("XYZ789", "Compound Bow Pro", 499.00)
    );

    @GetMapping("/products/{sku}")
    public ResponseEntity<?> getBySku(@PathVariable String sku) {
        ProductDto p = DB.get(sku);
        if (p == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(p);
    }
}
