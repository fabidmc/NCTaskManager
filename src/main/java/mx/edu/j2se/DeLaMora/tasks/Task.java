package mx.edu.j2se.DeLaMora.tasks;

public class Task {

    // VARIABLES AND THE TYPE
    String title;
    int time, startTime, endTime, interval, current;
    boolean active, repeated = true;


    // Constructor for non-repeative task
    public Task(String title, int time) {
        this.title = title;
        this.time = time;
    }

    // Constructor for a  repeatitive task
    public Task(String title, int startTime, int endTime, int interval) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.interval = interval;
    }

    /** return string
     *
     */

    // METHODS
    // Method for reading and setting the task name
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isActive(){
        boolean active = this.active;
        return active;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public int getTime() {
        if (repeated == true) {
            return time;
        }
        return 0;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getStartTime() {
        if(repeated == false){
            return startTime;
        }
        return 0;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public boolean isRepeated() {
        return repeated;
    }

        


}
