
package javaapplication3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("There are 5 Islamic Prayers:");
        System.out.println("Fajr at 06:20AM\nZuhr at 1:09PM\nAsr at 4:10PM");
        System.out.println("Maghrib at 6:37PM\nIsha at 7:53 PM");
        System.out.println("Enter the hours, minutes, and seconds of time "
                + "you want to begin from\n(Make sure it is in military time as such"
                + " 2:05PM is 14:05:00)");
        
        System.out.println("Hour: ");
        int hour = Integer.parseInt(reader.nextLine());
        System.out.println("Minute: ");
        int minute = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int second = Integer.parseInt(reader.nextLine());

        PrayerClock clock = new PrayerClock(hour, minute, second);
        
        //Digital PrayerClock begins
        clock.tick();
    }
    
}
    
