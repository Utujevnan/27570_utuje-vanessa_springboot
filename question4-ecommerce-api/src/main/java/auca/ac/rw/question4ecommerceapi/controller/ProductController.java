package auca.ac.rw.question4ecommerceapi.controller;

import auca.ac.rw.question4ecommerceapi.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final List<Product> products = new ArrayList<>();
    private Long nextId = 4L;

    public ProductController() {
        products.add(new Product(1L, "Wireless Mouse", "Ergonomic wireless mouse", 19.99, 50, true));
        products.add(new Product(2L, "Mechanical Keyboard", "RGB mechanical keyboard", 69.99, 20, true));
        products.add(new Product(3L, "USB-C Charger", "Fast 45W charger", 29.99, 100, true));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        product.setId(nextId++);
        products.add(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product update) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .map(p -> {
                    p.setName(update.getName());
                    p.setDescription(update.getDescription());
                    p.setPrice(update.getPrice());
                    p.setStock(update.getStock());
                    p.setAvailable(update.isAvailable());
                    return ResponseEntity.ok(p);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        boolean removed = products.removeIf(p -> p.getId().equals(id));
        return removed ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
