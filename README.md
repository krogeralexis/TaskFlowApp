# Project Management System

## Description
This is a simple project management system built with Java and Spring Boot. It allows teams to manage projects, assign tasks, and track progress. Users can also comment on tasks, attach files, and receive notifications. It's designed to help with better collaboration and visibility across team projects.

## Features
- Create and manage users, roles, and projects.
- Assign tasks to users, set deadlines, and priorities.
- Add comments, file attachments, and track task history.
- Get notifications for task updates and project changes.

## Technologies Used
- **Java 17+**
- **Spring Boot** for backend development.
- **Spring Security** for user authentication.
- **MySQL** for database management.
- **RESTful API** for communication between the frontend and backend.

## Getting Started

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/project-management-system.git
    ```

2. Configure your MySQL database in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/project_management_db
    spring.datasource.username=root
    spring.datasource.password=password
    spring.jpa.hibernate.ddl-auto=update
    ```

3. Build and run the application:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

4. Open the app in your browser at 'soon'.

## Usage
- Register and log in as a user.
- Create projects, assign tasks, and track updates.
- Add comments and attachments to tasks.
- Stay updated with notifications.

