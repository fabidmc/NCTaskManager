package mx.edu.j2se.DeLaMora.tasks;

 import java.time.LocalDateTime;
 import java.io.Serializable;

public class Task implements Serializable {

    // VARIABLES AND THE TYPE

    public String title;
    public LocalDateTime time;
    public LocalDateTime startTime, endTime, interval;

    public boolean active, repeated;


    // Constructor for non-repetitive task
    public Task(String title, LocalDateTime time) throws IllegalArgumentException {
        if (time.equals(null)) {
            throw new IllegalArgumentException(" ERROR!!!! ");
        }
        this.title = title;
        this.time = time;
    }


    // Constructor for a  repetitive task
    public Task(String title, LocalDateTime startTime, LocalDateTime endTime, LocalDateTime interval) throws IllegalArgumentException {

        if (startTime.equals(0) || endTime.isBefore(startTime) || interval.equals(null)) {
            throw new IllegalArgumentException(" ERROR!!!! ");
        }
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

    public void setTitle(String title) throws IllegalStateException {

        if (title.equals("")) {
            throw new IllegalStateException("This is not a correct string");
        }

        this.title = title;
    }

    //Method for reading and setting the task status
    public boolean isActive() {

        return this.active;
    }

    public void setActive(boolean active) {

        this.active = active;
    }


    //METHODS FOR NON-REPETITIVE TASKS

    //Method for changing execution time for non-repetitive tasks
    public LocalDateTime getTime() {
        return (repeated ? startTime : time);
    }


    public void setTime(LocalDateTime time) throws IllegalArgumentException {

        if (time.equals(null) || time.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException();
        }
        if (this.repeated) {
            this.startTime = null;
            this.endTime = null;
            this.interval = null;
        }
        this.time = time;
    }


    // METHODS FOR REPETITIVE TASKS
    //Method for reading and changing execution time for repetitive tasks
    public LocalDateTime getStartTime() {
        return (repeated ? startTime : time);
    }

    public LocalDateTime getEndTime() {
        return (repeated ? endTime : time);
    }


    public LocalDateTime getRepeatInterval() {
        return (repeated ? interval : null);
    }

    public void setTime(LocalDateTime startTime, LocalDateTime endTime, LocalDateTime interval) throws IllegalArgumentException {

        if (startTime.equals(null) || endTime.isBefore(startTime) || interval.equals(null)) {
            throw new IllegalArgumentException("Something is bad");

        }
        this.startTime = startTime;
        this.endTime = endTime;
        this.interval = interval;

    }

    public boolean isRepeated() {
        return this.repeated;
    }



    @Override
    public int hashCode() {

        if (isRepeated()) {
            return startTime.hashCode() * endTime.hashCode() * interval.hashCode() * title.hashCode();
        }

        return time.hashCode() * title.hashCode();

    }
        @Override
        public String toString() {
            if(!isRepeated()){
                 return "Task {title=" + title + ", time=" + time
                    + ", active=" + active + ", repeat=" + repeated + "}";
        }
            else{
                 return "Task {title=" + title + ", time=" + startTime
                + ", endTime=" + endTime + ", interval=" + interval
                + ", active= " + active + ", repeat= " + repeated + "}";

    }
    }





    @Override
    public Task clone(){
        return this;
    }
}


