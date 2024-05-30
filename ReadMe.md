# Sphere Volume Calculator

This project is a simple web application built with Spring Boot and Thymeleaf that calculates the volume of a sphere given its radius.

## Project Structure

The project follows the MVC (Model-View-Controller) architecture:

- Controller: `VolumeController.java` handles incoming HTTP requests, interacts with the service layer, and returns appropriate responses.
- Service Interface: `VolumeService.java` defines the contract for calculating the volume of a sphere.
- Service Implementation: `VolumeServiceImpl.java` provides the implementation for the volume calculation logic.
- View (HTML Template): The HTML template (`volume.html`) contains the form to input the radius and displays the calculated volume.

## Technologies Used

- Spring Boot: Framework for creating standalone, production-grade Spring-based applications.
- Thymeleaf: Modern server-side Java template engine for web and standalone environments.
- Bootstrap: Front-end framework for developing responsive and mobile-first websites.

## Running the Application

To run the application locally:

1. Ensure you have Java Development Kit (JDK) and Maven installed on your machine.
2. Unzip the project folder.
3. Navigate to the project directory.
4. Build the project: `mvn clean install`
5. Run the application: `mvn spring-boot:run`
6. Access the application in your web browser at `http://localhost:8080`

## Usage

1. Enter the radius of the sphere in the input field.
2. Click the "Calculate" button.
3. The calculated volume of the sphere will be displayed below the form.

## Future Improvements

- Error Handling: Implement error handling for invalid inputs or server errors.
- Unit Testing: Write unit tests to ensure the correctness of the volume calculation logic.
- Enhanced UI: Improve the user interface with additional styling and interactive features.

These are fundamental improvements, but we can do more.