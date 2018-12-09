package taskapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    /**
     * create a list that contains Task objects.
     */
    List<Task> taskList = new ArrayList<>();

    public String addTask (String taskname) {
        taskList.add(new Task(taskname));
        return "Task:" + taskname + " has been created";
    }

    public String findAllTasks() {
        return taskList.toString();
    }

}
