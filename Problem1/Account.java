public class Account {
    // Private fields to store the account's ID, name, and balance
    private String id;
    private String name;
    private int balance = 0; // Default balance is set to 0

    // Constructor to initialize the account with an ID and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor to initialize the account with an ID, name, and balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter method to retrieve the account ID
    public String getID() {
        return id;
    }

    // Getter method to retrieve the account holder's name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the current balance
    public int getBalance() {
        return balance;
    }

    // Method to add a specified amount to the balance
    public int credit(int amount) {
        balance += amount; // Increase the balance by the amount
        return balance; // Return the new balance
    }

    // Method to subtract a specified amount from the balance if sufficient funds are available
    public int debit(int amount) {
        if (amount <= balance) { // Check if the amount is less than or equal to the balance
            balance -= amount; // Subtract the amount from the balance
        } else {
            System.out.println("Amount exceeded balance"); // Print a message if funds are insufficient
        }
        return balance; // Return the current balance
    }

    // Method to transfer a specified amount to another account if sufficient funds are available
    public int transferTo(Account another, int amount) {
        if (amount <= balance) { // Check if the amount is less than or equal to the balance
            balance -= amount; // Subtract the amount from the balance
            another.credit(amount); // Add the amount to the other account's balance
        } else {
            System.out.println("Amount exceeded balance"); // Print a message if funds are insufficient
        }
        return balance; // Return the current balance
    }

    // Override the toString() method to provide a string representation of the account
    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}