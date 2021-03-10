package mx.edu.j2se.DeLaMora.tasks;

import java.util.LinkedList;

public class LinkedTaskList {

    LinkedList<Task> newarr = new LinkedList<Task>();

    //METHOD FOR ADDING TASKS;
    int index = 0;

    public void add(Task task){
        newarr.add(index,task);

    }

   // METHOD FOR REMOVING DUPLICATE TASKS
    public boolean remove(Task task){
        return newarr.remove(task);
    }

    // METHOD FOR SIZE OF LINKEDLIST
    public int size(){
       return newarr.size();
    }

    //METHOD FOR GETTING TASK

}
