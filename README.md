SPRING - BOOT FILE
# Spring Boot Student Management API

A RESTful CRUD API built with Spring Boot for managing student records, backed by a MySQL database.

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot 4.1.0-SNAPSHOT |
| Web | Spring MVC (spring-boot-starter-webmvc) |
| Persistence | Spring Data JPA + Hibernate |
| Database | MySQL |
| Build Tool | Maven (Maven Wrapper included) |
| Dev Tools | Spring Boot DevTools |

---

## Project Structure

```
demo/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── DemoApplication.java          # Entry point
│   │   │   ├── controller/
│   │   │   │   ├── StudentController.java    # REST endpoints for /students
│   │   │   │   └── HelloController.java      # Practice/test controller (commented out)
│   │   │   ├── model/
│   │   │   │   ├── Student.java              # JPA entity (id, name, age)
│   │   │   │   └── User.java                 # Model class
│   │   │   ├── repository/
│   │   │   │   └── StudentRepository.java    # JpaRepository interface
│   │   │   └── service/
│   │   │       └── StudentService.java       # Business logic layer
│   │   └── resources/
│   │       └── application.properties        # DB config, server port
│   └── test/
│       └── java/com/example/demo/
│           └── DemoApplicationTests.java
└── pom.xml
```

---

## Prerequisites

- Java 17+
- Maven 3.6+ (or use the included `mvnw` wrapper)
- MySQL running locally

---

## Database Setup

1. Start your MySQL server.
2. Create the database:
   ```sql
   CREATE DATABASE studentdb;
   ```
3. Update credentials in `src/main/resources/application.properties` if needed:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

The table is created automatically by Hibernate (`ddl-auto=update`).

---

## Running the Application

```bash
# Using Maven Wrapper (recommended)
./mvnw spring-boot:run          # Linux / macOS
mvnw.cmd spring-boot:run        # Windows

# Or with Maven installed globally
mvn spring-boot:run
```

The server starts on **port 8081** by default.

---

## API Endpoints

Base URL: `http://localhost:8081/students`

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/students` | Create a new student |
| `GET` | `/students` | Get all students |
| `GET` | `/students/{id}` | Get a student by ID |
| `PUT` | `/students/{id}` | Update a student by ID |
| `DELETE` | `/students/{id}` | Delete a student by ID |

### Example Request & Response

**Create a student — `POST /students`**

Request body:
```json
{
  "id": 1,
  "name": "Ravi",
  "age": 21
}
```

Response:
```json
{
  "id": 1,
  "name": "Ravi",
  "age": 21
}
```

---

## Student Model

| Field | Type | Description |
|-------|------|-------------|
| `id` | `int` | Primary key (set manually) |
| `name` | `String` | Student's name |
| `age` | `int` | Student's age |

---

## Architecture Overview

```
HTTP Request
    ↓
StudentController   (handles routing, maps HTTP verbs to methods)
    ↓
StudentService      (business logic, injected via constructor)
    ↓
StudentRepository   (extends JpaRepository<Student, Integer>)
    ↓
MySQL Database
```

Spring manages all beans in its container. Constructor injection is used throughout — `StudentController` injects `StudentService`, and `StudentService` injects `StudentRepository`.

---

## Running Tests

```bash
./mvnw test        # Linux / macOS
mvnw.cmd test      # Windows
```
