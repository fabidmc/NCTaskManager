package mx.edu.j2se.DeLaMora.tasks;

import java.util.stream.Stream;

public abstract class AbstractTaskList implements Iterable<Task>{

    public abstract void add(Task task);

    public abstract boolean remove(Task task);

    public abstract int size();

    public abstract Task getTask(int index);

    public abstract AbstractTaskList incoming(int from,int to);

    public abstract Stream<Task> getStream();

   // public abstract incoming(int from, int to);

}
