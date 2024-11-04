import org.example.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    public void testInitialBalance() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.withdraw(200.0);
        assertEquals(800.0, account.getBalance());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.withdraw(1500.0);
        assertEquals(1000.0, account.getBalance()); // El saldo no debería cambiar
    }

    @Test
    public void testBalanceAfterOperations() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        assertEquals(1300.0, account.getBalance());
    }
}
