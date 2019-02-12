package Lab2a.AccountPackage;

public class Account {
    private int balance;

    public Account(int i){
        this.balance = i;
    }

    public int getBalance(){
        return this.balance;
    }

    public void deposit(int i){
        this.balance += i;
    }

    public void withdraw(int i){
        this.balance -= i;
    }
}
