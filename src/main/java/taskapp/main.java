package taskapp;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Scanner;

@RestController
@EnableAutoConfiguration
public class main {

    @RequestMapping("/")
    String home() {
        return "Hello World! This is taskapp!";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(main.class, args);

        //create an array list.
        ArrayList<Task> TaskList = new ArrayList<>();
        System.out.println("Initial size of TaskList:" + TaskList.size());


        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a task: ");
            String myString = input.nextLine();
            System.out.println("You entered: " + myString);
            TaskList.add(new Task (myString));
            System.out.println("Current size of ArrayList: " + TaskList.size());
            System.out.println("The current list of tasks: " + TaskList.toString());
        } while (true);

        //TODO
        //- Create GET endpoint to retrieve Task(s)
        //- Create endpoint to create a Task
        //- Create endpoint to list all Tasks
        //- Create andpoint to delete a specific Task
    }

}