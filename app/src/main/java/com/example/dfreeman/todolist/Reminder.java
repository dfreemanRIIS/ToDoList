package com.example.dfreeman.todolist;

import java.util.Date;

/**
 * Created by dfreeman
 */

public class Reminder {
    private Date reminderDate;
    private int[] reminderTime = new int[2];

    public Reminder(Date reminderDate, int[] reminderTime) {
        this.reminderDate = reminderDate;
        this.reminderTime = reminderTime;
    }

    //Getters
    public int[] getReminderTime() {
        return reminderTime;
    }
    public Date getReminderDate() {
        return reminderDate;
    }

    //Setters
    public void setReminderTime(int[] reminderTime) {
        this.reminderTime = reminderTime;
    }
    public void setReminderDate(Date reminderDate) {
        this.reminderDate = reminderDate;
    }
}
