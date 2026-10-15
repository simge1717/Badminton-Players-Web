# Badminton Players Web Application

## About the Project

This is a web application I built using Java and Spring Boot. It allows users to enter badminton player information through a web form and save it to an H2 database.

I created this project to practice connecting a web application to a database and learn how Spring Boot, JPA, and repositories work together.

## Features

- Enter a player's name, skill level, and playing style
- Add speed, power, and favorite shot information
- Save player information to a database
- View saved records through the H2 Console

## Technologies Used

- Java 17
- Spring Boot
- Spring MVC
- Thymeleaf
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- HTML

## How to Run the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/simge1717/Badminton-Players-Web.git
   ```

2. Open the project folder:

   ```bash
   cd Badminton-Players-Web
   ```

3. Run the application on Windows:

   ```powershell
   .\mvnw.cmd spring-boot:run
   ```

4. Open this URL in your browser:

   http://localhost:8080/

## Database

This project uses an H2 database to store player information.

To access the H2 Console, open:

http://localhost:8080/h2-console

Use these connection settings:

- JDBC URL: `jdbc:h2:file:./data/badmintonplayers`
- Username: `sa`
- Password: Leave blank

To see the saved players, run:

```sql
SELECT * FROM BADMINTON_PLAYER;
```

## What I Learned

While working on this project, I practiced creating a web form, handling form submissions in Spring Boot, working with JPA entities and repositories, and saving data to a database.

## Future Improvements

I would like to add a page that displays all saved players and allow users to edit or delete player information.

## Author

Simge

GitHub: [@simge1717](https://github.com/simge1717)
