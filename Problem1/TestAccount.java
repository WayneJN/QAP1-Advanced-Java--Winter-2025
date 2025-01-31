public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts using the parameterized constructors
        Account acc1 = new Account("A001", "John Doe", 5000); // Account 1 with a balance of $5000
        Account acc2 = new Account("A002", "Jane Smith", 4000); // Account 2 with a balance of $4000

        // Display the balance of both accounts using the getBalance() method
        System.out.println("Balance of Acc1: " + acc1.getBalance()); // Print balance of Account 1
        System.out.println("Balance of Acc2: " + acc2.getBalance()); // Print balance of Account 2

        // Transfer $1000 from Account 1 to Account 2
        acc1.transferTo(acc2, 1000); // Transfer amount and update balances

        // Display the balance of both accounts again using the getBalance() method
        System.out.println("Balance of Acc1 after transfer: " + acc1.getBalance()); // Print updated balance of Account 1
        System.out.println("Balance of Acc2 after transfer: " + acc2.getBalance()); // Print updated balance of Account 2
    }
}