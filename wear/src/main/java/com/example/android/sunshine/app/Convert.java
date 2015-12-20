package com.example.android.sunshine.app;

/**
 * Created by Menno on 20-12-2015.
 */
public class Convert {

    public static String getShortWeekName(int weeknr)
    {
        switch(weeknr)
        {
            case 1:
                return "Mon";
            case 2:
                return "Tue";
            case 3:
                return "Wed";
            case 4:
                return "Thu";
            case 5:
                return "Fri";
            case 6:
                return "Sat";
            case 0:
                return "Sun";
            default:
                return "Ukn";
        }
    }

    public static String getShortMonthName(int monthnr)
    {
        switch(monthnr)
        {
            case 0:
                return "Jan";
            case 1:
                return "Feb";
            case 2:
                return "Mar";
            case 3:
                return "Apr";
            case 4:
                return "May";
            case 5:
                return "Jun";
            case 6:
                return "Jul";
            case 7:
                return "Aug";
            case 8:
                return "Sep";
            case 9:
                return "Oct";
            case 10:
                return "Nov";
            case 11:
                return "Dec";
            default:
                return "Ukn";
        }
    }
}
