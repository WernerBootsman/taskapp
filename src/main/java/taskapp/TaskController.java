package taskapp;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/task")
public class TaskController {

    /**
     * create a list that contains Task objects.
     */
    List<Task> TaskList = new ArrayList();

    @RequestMapping(method = RequestMethod.POST)
    public String Task(@RequestParam(value = "taskname") String taskname) {
        TaskList.add(new Task(taskname));
        return "OK";
    }


    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String RetrieveTaskList() {
        if (TaskList.isEmpty())
            return "There are no tasks";
        else return TaskList.toString();
    }
}