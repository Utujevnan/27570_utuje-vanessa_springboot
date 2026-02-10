# Spring Boot RESTful API Projects

**Student Name:** Utuje Vanessa  
**Student ID:** 27570

---

## Question 1: Library Book Management API

**Description:** REST API to manage library books with operations to retrieve, add, update, and delete books.

**Base URL:** `http://localhost:8081/api/books`

### Endpoint 1: Get All Books
- **Method:** GET
- **URL:** `/api/books`
- **Request Body:** -
- **Expected Output:** 
```json
[
  {"id":1,"title":"Clean Code","author":"Robert Martin","isbn":"978-0132350884","publicationYear":2008},
  {"id":2,"title":"Effective Java","author":"Joshua Bloch","isbn":"978-0134685991","publicationYear":2018}
]
```
- **Screenshot:** Q1_1.png

### Endpoint 2: Get Book by ID
- **Method:** GET
- **URL:** `/api/books/1`
- **Request Body:** -
- **Expected Output:** 
```json
{"id":1,"title":"Clean Code","author":"Robert Martin","isbn":"978-0132350884","publicationYear":2008}
```
- **Screenshot:** Q1_2.png

### Endpoint 3: Create New Book
- **Method:** POST
- **URL:** `/api/books`
- **Request Body:** 
```json
{"title":"Spring in Action","author":"Craig Walls","isbn":"978-1617294945","publicationYear":2020}
```
- **Expected Output:** 
```json
{"id":3,"title":"Spring in Action","author":"Craig Walls","isbn":"978-1617294945","publicationYear":2020}
```
- **Screenshot:** Q1_3.png

### Endpoint 4: Update Book
- **Method:** PUT
- **URL:** `/api/books/1`
- **Request Body:** 
```json
{"title":"Clean Code (Updated)","author":"Robert Martin","isbn":"978-0132350884","publicationYear":2012}
```
- **Expected Output:** 
```json
{"id":1,"title":"Clean Code (Updated)","author":"Robert Martin","isbn":"978-0132350884","publicationYear":2012}
```
- **Screenshot:** Q1_4.png

### Endpoint 5: Delete Book
- **Method:** DELETE
- **URL:** `/api/books/3`
- **Request Body:** -
- **Expected Output:** HTTP 204 No Content
- **Screenshot:** Q1_5.png

---

## Question 2: Student Management API

**Description:** REST API to manage student records with operations to retrieve, add, update, and delete students.

**Base URL:** `http://localhost:8082/api/students`

### Endpoint 1: Get All Students
- **Method:** GET
- **URL:** `/api/students`
- **Request Body:** -
- **Expected Output:** 
```json
[
  {"id":1,"name":"John Doe","email":"john@example.com","major":"Computer Science","gpa":3.8},
  {"id":2,"name":"Jane Smith","email":"jane@example.com","major":"Information Technology","gpa":3.9}
]
```
- **Screenshot:** Q2_1.png

### Endpoint 2: Get Student by ID
- **Method:** GET
- **URL:** `/api/students/1`
- **Request Body:** -
- **Expected Output:** 
```json
{"id":1,"name":"John Doe","email":"john@example.com","major":"Computer Science","gpa":3.8}
```
- **Screenshot:** Q2_2.png

### Endpoint 3: Create New Student
- **Method:** POST
- **URL:** `/api/students`
- **Request Body:** 
```json
{"name":"Alice Johnson","email":"alice@example.com","major":"Data Science","gpa":3.7}
```
- **Expected Output:** 
```json
{"id":3,"name":"Alice Johnson","email":"alice@example.com","major":"Data Science","gpa":3.7}
```
- **Screenshot:** Q2_3.png

### Endpoint 4: Update Student
- **Method:** PUT
- **URL:** `/api/students/1`
- **Request Body:** 
```json
{"name":"John Doe","email":"john.doe@example.com","major":"Computer Science","gpa":3.85}
```
- **Expected Output:** 
```json
{"id":1,"name":"John Doe","email":"john.doe@example.com","major":"Computer Science","gpa":3.85}
```
- **Screenshot:** Q2_4.png

### Endpoint 5: Delete Student
- **Method:** DELETE
- **URL:** `/api/students/3`
- **Request Body:** -
- **Expected Output:** HTTP 204 No Content
- **Screenshot:** Q2_5.png

---

## Question 3: Restaurant Menu API

**Description:** REST API to manage restaurant menu items with filtering by category, availability, and search functionality.

**Base URL:** `http://localhost:8083/api/menu`

### Endpoint 1: Get All Menu Items
- **Method:** GET
- **URL:** `/api/menu`
- **Request Body:** -
- **Expected Output:** 
```json
[
  {"id":1,"name":"Bruschetta","description":"Toasted bread with tomato and basil","price":6.99,"category":"Appetizer","available":true},
  {"id":2,"name":"Grilled Salmon","description":"Fresh salmon fillet with lemon butter sauce","price":18.99,"category":"Main Course","available":true}
]
```
- **Screenshot:** Q3_1.png

### Endpoint 2: Get Menu Item by ID
- **Method:** GET
- **URL:** `/api/menu/1`
- **Request Body:** -
- **Expected Output:** 
```json
{"id":1,"name":"Bruschetta","description":"Toasted bread with tomato and basil","price":6.99,"category":"Appetizer","available":true}
```
- **Screenshot:** Q3_2.png

### Endpoint 3: Search Menu by Category
- **Method:** GET
- **URL:** `/api/menu/category/Dessert`
- **Request Body:** -
- **Expected Output:** 
```json
[
  {"id":5,"name":"Tiramisu","description":"Italian dessert with coffee and mascarpone","price":7.99,"category":"Dessert","available":true},
  {"id":6,"name":"Chocolate Lava Cake","description":"Warm chocolate cake with molten center","price":8.99,"category":"Dessert","available":false}
]
```
- **Screenshot:** Q3_3.png

### Endpoint 4: Search Menu by Name
- **Method:** GET
- **URL:** `/api/menu/search?name=pasta`
- **Request Body:** -
- **Expected Output:** 
```json
[{"id":4,"name":"Pasta Carbonara","description":"Creamy pasta with bacon and parmesan","price":14.99,"category":"Main Course","available":true}]
```
- **Screenshot:** Q3_4.png

### Endpoint 5: Get Available Items
- **Method:** GET
- **URL:** `/api/menu/available?available=false`
- **Request Body:** -
- **Expected Output:** 
```json
[{"id":6,"name":"Chocolate Lava Cake","description":"Warm chocolate cake with molten center","price":8.99,"category":"Dessert","available":false}]
```
- **Screenshot:** Q3_5.png

### Endpoint 6: Create Menu Item
- **Method:** POST
- **URL:** `/api/menu`
- **Request Body:** 
```json
{"name":"Caesar Salad","description":"Fresh romaine with caesar dressing","price":9.99,"category":"Appetizer","available":true}
```
- **Expected Output:** 
```json
{"id":9,"name":"Caesar Salad","description":"Fresh romaine with caesar dressing","price":9.99,"category":"Appetizer","available":true}
```
- **Screenshot:** Q3_6.png

### Endpoint 7: Toggle Item Availability
- **Method:** PUT
- **URL:** `/api/menu/6/availability`
- **Request Body:** -
- **Expected Output:** 
```json
{"id":6,"name":"Chocolate Lava Cake","description":"Warm chocolate cake with molten center","price":8.99,"category":"Dessert","available":true}
```
- **Screenshot:** Q3_7.png

### Endpoint 8: Delete Menu Item
- **Method:** DELETE
- **URL:** `/api/menu/9`
- **Request Body:** -
- **Expected Output:** HTTP 204 No Content
- **Screenshot:** Q3_8.png

---

## Question 4: Ecommerce Product API

**Description:** REST API to manage product catalog with full CRUD operations for an ecommerce platform.

**Base URL:** `http://localhost:8080/api/products`

### Endpoint 1: Get All Products
- **Method:** GET
- **URL:** `/api/products`
- **Request Body:** -
- **Expected Output:** 
```json
[
  {"id":1,"name":"Wireless Mouse","description":"Ergonomic wireless mouse","price":19.99,"stock":50,"available":true},
  {"id":2,"name":"Mechanical Keyboard","description":"RGB mechanical keyboard","price":69.99,"stock":20,"available":true}
]
```
- **Screenshot:** Q4_1.png

### Endpoint 2: Get Product by ID
- **Method:** GET
- **URL:** `/api/products/1`
- **Request Body:** -
- **Expected Output:** 
```json
{"id":1,"name":"Wireless Mouse","description":"Ergonomic wireless mouse","price":19.99,"stock":50,"available":true}
```
- **Screenshot:** Q4_2.png

### Endpoint 3: Create New Product
- **Method:** POST
- **URL:** `/api/products`
- **Request Body:** 
```json
{"name":"Bluetooth Speaker","description":"Portable speaker","price":39.99,"stock":15,"available":true}
```
- **Expected Output:** 
```json
{"id":4,"name":"Bluetooth Speaker","description":"Portable speaker","price":39.99,"stock":15,"available":true}
```
- **Screenshot:** Q4_3.png

### Endpoint 4: Update Product
- **Method:** PUT
- **URL:** `/api/products/4`
- **Request Body:** 
```json
{"name":"Bluetooth Speaker","description":"Portable speaker - updated","price":34.99,"stock":10,"available":false}
```
- **Expected Output:** 
```json
{"id":4,"name":"Bluetooth Speaker","description":"Portable speaker - updated","price":34.99,"stock":10,"available":false}
```
- **Screenshot:** Q4_4.png

### Endpoint 5: Delete Product
- **Method:** DELETE
- **URL:** `/api/products/4`
- **Request Body:** -
- **Expected Output:** HTTP 204 No Content
- **Screenshot:** Q4_5.png

---

## Question 5: Task Management API

**Description:** REST API to manage tasks with status tracking, priority levels, and team assignment.

**Base URL:** `http://localhost:8085/api/tasks`

### Endpoint 1: Get All Tasks
- **Method:** GET
- **URL:** `/api/tasks`
- **Request Body:** -
- **Expected Output:** 
```json
[
  {"id":1,"title":"Design API","description":"Create REST API specification","status":"COMPLETED","dueDate":"2026-02-05T02:53:58.4560803","priority":"HIGH","assignedTo":"John"},
  {"id":2,"title":"Implement endpoints","description":"Develop CRUD endpoints","status":"IN_PROGRESS","dueDate":"2026-02-13T02:53:58.4560803","priority":"HIGH","assignedTo":"Jane"}
]
```
- **Screenshot:** Q5_1.png

### Endpoint 2: Get Task by ID
- **Method:** GET
- **URL:** `/api/tasks/1`
- **Request Body:** -
- **Expected Output:** 
```json
{"id":1,"title":"Design API","description":"Create REST API specification","status":"COMPLETED","dueDate":"2026-02-05T02:53:58.4560803","priority":"HIGH","assignedTo":"John"}
```
- **Screenshot:** Q5_2.png

### Endpoint 3: Get Tasks by Status
- **Method:** GET
- **URL:** `/api/tasks/status/TODO`
- **Request Body:** -
- **Expected Output:** 
```json
[
  {"id":3,"title":"Write tests","description":"Unit and integration tests","status":"TODO","dueDate":"2026-02-17T02:53:58.4560803","priority":"MEDIUM","assignedTo":"Bob"}
]
```
- **Screenshot:** Q5_3.png

### Endpoint 4: Get Tasks by Priority
- **Method:** GET
- **URL:** `/api/tasks/priority/HIGH`
- **Request Body:** -
- **Expected Output:** 
```json
[
  {"id":1,"title":"Design API","description":"Create REST API specification","status":"COMPLETED","dueDate":"2026-02-05T02:53:58.4560803","priority":"HIGH","assignedTo":"John"},
  {"id":2,"title":"Implement endpoints","description":"Develop CRUD endpoints","status":"IN_PROGRESS","dueDate":"2026-02-13T02:53:58.4560803","priority":"HIGH","assignedTo":"Jane"}
]
```
- **Screenshot:** Q5_4.png

### Endpoint 5: Get Tasks by Assignee
- **Method:** GET
- **URL:** `/api/tasks/assigned/Jane`
- **Request Body:** -
- **Expected Output:** 
```json
[{"id":2,"title":"Implement endpoints","description":"Develop CRUD endpoints","status":"IN_PROGRESS","dueDate":"2026-02-13T02:53:58.4560803","priority":"HIGH","assignedTo":"Jane"}]
```
- **Screenshot:** Q5_5.png

### Endpoint 6: Create New Task
- **Method:** POST
- **URL:** `/api/tasks`
- **Request Body:** 
```json
{"title":"Code review","description":"Review PR changes","status":"TODO","dueDate":"2026-02-12T15:00:00","priority":"MEDIUM","assignedTo":"Charlie"}
```
- **Expected Output:** 
```json
{"id":5,"title":"Code review","description":"Review PR changes","status":"TODO","dueDate":"2026-02-12T15:00:00","priority":"MEDIUM","assignedTo":"Charlie"}
```
- **Screenshot:** Q5_6.png

### Endpoint 7: Update Task
- **Method:** PUT
- **URL:** `/api/tasks/5`
- **Request Body:** 
```json
{"title":"Code review","description":"Review PR changes","status":"IN_PROGRESS","dueDate":"2026-02-12T15:00:00","priority":"MEDIUM","assignedTo":"Charlie"}
```
- **Expected Output:** 
```json
{"id":5,"title":"Code review","description":"Review PR changes","status":"IN_PROGRESS","dueDate":"2026-02-12T15:00:00","priority":"MEDIUM","assignedTo":"Charlie"}
```
- **Screenshot:** Q5_7.png

### Endpoint 8: Mark Task Complete (PATCH)
- **Method:** PATCH
- **URL:** `/api/tasks/3/complete`
- **Request Body:** -
- **Expected Output:** 
```json
{"id":3,"title":"Write tests","description":"Unit and integration tests","status":"COMPLETED","dueDate":"2026-02-17T02:53:58.4560803","priority":"MEDIUM","assignedTo":"Bob"}
```
- **Screenshot:** Q5_8.png

### Endpoint 9: Delete Task
- **Method:** DELETE
- **URL:** `/api/tasks/5`
- **Request Body:** -
- **Expected Output:** HTTP 204 No Content
- **Screenshot:** Q5_9.png

---

## Question 6: User Profile API

**Description:** REST API to manage user profiles with full CRUD operations and partial updates via PATCH.

**Base URL:** `http://localhost:8086/api/profiles`

### Endpoint 1: Get All Profiles
- **Method:** GET
- **URL:** `/api/profiles`
- **Request Body:** -
- **Expected Output:** 
```json
[
  {"id":1,"username":"johnDoe","email":"john@example.com","firstName":"John","lastName":"Doe","phone":"555-0001","bio":"Software Engineer","active":true},
  {"id":2,"username":"janeSmith","email":"jane@example.com","firstName":"Jane","lastName":"Smith","phone":"555-0002","bio":"Product Manager","active":true}
]
```
- **Screenshot:** Q6_1.png

### Endpoint 2: Get Profile by ID
- **Method:** GET
- **URL:** `/api/profiles/1`
- **Request Body:** -
- **Expected Output:** 
```json
{"id":1,"username":"johnDoe","email":"john@example.com","firstName":"John","lastName":"Doe","phone":"555-0001","bio":"Software Engineer","active":true}
```
- **Screenshot:** Q6_2.png

### Endpoint 3: Get Profile by Username
- **Method:** GET
- **URL:** `/api/profiles/username/johnDoe`
- **Request Body:** -
- **Expected Output:** 
```json
{"id":1,"username":"johnDoe","email":"john@example.com","firstName":"John","lastName":"Doe","phone":"555-0001","bio":"Software Engineer","active":true}
```
- **Screenshot:** Q6_3.png

### Endpoint 4: Create New Profile
- **Method:** POST
- **URL:** `/api/profiles`
- **Request Body:** 
```json
{"username":"aliceBrown","email":"alice@example.com","firstName":"Alice","lastName":"Brown","phone":"555-0004","bio":"Data Scientist","active":true}
```
- **Expected Output:** 
```json
{"id":4,"username":"aliceBrown","email":"alice@example.com","firstName":"Alice","lastName":"Brown","phone":"555-0004","bio":"Data Scientist","active":true}
```
- **Screenshot:** Q6_4.png

### Endpoint 5: Update Full Profile
- **Method:** PUT
- **URL:** `/api/profiles/4`
- **Request Body:** 
```json
{"username":"aliceBrownUpdated","email":"alice.new@example.com","firstName":"Alice","lastName":"Brown-Smith","phone":"555-9999","bio":"Senior Data Scientist","active":true}
```
- **Expected Output:** 
```json
{"id":4,"username":"aliceBrownUpdated","email":"alice.new@example.com","firstName":"Alice","lastName":"Brown-Smith","phone":"555-9999","bio":"Senior Data Scientist","active":true}
```
- **Screenshot:** Q6_5.png

### Endpoint 6: Partial Update Profile (PATCH)
- **Method:** PATCH
- **URL:** `/api/profiles/1`
- **Request Body:** 
```json
{"bio":"Senior Software Engineer - Cloud Expert"}
```
- **Expected Output:** 
```json
{"id":1,"username":"johnDoe","email":"john@example.com","firstName":"John","lastName":"Doe","phone":"555-0001","bio":"Senior Software Engineer - Cloud Expert","active":true}
```
- **Screenshot:** Q6_6.png

### Endpoint 7: Delete Profile
- **Method:** DELETE
- **URL:** `/api/profiles/4`
- **Request Body:** -
- **Expected Output:** HTTP 204 No Content
- **Screenshot:** Q6_7.png

---

## Summary

All six Spring Boot RESTful APIs have been successfully implemented with comprehensive CRUD operations:

- **Q1:** Library Book Management API (Port 8081)
- **Q2:** Student Management API (Port 8082)
- **Q3:** Restaurant Menu API (Port 8083)
- **Q4:** Ecommerce Product API (Port 8080)
- **Q5:** Task Management API (Port 8085)
- **Q6:** User Profile API (Port 8086)

Each API includes proper HTTP methods, error handling, and follows RESTful principles. Screenshots for each endpoint are stored in the respective `screenshots/` directory.
