package mx.edu.j2se.DeLaMora.tasks;

public abstract class AbstractTaskList {

    public abstract void add(Task task);

    public abstract boolean remove(Task task);

    public abstract int size();

    public abstract Task getTask(int index);

}
