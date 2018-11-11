package taskapp;

import java.util.concurrent.atomic.AtomicInteger;

public class Task {

    /**The Task Class has these fields */
    private static AtomicInteger uniqueId = new AtomicInteger();
    private String taskName;
    public int taskId;


    /**This is the constructor of the Task Class */
    public Task(String name) {
        taskId=uniqueId.getAndIncrement();
        taskName = name;
    }

    /**This overrides the default toString method, to return the ID and name of a task, instead of the default Object and hashcode */
    @Override
    public String toString() {
        return "Task ID: " + this.taskId + " Task name:" + this.taskName;
    }
}



