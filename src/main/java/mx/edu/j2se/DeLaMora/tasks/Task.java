package mx.edu.j2se.DeLaMora.tasks;

public class Task {

    // VARIABLES AND THE TYPE
    String title;
    int time, startTime, endTime, interval, current;
    boolean active, repeated;

    // Constructor for non-repetitive task
    public Task(String title, int time) {
        this.title = title;
        this.time = time;
    }

    // Constructor for a  repetitive task
    public Task(String title, int startTime, int endTime, int interval) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.interval = interval;
    }


    // METHODS

    // Method for reading and setting the task name
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    //Method for reading and setting the task status
    public boolean isActive(){
        return active;
    }

    public void setActive(boolean active){

        this.active = active;
    }


    //METHODS FOR NON-REPETITIVE TASKS

    //Method for changing execution time for non-repetitive tasks
    public int getTime() {
        if (this.interval == 0) {
            return time;
        }
        return startTime;
    }

    public void setTime(int time) {
        if(this.interval != 0){
            this.startTime = 0;
            this.endTime = 0;
            this.interval = 0;
        }
        this.time = time;
    }

    // METHODS FOR REPETITIVE TASKS
    //Method for reading and changing execution time for repetitive tasks
    public int getStartTime() {
        if(this.interval != 0){
            return startTime;
        }
        return time;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }


    public int getEndTime() {
        if(this.interval != 0){
            return endTime;
        }

        return time;
    }

    public void setEndTime(int endTime) {

        this.endTime = endTime;
    }

    public int getRepeatInterval(){
    if (this.interval != 0) {
            return interval;
        } else {
            return 0;
        }
    }

    public void setTime(int startTime, int endTime, int interval) {

        if (this.interval == 0) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.interval = interval;
        }

    }

    public boolean isRepeated(){
        if(this.interval != 0) {
            return true;
        }else{
                return false;
            }
            }


    public int nextTimeAfter(int current) {
        if (endTime-current != 0) {
            return startTime;
        } else {
            return -1;
        }
    }
}