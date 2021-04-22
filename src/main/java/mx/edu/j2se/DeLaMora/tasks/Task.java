package mx.edu.j2se.DeLaMora.tasks;

 import java.time.LocalDateTime;
 import java.io.Serializable;

public class Task implements Serializable {

    // VARIABLES AND THE TYPE

    private String title;
    private LocalDateTime time;
    private LocalDateTime startTime, endTime, interval;

    private boolean active, repeated;


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

        if (startTime.equals(0) || endTime.equals(0) || interval.equals(0)) {
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

    public void setTitle(String title) {

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

        if (time.equals(null)) {
            throw new IllegalArgumentException();
        }
        if (!repeated) {
            this.startTime = null;
            this.endTime = null;
            this.interval = null;
        }
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
        return repeated;
    }


    public void nextTimeAfter(LocalDateTime current) {
        if (current.equals(null)) throw new IllegalArgumentException(" No negative numbers ");
        if (isActive() && isRepeated()) {


        }
    }

    }




