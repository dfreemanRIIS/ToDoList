package com.example.dfreeman.todolist;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * Created by dfreeman
 */

public class toDoItem {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
    private String name;
    private Calendar completionCalendar;
    private Calendar startCalendar;
    private boolean complete;
    private Reminder reminder;

    private static Calendar testCal1 = new GregorianCalendar(2017, 1, 10, 12, 12, 12);
    private static Calendar testCal2 = new GregorianCalendar(2017, 1, 11, 13, 12, 12);
    private static Calendar testCal3 = new GregorianCalendar(2017, 1, 12, 14, 12, 12);

    public static final toDoItem[] testToDo = {
            new toDoItem("To Do Test One", testCal1, false),
            new toDoItem("To Do Test Two", testCal3, testCal2, false),
    };

    //Constructor
    private toDoItem(String name, Calendar completionCalendar, Calendar startCalendar, boolean complete) {
        this.name = name;
        this.completionCalendar = completionCalendar;
        this.startCalendar = startCalendar;
        this.complete = complete;
    }

    //Constructor without end date
    private toDoItem(String name, Calendar startCalendar, boolean complete) {
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

    //toString
    public String toString() {
        if (completionCalendar != null) {
            return this.name + "  DUE BY:  " + sdf.format(completionCalendar.getTime());
        } else {
            return this.name;
        }
    }
}