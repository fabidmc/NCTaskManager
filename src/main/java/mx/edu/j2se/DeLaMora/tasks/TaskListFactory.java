package mx.edu.j2se.DeLaMora.tasks;

public abstract class TaskListFactory extends AbstractTaskList{

    public static AbstractTaskList createTaskList(ListTypes.types type){

        if (type == ListTypes.types.ARRAY){
            return new ArrayTaskList();}
        else if (type == ListTypes.types.LINKED){
            return new LinkedTaskList();
        }
        return null;
    }
}



