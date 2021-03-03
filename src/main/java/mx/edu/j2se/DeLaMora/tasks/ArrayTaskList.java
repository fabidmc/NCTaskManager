package mx.edu.j2se.DeLaMora.tasks;

public class ArrayTaskList {

    Task[] arrayList = new Task[0];
    int index = 0;
    int i;


    //Method for adding a task
    public void add(Task task) {
        index++;
        Task[] arrayList2 = new Task[1];

        arrayList[index] = task;

        System.out.println("Task added successfully!");

    }

}

  /*  public boolean remove(Task task) {
        for (int i = 0; i <= arrayList.length; i++) {
            if (task == arrayList[i]) {
                System.out.println("Nothing to remove, tasks list is empty");
                return false;
            } else {
                System.out.println("Enter index of task to remove");
                return true;
            }
        }
    }
}


            // public int size(){
            //           return arrayList.length;
            //     }

            //public Task getTask(int index) {
            //  if (index < 0 || index > this.index) {
            //     throw new IndexOutOfBoundsException(" ERROR!!! ");
            //} else return arrayList[index];

            //}
//}
            //  }
        */