# Task 1 – Spring Boot MVC Application

This project was created as part of **Task 1** for the *Spring Framework Applications* course  
at **Akademia Finansów i Biznesu Vistula**.

The goal of this task is to demonstrate basic usage of the Spring Framework by creating
a simple Spring Boot application that handles HTTP GET requests using both:

- plain text responses with `@ResponseBody`
- the MVC (Model–View–Controller) pattern with Thymeleaf templates

---

## Technologies Used

- **Java:** 17  
- **Spring Boot:** 3.x  
- **Spring Web (MVC)**  
- **Thymeleaf**  
- **Maven**  
- **IntelliJ IDEA**

---

## Application Description

The application runs on an embedded Tomcat server on port **8080** and demonstrates
two different approaches to handling HTTP requests in Spring Boot:

1. Returning a plain text response directly to the browser.
2. Rendering an HTML page using the MVC pattern and Thymeleaf with dynamic data.

Static resources such as images are served automatically from the `static` directory.

---

## Project Structure

```text
src/main/
├── java/pl/edu/vistula/
│   ├── Task1Application.java
│   └── controller/
│       └── HelloController.java
└── resources/
    ├── static/
    │   └── images/
    │       └── Vistula.png
    ├── templates/
    │   └── greeting.html
    └── application.properties
