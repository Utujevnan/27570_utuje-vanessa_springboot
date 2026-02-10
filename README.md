# Spring Boot RESTful API Projects

**Student Name:** Utuje Vanessa | **Student ID:** 27570

---

## Question 1: Library Book Management API
**Port:** 8081 | **Base URL:** `http://localhost:8081/api/books`

| Endpoint | Method | URL | Screenshot |
|----------|--------|-----|-----------|
| Get All Books | GET | `/api/books` | [![Q1-GET-All-Books](question1-library-api/screenshots/Q1-GET-All-Books.png)](question1-library-api/screenshots/Q1-GET-All-Books.png) |
| Get Book by ID | GET | `/api/books/1` | [![Q1-GET-Book-By-Id](question1-library-api/screenshots/Q1-GET-Book-By-Id.png)](question1-library-api/screenshots/Q1-GET-Book-By-Id.png) |
| Search Books | GET | `/api/books/search?title=...` | [![Q1-SEARCH](question1-library-api/screenshots/Q1-SEARCH-Book-By-Title.png)](question1-library-api/screenshots/Q1-SEARCH-Book-By-Title.png) |
| Create Book | POST | `/api/books` | [![Q1-POST-Add](question1-library-api/screenshots/Q1-POST-Add-Book.png)](question1-library-api/screenshots/Q1-POST-Add-Book.png) |
| Delete Book | DELETE | `/api/books/{id}` | [![Q1-DELETE](question1-library-api/screenshots/Q1-DELETE-Book.png)](question1-library-api/screenshots/Q1-DELETE-Book.png) |

---

## Question 2: Student Management API
**Port:** 8082 | **Base URL:** `http://localhost:8082/api/students`

| Endpoint | Method | URL | Screenshot |
|----------|--------|-----|-----------|
| Get All Students | GET | `/api/students` | [![Q2-GET-All](question2studentapi/screenshots/Q2-GET-All-Students.png)](question2studentapi/screenshots/Q2-GET-All-Students.png) |
| Get Student by ID | GET | `/api/students/{id}` | [![Q2-GET-By-ID](question2studentapi/screenshots/Q2-GET-Student-By-ID.png)](question2studentapi/screenshots/Q2-GET-Student-By-ID.png) |
| Filter by GPA | GET | `/api/students/filter?gpa=...` | [![Q2-GET-By-GPA](question2studentapi/screenshots/Q2-GET-Students-By-GPA.png)](question2studentapi/screenshots/Q2-GET-Students-By-GPA.png) |
| Filter by Major | GET | `/api/students/major/{major}` | [![Q2-GET-By-Major](question2studentapi/screenshots/Q2-GET-Students-By-Major.png)](question2studentapi/screenshots/Q2-GET-Students-By-Major.png) |
| Create Student | POST | `/api/students` | [![Q2-POST-Add](question2studentapi/screenshots/Q2-POST-Add-Student.png)](question2studentapi/screenshots/Q2-POST-Add-Student.png) |
| Update Student | PUT | `/api/students/{id}` | [![Q2-PUT-Update](question2studentapi/screenshots/Q2-PUT-Update-Student.png)](question2studentapi/screenshots/Q2-PUT-Update-Student.png) |

---

## Question 3: Restaurant Menu API
**Port:** 8083 | **Base URL:** `http://localhost:8083/api/menu`

| Endpoint | Method | URL | Screenshot |
|----------|--------|-----|-----------|
| Get All Menu | GET | `/api/menu` | [![Q3-GET-All](question3-restaurant-api/screenshots/Q3-GET-All-Menu.png)](question3-restaurant-api/screenshots/Q3-GET-All-Menu.png) |
| Get Menu by ID | GET | `/api/menu/{id}` | [![Q3-GET-By-ID](question3-restaurant-api/screenshots/Q3-GET-Menu-By-ID.png)](question3-restaurant-api/screenshots/Q3-GET-Menu-By-ID.png) |
| Search by Name | GET | `/api/menu/search?name=...` | [![Q3-SEARCH](question3-restaurant-api/screenshots/Q3-SEARCH-Menu-By-Name.png)](question3-restaurant-api/screenshots/Q3-SEARCH-Menu-By-Name.png) |
| Create Menu Item | POST | `/api/menu` | [![Q3-POST-Add](question3-restaurant-api/screenshots/Q3-POST-Add-Menu.png)](question3-restaurant-api/screenshots/Q3-POST-Add-Menu.png) |
| Toggle Availability | PUT | `/api/menu/{id}/availability` | [![Q3-PUT-Toggle](question3-restaurant-api/screenshots/Q3-PUT-Toggle-Availability.png)](question3-restaurant-api/screenshots/Q3-PUT-Toggle-Availability.png) |

---

## Question 4: Ecommerce Product API
**Port:** 8080 | **Base URL:** `http://localhost:8080/api/products`

| Endpoint | Method | URL | Screenshot |
|----------|--------|-----|-----------|
| Get All Products | GET | `/api/products` | [![Q4-GET-All](question4-ecommerce-api/screenshots/Q4-GET-All-Products.png)](question4-ecommerce-api/screenshots/Q4-GET-All-Products.png) |
| Get Product by ID | GET | `/api/products/{id}` | [![Q4-GET-By-ID](question4-ecommerce-api/screenshots/Q4-GET-Product-By-ID.png)](question4-ecommerce-api/screenshots/Q4-GET-Product-By-ID.png) |
| Create Product | POST | `/api/products` | [![Q4-POST-Add](question4-ecommerce-api/screenshots/Q4-POST-Add-Product.png)](question4-ecommerce-api/screenshots/Q4-POST-Add-Product.png) |

---

## Question 5: Task Management API
**Port:** 8085 | **Base URL:** `http://localhost:8085/api/tasks`

| Endpoint | Method | URL | Screenshot |
|----------|--------|-----|-----------|
| Get All Tasks | GET | `/api/tasks` | [![Q5-GET-All](question5-task-api/screenshots/Q5-GET-All-Tasks.png)](question5-task-api/screenshots/Q5-GET-All-Tasks.png) |
| Get Task by ID | GET | `/api/tasks/{id}` | [![Q5-GET-By-ID](question5-task-api/screenshots/Q5-GET-Task-By-ID.png)](question5-task-api/screenshots/Q5-GET-Task-By-ID.png) |
| Tasks by Priority | GET | `/api/tasks/priority/{priority}` | [![Q5-GET-By-Priority](question5-task-api/screenshots/Q5-GET-Tasks-By-Priority.png)](question5-task-api/screenshots/Q5-GET-Tasks-By-Priority.png) |
| Create Task | POST | `/api/tasks` | [![Q5-POST-New](question5-task-api/screenshots/Q5-POST-New-Task.png)](question5-task-api/screenshots/Q5-POST-New-Task.png) |
| Update Task | PUT | `/api/tasks/{id}` | [![Q5-PUT-Update](question5-task-api/screenshots/Q5-PUT-Update-Task.png)](question5-task-api/screenshots/Q5-PUT-Update-Task.png) |
| Mark Complete (PATCH) | PATCH | `/api/tasks/{id}/complete` | [![Q5-PATCH-Complete](question5-task-api/screenshots/Q5-PATCH-Complete-Task.png)](question5-task-api/screenshots/Q5-PATCH-Complete-Task.png) |
| Delete Task | DELETE | `/api/tasks/{id}` | [![Q5-DELETE](question5-task-api/screenshots/Q5-DELETE-Task.png)](question5-task-api/screenshots/Q5-DELETE-Task.png) |

---

## Question 6: User Profile API
**Port:** 8086 | **Base URL:** `http://localhost:8086/api/profiles`

| Endpoint | Method | URL | Screenshot |
|----------|--------|-----|-----------|
| Get All/Verify Profiles | GET | `/api/profiles` | [![Q6-Verify](question6-profile-api/screenshots/Q6_4_Verify_Profile_List.png)](question6-profile-api/screenshots/Q6_4_Verify_Profile_List.png) |
| Update Profile (PUT) | PUT | `/api/profiles/{id}` | [![Q6-PUT-Request](question6-profile-api/screenshots/Q6_1_Update_Profile_Request.png)](question6-profile-api/screenshots/Q6_1_Update_Profile_Request.png) |
| Update Response | - | - | [![Q6-PUT-Response](question6-profile-api/screenshots/Q6_2_Update_Profile_Response.png)](question6-profile-api/screenshots/Q6_2_Update_Profile_Response.png) |

---

## Summary

All 6 Spring Boot REST APIs fully implemented:
- **Q1:** Library API - Book management (5 endpoints)
- **Q2:** Student API - Student records (6 endpoints)
- **Q3:** Restaurant API - Menu management (5 endpoints)
- **Q4:** Ecommerce API - Product catalog (3 endpoints)
- **Q5:** Task API - Task management with PATCH (7 endpoints)
- **Q6:** Profile API - User profiles (CRUD + PATCH)

Screenshots available in each project's `screenshots/` directory.
