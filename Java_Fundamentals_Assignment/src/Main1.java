public class Main1 {
    public static void main(String[] args) {
        Account acc = new Account(12345, 0, "Basic");
        acc.dispAccountDetails();
        System.out.println("Depositing 1000" + "\n");
        acc.deposit(1000);
        acc.dispAccountDetails();
        System.out.println("Withdrawing 2000" + "\n");
        acc.withdraw(2000);
        acc.dispAccountDetails();
        System.out.println("changing details" + "\n");
        acc.setAccountDetails(54321, 10000, "Premium");
        acc.dispAccountDetails();
    }
}
