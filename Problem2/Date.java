package Problem2;
public class Date {
    // Private fields to store the day, month, and year
    private int day;
    private int month;
    private int year;

    // Constructor to initialize the Date object with day, month, and year
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter method to retrieve the day
    public int getDay() {
        return day;
    }

    // Getter method to retrieve the month
    public int getMonth() {
        return month;
    }

    // Getter method to retrieve the year
    public int getYear() {
        return year;
    }

    // Setter method to set the day
    public void setDay(int day) {
        this.day = day;
    }

    // Setter method to set the month
    public void setMonth(int month) {
        this.month = month;
    }

    // Setter method to set the year
    public void setYear(int year) {
        this.year = year;
    }

    // Method to set the day, month, and year
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Override the toString() method to provide a string representation of the date
    @Override
    public String toString() {
        // Format the day and month with leading zeros if necessary
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}