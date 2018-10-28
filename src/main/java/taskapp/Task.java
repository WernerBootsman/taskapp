package taskapp;

public class Task {

    //The Task Class has these fields
    public String taskName;

    //This is the constructor of the Task Class
    public Task(String name) {
        taskName = name;
    }

    public String toString(){
        return "Task name:" + taskName;
    }
}


