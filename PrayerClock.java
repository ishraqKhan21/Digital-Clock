/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;

/**
 *
 * @author khani
 */
public class PrayerClock {
    
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
    
    public PrayerClock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created 
        // and set to have the correct initial values
        hours = new BoundedCounter(23);
        minutes = new BoundedCounter(59);
        seconds = new BoundedCounter(59);
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() throws InterruptedException {     
        // PrayerClock advances by one second
        while (true) {
           System.out.println(hours + ":" + minutes + ":" + seconds);
           Thread.sleep(1000);
           if (toString().equals("06:20:00")) {
               System.out.println("6:20AM! It is Fajr time, go to the mosque!");
               Thread.sleep(3000);
           } else if (toString().equals("13:09:00")) {
               System.out.println("1:09PM! It is Zuhr time, go to the mosque");
           } else if (toString().equals("16:10:00")) {
               System.out.println("4:10PM! It is Asr time, go to the mosque!");
           } else if (toString().equals("18:37:00")) {
               System.out.println("6:37PM! It is Maghrib time, go to the mosque!");
           } else if (toString().equals("19:53:00")) {
               System.out.println("7:53PM! It is Isha time, go to the mosque!");
           }
           seconds.next();
           
            if (seconds.getValue() == 0) {
                minutes.next();    
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
        }
    }
   
    public String toString() {
        // returns the string representation
        return hours + ":" + minutes + ":" + seconds;
    }
}

    

