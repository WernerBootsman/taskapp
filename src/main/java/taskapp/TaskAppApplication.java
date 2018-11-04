package taskapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

@RestController
@EnableAutoConfiguration
public class TaskAppApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World! This is TaskApp!";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(TaskAppApplication.class, args);
        System.out.println("This is the system line print from the TaskAppApplication class");

        /** create a list.*/
        ArrayList<Task> TaskList = new ArrayList();
        System.out.println("Initial size of TaskList:" + TaskList.size());


        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a task: ");
            String myString = input.nextLine();
            System.out.println("You entered: " + myString);
            TaskList.add(new Task(myString));
            System.out.println("Current size of ArrayList: " + TaskList.size());
            System.out.println("The current list of tasks: " + TaskList.toString());
        } while (true);


        /** TODO
        - Create GET endpoint to retrieve Task(s)
        - Create endpoint to create a Task
        - Create endpoint to list all Tasks
        - Create endpoint to delete a specific Task
         */
    }

}