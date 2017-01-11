package com.example.dfreeman.todolist;

import java.util.Calendar;

/**
 * Created by dfreeman
 */

public class Reminder {
    private Calendar calender;

    public Reminder(Calendar calender) {
        this.calender = calender;
    }

    public Calendar getCalender() {
        return calender;
    }

    public void setCalender(Calendar calender) {
        this.calender = calender;
    }
}
