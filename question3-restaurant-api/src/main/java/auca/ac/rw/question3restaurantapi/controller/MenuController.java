package auca.ac.rw.question3restaurantapi.controller;

import auca.ac.rw.question3restaurantapi.model.MenuItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    private List<MenuItem> menuItems = new ArrayList<>();
    private Long nextId = 9L;

    public MenuController() {
        menuItems.add(new MenuItem(1L, "Bruschetta", "Toasted bread with tomato and basil", 6.99, "Appetizer", true));
        menuItems.add(new MenuItem(2L, "Calamari", "Fried squid rings with garlic aioli", 8.99, "Appetizer", true));
        menuItems.add(new MenuItem(3L, "Grilled Salmon", "Fresh salmon fillet with lemon butter sauce", 18.99, "Main Course", true));
        menuItems.add(new MenuItem(4L, "Pasta Carbonara", "Creamy pasta with bacon and parmesan", 14.99, "Main Course", true));
        menuItems.add(new MenuItem(5L, "Tiramisu", "Italian dessert with coffee and mascarpone", 7.99, "Dessert", true));
        menuItems.add(new MenuItem(6L, "Chocolate Lava Cake", "Warm chocolate cake with molten center", 8.99, "Dessert", false));
        menuItems.add(new MenuItem(7L, "Espresso", "Strong Italian coffee", 3.50, "Beverage", true));
        menuItems.add(new MenuItem(8L, "House Wine", "Red or white selection", 7.99, "Beverage", true));
    }

    @GetMapping
    public ResponseEntity<List<MenuItem>> getAllMenuItems() {
        return ResponseEntity.ok(menuItems);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MenuItem> getMenuItemById(@PathVariable Long id) {
        return menuItems.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<MenuItem>> getItemsByCategory(@PathVariable String category) {
        List<MenuItem> result = menuItems.stream()
                .filter(item -> item.getCategory().equalsIgnoreCase(category))
                .toList();
        return result.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(result);
    }

    @GetMapping("/available")
    public ResponseEntity<List<MenuItem>> getAvailableItems(@RequestParam(defaultValue = "true") boolean available) {
        List<MenuItem> result = menuItems.stream()
                .filter(item -> item.isAvailable() == available)
                .toList();
        return result.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(result);
    }

    @GetMapping("/search")
    public ResponseEntity<List<MenuItem>> searchByName(@RequestParam String name) {
        List<MenuItem> result = menuItems.stream()
                .filter(item -> item.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
        return result.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<MenuItem> addMenuItem(@RequestBody MenuItem menuItem) {
        menuItem.setId(nextId++);
        menuItems.add(menuItem);
        return ResponseEntity.status(HttpStatus.CREATED).body(menuItem);
    }

    @PutMapping("/{id}/availability")
    public ResponseEntity<MenuItem> toggleAvailability(@PathVariable Long id) {
        return menuItems.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .map(item -> {
                    item.setAvailable(!item.isAvailable());
                    return ResponseEntity.ok(item);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenuItem(@PathVariable Long id) {
        boolean removed = menuItems.removeIf(item -> item.getId().equals(id));
        return removed ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
