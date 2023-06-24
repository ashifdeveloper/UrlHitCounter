# Url Hit Counter


## Frameworks and Language Used

The following frameworks and languages were used in the development of this project:

- Java
- Spring Boot

## Data Flow

The following functions were used in this project:

1. Controller - This component is responsible for handling the incoming requests and processing them.
2. Entity - This component provides object handles of the application.
 

## Data Structure

The following data structures were used in this project:

- HashMap

## brief description of each of the components in the context of the code:

### Controller
The controller is responsible for handling incoming requests and returning appropriate responses. In the code, it have a UserController which handles requests related to the user entity. It has methods such as getHitCount,getHitCountByUsername. These methods use the UserService to perform read operations on the user data.

### Service
The service layer contains the business logic of the project. It acts as an intermediary between the controller and the repository. In the code, it have a UrlHitService which contains methods such as getHitCount, getHitCountByUsername.
### Entity
In the code, I have created a module named User which contains the User entity class. This class represents the data model of the user and contains properties such as id, name, username, address, and phoneNumber.

Overall, these components work together to create a layered architecture for your project, which separates concerns and promotes modularity and maintainability.

## Project Summary

The aim of this project is to count the visitor to create a project. The system is built using Java and Spring Boot.The data flow is handled by the Controller, and Service. The project also makes use of HashMap to store and manipulate data.
