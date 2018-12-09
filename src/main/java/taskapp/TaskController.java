package taskapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createtask(@RequestParam(value = "create") String taskname) {
       taskService.addTask(taskname);
       return new ResponseEntity<>(taskService.addTask(taskname), HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity gettasks() {
        return new ResponseEntity<>(taskService.findAllTasks(), HttpStatus.OK);
    }

}