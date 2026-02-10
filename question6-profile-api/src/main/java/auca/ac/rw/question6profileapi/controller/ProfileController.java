package auca.ac.rw.question6profileapi.controller;

import auca.ac.rw.question6profileapi.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {
    private final List<User> users = new ArrayList<>();
    private Long nextId = 4L;

    public ProfileController() {
        users.add(new User(1L, "johnDoe", "john@example.com", "John", "Doe", "555-0001", "Software Engineer", true));
        users.add(new User(2L, "janeSmith", "jane@example.com", "Jane", "Smith", "555-0002", "Product Manager", true));
        users.add(new User(3L, "bobJones", "bob@example.com", "Bob", "Jones", "555-0003", "Designer", false));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllProfiles() {
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getProfileById(@PathVariable Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<User> getProfileByUsername(@PathVariable String username) {
        return users.stream()
                .filter(u -> u.getUsername().equalsIgnoreCase(username))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<User> createProfile(@RequestBody User user) {
        user.setId(nextId++);
        users.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateProfile(@PathVariable Long id, @RequestBody User update) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .map(u -> {
                    u.setUsername(update.getUsername());
                    u.setEmail(update.getEmail());
                    u.setFirstName(update.getFirstName());
                    u.setLastName(update.getLastName());
                    u.setPhone(update.getPhone());
                    u.setBio(update.getBio());
                    u.setActive(update.isActive());
                    return ResponseEntity.ok(u);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<User> patchProfile(@PathVariable Long id, @RequestBody User partial) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .map(u -> {
                    if (partial.getUsername() != null) u.setUsername(partial.getUsername());
                    if (partial.getEmail() != null) u.setEmail(partial.getEmail());
                    if (partial.getFirstName() != null) u.setFirstName(partial.getFirstName());
                    if (partial.getLastName() != null) u.setLastName(partial.getLastName());
                    if (partial.getPhone() != null) u.setPhone(partial.getPhone());
                    if (partial.getBio() != null) u.setBio(partial.getBio());
                    if (partial.isActive() != null) u.setActive(partial.isActive());
                    return ResponseEntity.ok(u);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfile(@PathVariable Long id) {
        boolean removed = users.removeIf(u -> u.getId().equals(id));
        return removed ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
