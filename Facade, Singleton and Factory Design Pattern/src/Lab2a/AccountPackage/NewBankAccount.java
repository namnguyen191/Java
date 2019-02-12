package Lab2a.AccountPackage;

public class NewBankAccount implements IBankAccount {
    private Account acc;

    public NewBankAccount(int i){
        this.acc = new Account(i);
    }

    @Override
    public void debit(int i) {
        acc.withdraw(i);
    }

    @Override
    public void credit(int i) {
        acc.deposit(i);
    }

    @Override
    public int balance() {
        return acc.getBalance();
    }
}
