# Student CRUD Operations

Performed CRUD operations (i.e., Create, Read, Update, Delete) application for managing student records. 
It's built using Java, Spring Boot, and MySQL.

## Getting Started

Clone the repository:

```bash
git clone https://github.com/Rushi116/ATDevRepo.git
cd ATDevRepo/StudentCRUD
```

## Getting Started
StudentCRUD/
|-- src/
|   |-- main/
|       |-- java/
|           |-- com.student/
|               |-- controller/
|               |-- entity/
|               |-- exception/
|               |-- repository/
|               |-- service/
|               |-- serviceImpl/
|       |-- resources/
|           |-- application.properties
|-- target/
|-- pom.xml
|-- README.md


## Api End Points
GET /students: Get all students
GET /students/{id}: Get student by ID
POST /students: Add a new student
POST /students/update/{id}: Update student by ID
DELETE /students/{id}: Delete student by ID

```Database Configuration
#port
server.port=8081
#url
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
#username
spring.datasource.username=yourmysqlusername
#password
spring.datasource.password=yourmysqlpassword
#jpa
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Cool Ready to go 
2. Run Inbuilt Tomcat Server to run application





   
