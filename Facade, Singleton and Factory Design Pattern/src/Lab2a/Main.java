package Lab2a;

public class Main {
    public static void main(String[] args) {
        System.out.println("Customer deposit 20$:");
        System.out.println(TransactionFacade.Credit(20));
        System.out.println("Customer taking out 154$: ");
        System.out.println(TransactionFacade.Debit(154));
    }
}
