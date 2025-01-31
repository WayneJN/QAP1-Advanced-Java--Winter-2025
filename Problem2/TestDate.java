package Problem2;
public class TestDate {
    public static void main(String[] args) {
        // Create a Date object using the constructor
        Date date = new Date(29, 1, 2025);

        // Print the date using the toString() method
        System.out.println("Date: " + date.toString());

        // Modify the date using setter methods
        date.setDay(30);
        date.setMonth(12);
        date.setYear(2024);

        // Print the modified date using the toString() method
        System.out.println("Modified Date: " + date.toString());

        // Modify the date using the setDate() method
        date.setDate(1, 1, 2023);

        // Print the modified date using the toString() method
        System.out.println("Modified Date using setDate: " + date.toString());
    }
}