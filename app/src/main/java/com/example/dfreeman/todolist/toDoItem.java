package com.example.dfreeman.todolist;

import java.util.Calendar;

/**
 * Created by dfreeman
 */

public class toDoItem {
    private String name;
    private Calendar completionCalendar;
    private Calendar startCalendar;
    private boolean complete;
    private Reminder reminder;

    //Constructor
    public toDoItem(String name, Calendar completionCalendar, Calendar startCalendar, boolean complete) {
        this.name = name;
        this.completionCalendar = completionCalendar;
        this.startCalendar = startCalendar;
        this.complete = complete;
    }

    //Constructor without end date
    public toDoItem(String name, Calendar startCalendar, boolean complete) {
        this.name = name;
        this.startCalendar = startCalendar;
        this.complete = complete;
    }

    //Getters
    public String getName() {
        return name;
    }
    public Calendar getCompletionCalendar() {
        return completionCalendar;
    }
    public Calendar getStartCalendar() {
        return startCalendar;
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
    public void setCompletionCalendar(Calendar completionCalendar) {
        this.completionCalendar = completionCalendar;
    }
    public void setStartCalendar(Calendar startCalendar) {
        this.startCalendar = startCalendar;
    }
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }
}