package Problem3;

public class Time {
    // Private fields to store the hour, minute, and second
    private int hour;
    private int minute;
    private int second;

    // Constructor to initialize the Time object with hour, minute, and second
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getter method to retrieve the hour
    public int getHour() {
        return hour;
    }

    // Getter method to retrieve the minute
    public int getMinute() {
        return minute;
    }

    // Getter method to retrieve the second
    public int getSecond() {
        return second;
    }

    // Setter method to set the hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // Setter method to set the minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Setter method to set the second
    public void setSecond(int second) {
        this.second = second;
    }

    // Method to set the hour, minute, and second
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Override the toString() method to provide a string representation of the time
    @Override
    public String toString() {
        // Format the hour, minute, and second with leading zeros if necessary
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Method to advance the time by one second
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Method to go back one second
    public Time previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}