package Bank;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountServiceTest {
    @Test
    public void testWithdraw_WithSufficientFunds_ShouldWithdrawSuccessfully() {
        BankAccount account = new BankAccount("123456789",new BigDecimal("1000.00"));
        BankAccountService service = new BankAccountService(account);

        BigDecimal result = service.withdraw(new BigDecimal("400.00"));
        assertEquals(new BigDecimal("600.00"), result);
    }

    @Test
    public void testWithdraw_WithInsufficientFunds_ShouldNotWithdraw() {
        BankAccount account = new BankAccount("123456789",new BigDecimal("300.00"));
        BankAccountService service = new BankAccountService(account);

        BigDecimal result = service.withdraw(new BigDecimal("500.00"));
        assertEquals(new BigDecimal("300.00"), result); //Съмата в акаунта няма да се промени, понеже няма нужния баланс
    }

    @Test
    public void testWithdraw_WithNegativeFunds_ShouldNotWithdraw() {
        BankAccount account = new BankAccount("123456789",new BigDecimal("500.00"));
        BankAccountService service = new BankAccountService(account);

        BigDecimal result = service.withdraw(new BigDecimal("-100.00"));
        assertEquals(new BigDecimal("500.00"), result); //Съмата в акаунта няма да се промени, понеже числото е отрицателно
    }

    @Test
    public void testAccumulateInterest_WithNegativeValue_ShouldNotAccumulateInterest() {
        BankAccount account = new BankAccount("123456789",new BigDecimal("500.00"));
        BankAccountService service = new BankAccountService(account);

        BigDecimal result = service.accumulateInterest(new BigDecimal("-5"));
        assertEquals(new BigDecimal("0"), result); //J = Тук се очаква нула понеже във
        // if клаузата ако числотот е < 0 и > 100 няма да влвзе в него, което дитно означава 0(false)
        assertEquals(new BigDecimal("500.00"), account.getBalance());//Балансът на акаунта няма да се промени понеже J

    }

    @Test
    public void testAccumulateInterest_WithValuesBetween100And0_ShouldAccumulateInterest() {
        BankAccount account = new BankAccount("123456789",new BigDecimal("500.00"));
        BankAccountService service = new BankAccountService(account);

        BigDecimal result = service.accumulateInterest(new BigDecimal("50"));
        assertEquals(new BigDecimal("250.00"), result); //За 50% от 500 това са 250
        assertEquals(new BigDecimal("750.00"), account.getBalance());//Към балансът се добавя сметната сума от лихвения коефициент

    }

    @Test
    public void testAccumulateInterest_WithValuesOver100_ShouldNotAccumulateInterest() {
        BankAccount account = new BankAccount("123456789",new BigDecimal("500.00"));
        BankAccountService service = new BankAccountService(account);

        BigDecimal result = service.accumulateInterest(new BigDecimal("150"));
        assertEquals(new BigDecimal("0"), result); //J = Тук се очаква нула понеже във
        // if клаузата ако числотот е < 0 и > 100 няма да влвзе в него, което дитно означава 0(false)
        assertEquals(new BigDecimal("500.00"), account.getBalance());//Балансът на акаунта няма да се промени понеже J

    }
}

