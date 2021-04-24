package mx.edu.j2se.DeLaMora.tasks;

 import java.util.*;
 import java.util.stream.Stream;
 import java.util.Iterator;

public class ArrayTaskList extends AbstractTaskList {

    private int index = 0;

    Task[] arrayList = new Task[index];
    final int N = arrayList.length;

    // METHOD FOR ADDING A NEW TASK
    // Se crea una copia temporal para ir agregando los nuevos tasks al arreglo

    public void add(Task task)  {

        index++;
        Task[] newarr = new Task[index];
        System.arraycopy(arrayList, 0, newarr, 0, arrayList.length);
        arrayList = newarr;
        arrayList[N - 1] = task;

    }


    // METHOD FOR REMOVING TASKS THAT ARE DUPLICATES
    // Metodo para reemover tasks del arreglo asi como los duplicados

    public boolean remove(Task task) {

        if (task == null) {
            System.out.println("No removal operation can be performed!!");
        }

        Task[] tempArray = new Task[arrayList.length - 1];
        System.arraycopy(arrayList, 0, tempArray, 0, index);

        for (int i = 0; i < arrayList.length - 1; i++) {
            if (task == arrayList[i]) {
                index--;
                tempArray = new Task[index];


            }
        }
        return false;
    }


        public int size(){
            return arrayList.length;
        }



        public Task getTask ( int index){
            try {
                if (index < 0 || index > this.index) {
                    throw new IndexOutOfBoundsException(" ERROR!!! ");
                }
            } catch (IndexOutOfBoundsException d) {
            }
            return arrayList[index];

        }




    @Override
    public Stream<Task> getStream() {
        return null;
    }
}









