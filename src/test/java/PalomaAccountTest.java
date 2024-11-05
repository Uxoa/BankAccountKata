import org.example.PalomaAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalomaAccountTest {

    void TestCreateAccountWithoutInitialAmount() {
        // Arrange --> No previous scenario
        // Act
        PalomaAccount account = new PalomaAccount();
        // Assert
        double balance = account.getBalance();
        assertEquals(0, balance);
    }

    @Test
    @DisplayName("test_IfTheAccountHasAUniqueAccountNumberAndHasBalance")
    void test_IfTheAccountHasAUniqueAccountNumberAndHasBalance(){

        //GIVEN:inicializo un nuevo objeto palomaAccount con dos atributos
        PalomaAccount palomaAccount = new PalomaAccount("12345", 1000.0);

        //WHEN: Uso los métodos getAccountId() y getBalance() de PalomaAccount para obtener el número de cuenta y el saldo
        String accountId = palomaAccount.getAccountId();
        Double balance = palomaAccount.getBalance();

        //THEN: con assertEquals() verifico que los valores devueltos por getAccountId y getBalance son correctos
        assertEquals("12345", accountId, "El número de cuenta es '12345'");
        assertEquals(1000.0, balance, "El saldo es 1000.0");

    }

    @Test
    @DisplayName("test_IfUserCanAddPositiveQuantityInTheAccount")
    void test_IfUserCanAddPositiveAmountInAccount(){

        //GIVEN: inicializo un nuevo objeto palomaAccount con sus parametros
        PalomaAccount palomaAccount = new PalomaAccount("12345", 1000.0);

        // WHEN: agrego 500 al saldo
        Double updatedBalance = palomaAccount.addQuantity(500.0);

        // THEN: verifico que el saldo actualizado sea correcto
        assertEquals(1500.0, updatedBalance, "El saldo debería ser 1500.0 después del depósito de 500");
    }

    @Test
    @DisplayName("test_IfUserCanWithdrawPositiveQuantityFromAccount")
    void test_IfUserCanWithdrawPositiveQuantityFromAccount(){
        // GIVEN: inicializo una cuenta con saldo inicial
        PalomaAccount palomaAccount = new PalomaAccount("12345", 1000.0);

        // WHEN: retiro 300 del saldo
        Double updatedBalance = palomaAccount.withdrawQuantity(300.0);

        // THEN: verifico que el saldo se haya actualizado correctamente
        assertEquals(700.0, updatedBalance, "El saldo debería ser 700.0 después de retirar 300");
    }

    @Test
    @DisplayName("test_IfWithdrawalFailsWhenInsufficientFunds")
    void test_IfWithdrawalFailsWhenInsufficientFunds(){
        // GIVEN: inicializo una cuenta con saldo inicial
        PalomaAccount palomaAccount = new PalomaAccount("12345", 1000.0);

        // WHEN y THEN: intento retirar 1500 y verifico la excepción
        try {
            palomaAccount.withdrawQuantity(1500.0);
        } catch (IllegalArgumentException e) {
            assertEquals("Fondos insuficientes para la retirada", e.getMessage());
            return;
        }
        fail("Se esperaba una excepción por fondos insuficientes");
    }

    @Test
    @DisplayName("test_DepositFailsWithNegativeAmount")
    void test_DepositFailsWithNegativeAmount(){
        // GIVEN: inicializo una cuenta con saldo inicial
        PalomaAccount palomaAccount = new PalomaAccount("12345", 1000.0);

        // WHEN y THEN: intento depositar una cantidad negativa y verifico la excepción
        try {
            palomaAccount.addQuantity(-500.0);
        } catch (IllegalArgumentException e) {
            assertEquals("La cantidad debe ser positiva", e.getMessage());
            return;
        }
        fail("Se esperaba una excepción por cantidad negativa en el depósito");
    }

    @Test
    @DisplayName("test_WithdrawalFailsWithNegativeAmount")
    void test_WithdrawalFailsWithNegativeAmount(){
        // GIVEN: inicializo una cuenta con saldo inicial
        PalomaAccount palomaAccount = new PalomaAccount("12345", 1000.0);

        // WHEN y THEN: intento retirar una cantidad negativa y verifico la excepción
        try {
            palomaAccount.withdrawQuantity(-300.0);
        } catch (IllegalArgumentException e) {
            assertEquals("La cantidad debe ser positiva", e.getMessage());
            return;
        }
        fail("Se esperaba una excepción por cantidad negativa en el retiro");
    }



}
