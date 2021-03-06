package com.example.dfreeman.todolist;

import android.support.annotation.NonNull;
import android.widget.TimePicker;
import android.app.TimePickerDialog;
import android.support.v4.app.DialogFragment;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Calendar;
import android.text.format.DateFormat;

/**
 * Created by dfreeman
 */

public class TimePickerFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    @Override @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current time as the default values for the picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // Do something with the time chosen by the user
    }
}
