package mx.edu.j2se.DeLaMora.tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {

    // VARIABLES AND THE TYPE
    String title;
//    LocalDateTime time = LocalDateTime.of();

    int time, startTime, endTime, interval, current;
    boolean active, repeated;


    // Constructor for non-repetitive task
    public Task(String title, int time) throws Exception {
        try {
            if (time < 0) {
                throw new IllegalArgumentException(" ERROR!!!! ");
            } else {
                this.title = title;
                this.time = time;
            }
        } catch (IllegalArgumentException e) {

        }


        // Constructor for a  repetitive task
    public Task(String title, int startTime, int endTime, int interval) throws Exception {
            try {
                if (startTime < 0 || endTime < 0 || interval < 0) {
                    throw new IllegalArgumentException(" ERROR!!!! ");
                } else {
                    this.title = title;
                    this.startTime = startTime;
                    this.endTime = endTime;
                    this.interval = interval;
                }
            } catch (IllegalArgumentException d) {
            }


        }
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

        return active;
    }

    public void setActive(boolean active) {

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

    public void setTime(int time) throws Exception {
        try {
            if (this.interval != 0) {
                this.startTime = 0;
                this.endTime = 0;
                this.interval = 0;
            } else (time <= 0) {
                throw new IllegalArgumentException();
            }
            this.time = time;
        } catch (IllegalArgumentException d) {

        }
    }

    // METHODS FOR REPETITIVE TASKS
    //Method for reading and changing execution time for repetitive tasks
    public int getStartTime() {
        if (this.interval != 0) {
            return startTime;
        }
        return time;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }


    public int getEndTime() {
        if (this.interval != 0) {
            return endTime;
        }

        return time;
    }

    public void setEndTime(int endTime) {

        this.endTime = endTime;
    }

    public int getRepeatInterval() {
        if (this.interval != 0) {
            return interval;
        } else {
            return 0;
        }
    }

    public void setTime(int startTime, int endTime, int interval) throws Exception {
        try {
            if (startTime < 0 || endTime < 0) {
                throw new IllegalArgumentException();

            } else if (this.interval == 0) {
                throw new IllegalStateException();
            } else {
                this.startTime = startTime;
                this.endTime = endTime;
                this.interval = interval;
                this.time = 0;
            }

        } catch (IllegalArgumentException d) {

        }
    }


    public boolean isRepeated() {
        if (this.interval != 0) {
            return true;
        } else {
            return false;
        }
    }


    public int nextTimeAfter(int current) {
        if (current < 0) throw new IllegalArgumentException(" No negative numbers ");
        if (isActive()) {

            return this.time > current ? this.time : -1;
        }
    }

    }

    @Override
    public String toString(){
    String Task = "'" + title + "'";
    if(isRepeated())
        task += "" ;
    }

    public boolean equals (Object obj){
    if(obj == null || !(obj instanceof  Task)){
        return false;
    }
    return true;
    }

    public int hashCode(){
    int hash = 1;

    }

    public Task cloneTask(){
    Task task = this;
    return  task;
    }