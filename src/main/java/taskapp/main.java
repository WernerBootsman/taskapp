package taskapp;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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

        Task[] taskArray;  // declares a variable 'taskArray' of type Task array.
        taskArray = new Task[5];  // creates an array to hold 5 Tasks.

        int count = 0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a task");
            String myString = input.nextLine();
            System.out.println("You entered:" + myString);
            taskArray[count++] = new Task(myString);
        } while (count <5);

        System.out.println(Arrays.toString(taskArray));

    }

}