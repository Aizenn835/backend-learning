# 🚀 Backend Learning Lab

My personal repository for practicing and understanding backend development concepts.

Each folder contains a small, focused project for learning one concept before applying it to larger applications.

---

# 🟩 1. Spring Boot Fundamentals

* [ ] Spring Boot project structure
* [ ] Maven
* [x] Dependency Injection
* [ ] IoC (Inversion of Control)
* [ ] Beans
* [ ] Component Scanning
* [ ] `@Component`
* [ ] `@Service`
* [ ] `@Repository`
* [ ] `@RestController`
* [ ] Constructor Injection
* [ ] Configuration
* [ ] `application.properties`
* [ ] `application.yml`
* [ ] Profiles
* [ ] Environment Variables
* [ ] Logging

---

# 🌐 2. REST API

* [ ] HTTP basics
* [ ] Request / Response
* [ ] HTTP Headers
* [ ] HTTP Status Codes
* [ ] GET
* [ ] POST
* [ ] PUT
* [ ] PATCH
* [ ] DELETE
* [ ] Path Variables
* [ ] Query Parameters
* [ ] Request Body
* [ ] Response Body
* [ ] JSON
* [ ] REST Controllers
* [ ] Postman
* [ ] CRUD APIs
* [ ] REST API design

---

# 📦 3. DTOs & Validation

* [ ] DTOs
* [ ] Request DTOs
* [ ] Response DTOs
* [ ] Entity vs DTO
* [ ] Entity → DTO
* [ ] DTO → Entity
* [ ] Bean Validation
* [ ] `@NotNull`
* [ ] `@NotBlank`
* [ ] `@Size`
* [ ] `@Email`
* [ ] `@Min`
* [ ] `@Max`
* [ ] Custom Validation
* [ ] Validation Error Responses

---

# 🚨 4. Exception Handling

* [x] Java Exceptions in Spring
* [x] Custom Exceptions
* [x] `@ExceptionHandler`
* [ ] `@ControllerAdvice`
* [x] `@RestControllerAdvice`
* [x] Global Exception Handling
* [x] Custom Error Responses
* [x] HTTP Error Status Codes

---

# 🗄️ 5. SQL & PostgreSQL

* [ ] Database fundamentals
* [ ] Tables
* [ ] Primary Keys
* [ ] Foreign Keys
* [ ] Constraints
* [ ] `SELECT`
* [ ] `INSERT`
* [ ] `UPDATE`
* [ ] `DELETE`
* [ ] `WHERE`
* [ ] `ORDER BY`
* [ ] `GROUP BY`
* [ ] Aggregate Functions
* [ ] JOINs

  * [ ] INNER JOIN
  * [ ] LEFT JOIN
  * [ ] RIGHT JOIN
* [ ] Subqueries
* [ ] Indexes
* [ ] Transactions
* [ ] Normalization
* [ ] PostgreSQL
* [ ] Database Design

---

# 🟫 6. Spring Data JPA

* [ ] JPA fundamentals
* [ ] Hibernate
* [ ] Entities
* [ ] `@Entity`
* [ ] `@Table`
* [ ] `@Id`
* [ ] `@GeneratedValue`
* [ ] `@Column`
* [ ] Entity Lifecycle
* [ ] Repositories
* [ ] `JpaRepository`
* [ ] CRUD Operations
* [ ] Derived Query Methods
* [ ] JPQL
* [ ] Native Queries
* [ ] Pagination
* [ ] Sorting

---

# 🔗 7. JPA Relationships

* [ ] `@OneToOne`
* [ ] `@OneToMany`
* [ ] `@ManyToOne`
* [ ] `@ManyToMany`
* [ ] `@JoinColumn`
* [ ] `mappedBy`
* [ ] Owning Side
* [ ] Bidirectional Relationships
* [ ] Unidirectional Relationships
* [ ] Cascade Types
* [ ] Fetch Types

  * [ ] LAZY
  * [ ] EAGER
* [ ] Orphan Removal
* [ ] JSON Recursion Problems
* [ ] Relationship Design

---

# 🧬 8. JPA Entity Inheritance

Practice object-oriented inheritance with database entities.

* [ ] Parent Entity
* [ ] Child Entity
* [ ] Polymorphism
* [ ] `@Inheritance`
* [ ] `InheritanceType.SINGLE_TABLE`
* [ ] `InheritanceType.JOINED`
* [ ] `InheritanceType.TABLE_PER_CLASS`
* [ ] `@DiscriminatorColumn`
* [ ] `@DiscriminatorValue`
* [ ] Database structure for each strategy
* [ ] When to use inheritance
* [ ] When NOT to use inheritance
* [ ] Composition vs Inheritance

Example:

```text
Account
├── SavingsAccount
└── CheckingAccount
```

---

# 🔄 9. Transactions

* [ ] Transactions
* [ ] ACID
* [ ] `@Transactional`
* [ ] Commit
* [ ] Rollback
* [ ] Transaction Propagation
* [ ] Isolation Levels
* [ ] Dirty Reads
* [ ] Non-repeatable Reads
* [ ] Phantom Reads

---

# 🔐 10. Spring Security

* [ ] Authentication
* [ ] Authorization
* [ ] Security Filter Chain
* [ ] `SecurityFilterChain`
* [ ] Password Encoding
* [ ] BCrypt
* [ ] `UserDetails`
* [ ] `UserDetailsService`
* [ ] `AuthenticationManager`
* [ ] Basic Authentication
* [ ] Roles
* [ ] Authorities
* [ ] Endpoint Authorization
* [ ] Method Security
* [ ] CORS
* [ ] CSRF

---

# 🎟️ 11. JWT Authentication

* [ ] What JWT is
* [ ] JWT Structure
* [ ] Header
* [ ] Payload
* [ ] Signature
* [ ] Access Tokens
* [ ] Token Expiration
* [ ] JWT Authentication Filter
* [ ] Bearer Authentication
* [ ] Login
* [ ] Registration
* [ ] Protected Endpoints
* [ ] Refresh Tokens
* [ ] Token Revocation
* [ ] Secure Password Storage

---

# 👤 12. Roles & Permissions

* [ ] Roles
* [ ] Authorities
* [ ] Permissions
* [ ] Role-Based Access Control
* [ ] User vs Admin
* [ ] Resource Ownership
* [ ] Method-Level Authorization
* [ ] Protecting User-Specific Resources

Example:

```text
USER
├── View own profile
├── Create order
└── View own orders

ADMIN
├── Manage users
├── Manage products
└── Manage orders
```

---

# 📁 13. File Uploads

* [ ] Multipart Requests
* [ ] `MultipartFile`
* [ ] Image Upload
* [ ] File Validation
* [ ] File Size Limits
* [ ] File Naming
* [ ] UUID Filenames
* [ ] File Storage
* [ ] Static Resource Mapping
* [ ] File Deletion
* [ ] Cloud File Storage

---

# 🧪 14. Testing

* [ ] Unit Testing
* [ ] JUnit
* [ ] Mockito
* [ ] Mocking
* [ ] Service Tests
* [ ] Repository Tests
* [ ] Controller Tests
* [ ] Integration Tests
* [ ] Test Database
* [ ] Testcontainers

---

# ⚡ 15. Advanced JPA & Database

* [ ] N+1 Query Problem
* [ ] Entity Graphs
* [ ] Fetch Joins
* [ ] Optimistic Locking
* [ ] Pessimistic Locking
* [ ] Specifications
* [ ] Criteria API
* [ ] Auditing
* [ ] Database Migrations
* [ ] Flyway
* [ ] Liquibase

---

# 🏗️ 16. Backend Architecture

* [ ] Layered Architecture
* [ ] Controller Layer
* [ ] Service Layer
* [ ] Repository Layer
* [ ] DTO Layer
* [ ] Entity Layer
* [ ] Mapper Pattern
* [ ] Separation of Concerns
* [ ] SOLID Principles
* [ ] Clean Code
* [ ] Composition vs Inheritance
* [ ] Clean Architecture
* [ ] Modular Architecture

---

# 🚀 17. Production Backend

* [ ] Environment Variables
* [ ] Configuration Management
* [ ] Docker
* [ ] Docker Compose
* [ ] PostgreSQL with Docker
* [ ] Linux Basics
* [ ] Application Deployment
* [ ] Reverse Proxy
* [ ] HTTPS
* [ ] Domain Names
* [ ] CI/CD
* [ ] GitHub Actions
* [ ] Cloud Deployment
* [ ] AWS
* [ ] Monitoring
* [ ] Logging

---

# 📈 18. Performance & Scalability

* [ ] Database Indexing
* [ ] Query Optimization
* [ ] Connection Pooling
* [ ] Caching
* [ ] Redis
* [ ] Pagination
* [ ] Rate Limiting
* [ ] Asynchronous Processing
* [ ] Message Queues
* [ ] Kafka
* [ ] RabbitMQ
* [ ] Horizontal Scaling

---

# 🏆 Current Progress

### Spring Boot

* [ ] Fundamentals
* [ ] REST API
* [ ] DTOs
* [ ] Validation
* [ ] Exception Handling

### Database / JPA

* [ ] SQL
* [ ] PostgreSQL
* [ ] JPA Basics
* [ ] Relationships
* [ ] Queries
* [ ] Transactions
* [ ] Entity Inheritance

### Security

* [ ] Basic Authentication
* [x] JWT Authentication
* [ ] Roles & Permissions

### Other Backend

* [ ] File Uploads
* [ ] Testing
* [ ] Architecture
* [ ] Docker
* [ ] Deployment
* [ ] Performance

---

# 📁 Repository Structure

Each topic should be a **small independent project**.

```text
backend-learning/
│
├── README.md
│
├── spring-boot/
│   ├── fundamentals/
│   ├── rest-api/
│   ├── validation/
│   └── exception-handling/
│
├── database/
│   ├── sql/
│   └── postgresql/
│
├── jpa/
│   ├── basic-entity/
│   ├── relationships/
│   ├── queries/
│   ├── transactions/
│   └── inheritance/
│
├── spring-security/
│   ├── basic-auth/
│   ├── jwt/
│   └── roles-permissions/
│
├── file-upload/
│
├── testing/
│   ├── junit/
│   ├── mockito/
│   └── integration-testing/
│
└── advanced/
    ├── caching/
    ├── redis/
    ├── messaging/
    └── docker/
```

Each Spring Boot practice project can have its own:

```text
pom.xml
src/
README.md
```

---

# 🧠 Learning Rule

Don't just copy code.

For every concept:

1. Understand what problem it solves.
2. Build the smallest possible example.
3. Break it intentionally.
4. Fix it.
5. Explain it in the README.
6. Apply it to a real project.

> **Learn → Experiment → Break → Understand → Apply**
