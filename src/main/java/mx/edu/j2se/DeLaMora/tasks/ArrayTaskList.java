package mx.edu.j2se.DeLaMora.tasks;

 import java.util.*;
 import java.util.stream.Stream;

public class ArrayTaskList extends AbstractTaskList{

    public int index = 0;

    Task[] arrayList = new Task[0];
    final int N = arrayList.length;

    // METHOD FOR ADDING A NEW TASK

    public void add(Task task) {
        index++;
        arrayList = Arrays.copyOf(arrayList, (index+ 1));
        arrayList[N-1] = task;

    }


    // METHOD FOR REMOVING TASKS THAT ARE DUPLICATES

    public boolean remove(Task task) {

        int noUnique = arrayList.length;
        for (int i = 0; i < noUnique; i++) {
            for (int j = i + 1; j < noUnique; j++) {
                if (arrayList[i] == arrayList[j]) {
                    arrayList[j] = arrayList[noUnique - 1];
                    noUnique--;
                    j--;

                }
            }
            Task[] array1 = Arrays.copyOf(arrayList, noUnique);

            if(noUnique>index){
                return true;
        }


        }
    return false;
    }


    public int size() {
        return arrayList.length;
    }

    public Task getTask(int index) {
     try {
         if (index < 0 || index > this.index) {
             throw new IndexOutOfBoundsException(" ERROR!!! ");
         }
     }
     catch (IndexOutOfBoundsException d){
        }
            return arrayList[index];

    }

    public ArrayTaskList incoming(int from, int to){

        ArrayTaskList Come = new ArrayTaskList();

        return Come;
    }

    public int getIndex(Task task){
        int temp = 0;
        for
    }

    @Override
    public Stream<Task> getStream(){
        return null;
    }

    public ArrayTaskList cloneArrayTaskList(){
        ArrayTaskList tempArrayTaskList = this;
        return  tempArrayTaskList;
    }



}



