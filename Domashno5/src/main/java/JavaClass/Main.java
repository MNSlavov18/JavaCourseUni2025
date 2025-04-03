package JavaClass;

import Bank.BankAccount;
import Bank.BankAccountService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789",new BigDecimal("500.00"));
        account.setBalance(new BigDecimal("500.00"));
        BankAccountService service = new BankAccountService(account);
        service.accumulateInterest(new BigDecimal("5"));
        System.out.println(account.getBalance());
    }
}