package Lab2a;

import Lab2a.AccountPackage.NewBankAccount;
import Lab2a.AtmPackage.AtmAds;
import Lab2a.AtmPackage.AtmStatus;
import Lab2a.AtmPackage.AtmUserLog;

public class TransactionFacade {
    private static NewBankAccount acc = new NewBankAccount(100);
    private static AtmAds atmAds = new AtmAds();
    private static AtmStatus atmStatus = new AtmStatus();
    private  static AtmUserLog atmUserLog = new AtmUserLog();

    public static int Debit(int i){
        atmAds.showAds();
        acc.debit(i);
        atmUserLog.saveUserLog();
        atmStatus.saveAtmStatus();
        return acc.balance();
    }

    public static int Credit(int i){
        atmAds.showAds();
        acc.credit(i);
        atmUserLog.saveUserLog();
        atmStatus.saveAtmStatus();
        return acc.balance();
    }

}
