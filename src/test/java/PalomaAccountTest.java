import org.example.PalomaAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalomaAccountTest {

    @Test
    @DisplayName("test_TheFirstTest")
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


}
