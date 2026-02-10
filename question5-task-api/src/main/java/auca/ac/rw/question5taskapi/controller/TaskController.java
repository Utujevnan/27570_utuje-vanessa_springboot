package auca.ac.rw.question5taskapi.controller;

import auca.ac.rw.question5taskapi.model.Task;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final List<Task> tasks = new ArrayList<>();
    private Long nextId = 5L;

    public TaskController() {
        tasks.add(new Task(1L, "Design API", "Create REST API specification", "COMPLETED", LocalDateTime.now().minusDays(5), "HIGH", "John"));
        tasks.add(new Task(2L, "Implement endpoints", "Develop CRUD endpoints", "IN_PROGRESS", LocalDateTime.now().plusDays(3), "HIGH", "Jane"));
        tasks.add(new Task(3L, "Write tests", "Unit and integration tests", "TODO", LocalDateTime.now().plusDays(7), "MEDIUM", "Bob"));
        tasks.add(new Task(4L, "Deploy to production", "Release to production server", "TODO", LocalDateTime.now().plusDays(14), "HIGH", "Alice"));
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Task>> getTasksByStatus(@PathVariable String status) {
        List<Task> result = tasks.stream()
                .filter(t -> t.getStatus().equalsIgnoreCase(status))
                .toList();
        return result.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(result);
    }

    @GetMapping("/priority/{priority}")
    public ResponseEntity<List<Task>> getTasksByPriority(@PathVariable String priority) {
        List<Task> result = tasks.stream()
                .filter(t -> t.getPriority().equalsIgnoreCase(priority))
                .toList();
        return result.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(result);
    }

    @GetMapping("/assigned/{username}")
    public ResponseEntity<List<Task>> getTasksAssignedTo(@PathVariable String username) {
        List<Task> result = tasks.stream()
                .filter(t -> t.getAssignedTo().equalsIgnoreCase(username))
                .toList();
        return result.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        task.setId(nextId++);
        tasks.add(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(task);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task update) {
        return tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .map(t -> {
                    t.setTitle(update.getTitle());
                    t.setDescription(update.getDescription());
                    t.setStatus(update.getStatus());
                    t.setDueDate(update.getDueDate());
                    t.setPriority(update.getPriority());
                    t.setAssignedTo(update.getAssignedTo());
                    return ResponseEntity.ok(t);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @PatchMapping("/{id}/complete")
    public ResponseEntity<Task> markTaskComplete(@PathVariable Long id) {
        return tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .map(t -> {
                    t.setStatus("COMPLETED");
                    return ResponseEntity.ok(t);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        boolean removed = tasks.removeIf(t -> t.getId().equals(id));
        return removed ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
