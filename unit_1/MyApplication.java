/*
Welcome to your first Spring Boot practice task! This task is designed to help you get familiar with the CodeSignal IDE and the project setup we'll be using throughout the course:

When you open the task, a setup script will run automatically. This script installs dependencies and builds your project to ensure faster subsequent builds. It may take some time to complete, and you can monitor the progress in the terminal window. Please avoid clicking the Run or Submit buttons while the script is running. You can read the task description or examine the project files in the meantime.

The application doesn't start automatically. Execute the gradle bootRun command to start it. Note that the application won't run in watch mode, so if you make any changes, you'll need to stop and restart it. Press Ctrl + C in the terminal to stop the running application.

When you click the "Run" button, JUnit tests in the src/test/java/com/codesignal folder will be executed. The results of these tests determine if your solution is correct. Be sure to click "Run" before clicking "Submit". Tests can take up to 60 seconds to complete, so please be patient. It might be a good idea to stop the server before executing tests to release resources and avoid potential port conflicts.

In this exercise, you'll observe a small Spring Boot application which doesn't do anything yet. Execute the gradle bootRun command and wait for the application to start
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}