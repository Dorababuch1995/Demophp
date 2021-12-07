package Utilites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDate {

    public  String currentDate(){
        SimpleDateFormat sim = new SimpleDateFormat();
        Date d = new Date();
            String currentdate = sim.format(d);
            return currentdate;
    }

    public  String currentTime(){
        SimpleDateFormat sim = new SimpleDateFormat();
        Date d = new Date();
        String currenttime = sim.format(d.getTime());

        return currenttime;

    }
}
