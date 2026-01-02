Task 1 – Spring Boot MVC Application

This project was created as part of Task 1 for the Spring Framework Applications course
at Akademia Finansów i Biznesu Vistula.

The goal of this task is to demonstrate basic usage of the Spring Framework by creating
a simple Spring Boot application that handles HTTP GET requests using both plain text
responses and the MVC (Model–View–Controller) pattern with Thymeleaf templates.


Technologies Used

Java: 17
Spring Boot: 3.x
Spring Web (MVC)
Thymeleaf
Maven
IntelliJ IDEA


Application Description

The application runs on an embedded Tomcat server on port 8080.
It demonstrates two different approaches to handling HTTP requests in Spring Boot:

1. Returning a plain text response directly to the browser.
2. Rendering an HTML page using the MVC pattern and Thymeleaf.

Static resources such as images are served automatically from the static directory.


Project Structure

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


Use Cases

Use Case 1: Plain Text Response (@ResponseBody)

Description:
The user sends an HTTP GET request to the root endpoint of the application.
The application returns a simple text response directly in the browser.

HTTP Method: GET
Endpoint: /
Response:
Hello Vistula, my first Spring controller!

Screenshot file:
screenshots/usecase1_root.png


Use Case 2: MVC Page with Thymeleaf

Description:
The user sends an HTTP GET request to the /greeting endpoint.
The application renders an HTML page using the MVC pattern and Thymeleaf.

The controller passes data to the view using the Model object.
The page displays a personalized greeting message.

HTTP Method: GET
Endpoint: /greeting

Optional query parameters:
name=Aldiyar -> Hello, Aldiyar!
name=Ali -> Hello, Ali!
name not provided -> Hello, Student!

Screenshot file:
screenshots/usecase2_greeting.png


How to Run the Application

Option 1: IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Wait for Maven dependencies to download.
3. Run the Task1Application class.
4. Open a browser and navigate to:
   http://localhost:8080/
   http://localhost:8080/greeting
   http://localhost:8080/greeting?name=Aldiyar


Option 2: Command Line

mvn clean install
mvn spring-boot:run


MVC Pattern Explanation

Controller:
Handles HTTP requests and processes user input.

Model:
Transfers data from the controller to the view.

View:
Thymeleaf template that renders dynamic HTML based on model attributes.

This separation of concerns improves readability and maintainability.


Conclusion

Task 1 was completed successfully.
The application correctly handles HTTP requests, demonstrates the usage of
@ResponseBody, and implements the MVC pattern using Spring Boot and Thymeleaf.
