package com.example.dfreeman.todolist;

import java.util.Date;

/**
 * Created by dfreeman
 */

public class toDoItem {
    private String name;
    private Date startDate;
    private Date completionDate;
    private int[] time = new int[2];
    private boolean complete;
    private Reminder reminder;

    //Constructor - No reminder
    public toDoItem(String name, Date startDate, Date completionDate, int[] time, boolean complete) {
        this.name = name;
        this.startDate = startDate;
        this.completionDate = completionDate;
        this.time = time;
        this.complete = complete;
    }

    //Constructor with Reminder
    public toDoItem(String name, Date startDate, Date completionDate, int[] time, boolean complete, Reminder reminder) {
        this.name = name;
        this.startDate = startDate;
        this.completionDate = completionDate;
        this.time = time;
        this.complete = complete;
        this.reminder = reminder;
    }

    //Getters
    public String getName() {
        return name;
    }
    public Date getStartDate() {
        return startDate;
    }
    public Date getCompletionDate() {
        return completionDate;
    }
    public int[] getTime() {
        return time;
    }
    public boolean isComplete() {
        return complete;
    }
    public Reminder getReminder() {
        return reminder;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }
    public void setTime(int[] time) {
        this.time = time;
    }
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }
}