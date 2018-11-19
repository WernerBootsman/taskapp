package taskapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/task")
public class TaskController {

    /**
     * create a list that contains Task objects.
     */
    List<Task> taskList = new ArrayList<>();

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity task(@RequestParam(value = "create") String taskname) {
        taskList.add(new Task(taskname));
        return new ResponseEntity<>(taskname, HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity task() {
        return new ResponseEntity<>(taskList, HttpStatus.OK);
    }
}