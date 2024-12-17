# Spring Boot Country API

A REST API built using Java, Spring Boot, and MySQL that serves information about countries, their cities, and the languages spoken in those countries. The data is retrieved from a local MySQL database with a predefined schema (`world`).

## Features

- Fetch country details along with associated cities and languages in a single JSON response.
- MySQL database integration with JPA for efficient querying and relationship mapping.
- Organized and scalable code structure using Spring Boot and MVC architecture.

## Schema Overview

The project uses the following database tables from the `world` schema:

### Table: `country`
| Column           | Description                               |
|-------------------|-------------------------------------------|
| `Code`           | Primary key for the country table.       |
| `Name`           | Name of the country.                    |
| `Continent`      | Continent where the country is located. |
| `Region`         | Region within the continent.            |
| `Population`     | Population of the country.              |
| ...              | (Other fields are also included.)       |

### Table: `city`
| Column           | Description                               |
|-------------------|-------------------------------------------|
| `ID`             | Primary key for the city table.          |
| `Name`           | Name of the city.                       |
| `CountryCode`    | Foreign key referencing `country.Code`.  |
| `District`       | District where the city is located.      |
| `Population`     | Population of the city.                 |

### Table: `countrylanguage`
| Column           | Description                               |
|-------------------|-------------------------------------------|
| `CountryCode`    | Foreign key referencing `country.Code`.  |
| `Language`       | Language spoken in the country.          |
| `IsOfficial`     | Whether the language is official (T/F).  |
| `Percentage`     | Percentage of speakers in the country.   |

## Setup and Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/dstroke-afk/spring-boot-country-api.git
   cd spring-boot-country-api
2. Configure the Database:

Create a MySQL database named world.
Import the schema with the world database structure.

3. Update Application Properties: Update src/main/resources/application.properties with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/world
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

4. Run the Application:

Build and run the application using Maven or your IDE:

./mvnw spring-boot:run

5. Access the API:

Visit http://localhost:8080/api/countries to fetch country data.

6. API Response Example
Sample JSON response for a single country:

{
  "code": "USA",
  "name": "United States",
  "continent": "North America",
  "region": "Northern America",
  "population": 331002651,
  "cities": [
    {
      "id": 1,
      "name": "New York",
      "district": "New York",
      "population": 8175133
    },
    {
      "id": 2,
      "name": "Los Angeles",
      "district": "California",
      "population": 3792621
    }
  ],
  "languages": [
    {
      "language": "English",
      "isOfficial": "T",
      "percentage": 79.0
    },
    {
      "language": "Spanish",
      "isOfficial": "F",
      "percentage": 13.0
    }
  ]
}

7. Technologies Used
Java: Programming language.
Spring Boot: Framework for building RESTful APIs.
MySQL: Relational database for storing country, city, and language data.
Spring Data JPA: ORM for database interaction.

8. Future Enhancements
Add pagination and filtering for API responses.
Include endpoints for adding, updating, or deleting entries.
Implement role-based authentication for secure access.

9. License
This project is licensed under the MIT License.

You can customize this based on your specific needs or preferences. Let me know if you’d like me to include additional sections or modifications!





