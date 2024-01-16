# Student CRUD Operations

Performed CRUD operations (i.e., Create, Read, Update, Delete) application for managing student records. 
It's built using Java, Spring Boot, MySQL and PostMan for Testing endpoints.

## Getting Started

Clone the repository:

```bash
git clone https://github.com/Rushi116/ATDevRepo.git
cd ATDevRepo/StudentCRUD
```
## Api End Points
```
GET /students: Get all students
GET /students/{id}: Get student by ID
POST /students: Add a new student
POST /students/update/{id}: Update student by ID
DELETE /students/{id}: Delete student by ID
```
Database Configuration
```
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
Run Inbuilt Tomcat Server to run application

# Testing
1. Get All Records
   api endpoint = http://localhost:8081/students
   method = GET
   Result = Status 200 OK

2. Add Student
   api endpoint = http://localhost:8081/students
   method = POST
   Result = Status 200 OK with entity describing
   input = JSON
   {
        "firstName": "Rohan",
        "lastName": "Phalke",
        "age": 25,
        "email": "ro.phalke25@gmail.com",
    }

3. get by roll Id
  api endpoint = http://localhost:8081/students/3
   method = GET
   Result = Status 200 OK

4. update student
   api endpoint = http://localhost:8081/students/7
   method = POST
   Result = Status 200 OK
   input = JSON
   {
    "firstName" : "Hitesh",
    "lastName" : "Mehta",
    "email" : "s.hitesh45@gmail.com",
    "age" : "30"
}

5. Delete Student Record
   api endpoint = http://localhost:8081/students/3
   method = DELETE
   Result = Status 200 OK
   

   
