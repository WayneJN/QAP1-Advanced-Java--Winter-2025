package Problem3;
public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Display the times before they are changed
        System.out.println("Initial Time t1: " + t1.toString());
        System.out.println("Initial Time t2: " + t2.toString());

        // Call nextSecond() for t1 and previousSecond() for t2
        t1.nextSecond();
        t2.previousSecond();

        // Display the final times
        System.out.println("Final Time t1: " + t1.toString());
        System.out.println("Final Time t2: " + t2.toString());
    }
}