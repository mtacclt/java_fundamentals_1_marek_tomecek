/*
Create a class Account with the attributes accountNo – int, accountType – String,

accountBalance – int and methods setAccountDetails() which set the values to these

attributes, withdraw() which subtracts the given amount from the available balance,

deposit() which adds given amount to the available balance and dispAccountDetails()

which displays accountNo, accountType, accountBalance. Create a class Main1 which

contains main() method to test the functionality of Account class.
 */

public class Account {
    private int accountNo;
    private int accountBalance;
    private String accountType;

    public Account(int accountNo,int accountBalance,String accountType){
        this.accountNo=accountNo;
        this.accountBalance=accountBalance;
        this.accountType=accountType;
    }

    public void setAccountDetails(int accountNo,int accountBalance,String accountType){
        this.accountNo=accountNo;
        this.accountBalance=accountBalance;
        this.accountType=accountType;
    }

    public void withdraw(int amount){
        accountBalance = accountBalance - amount;
    }

    public void deposit(int amount){
        accountBalance = accountBalance + amount;
    }

    public void dispAccountDetails(){
        System.out.println("Account type is: "+accountType);
        System.out.println("Account number is: "+accountNo);
        System.out.println("Account balance is: "+accountBalance);
    }
}
