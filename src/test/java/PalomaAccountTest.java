import org.example.PalomaAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalomaAccountTest {

    @Test
    @DisplayName("test_TheFirstTest")
    void test_IfTheAccountHasAUniqueAccountNumberAndHasBalance(){
        //GIVEN
        PalomaAccount palomaAccount = new PalomaAccount("12345", 1000.0);

        //WHEN
        String accountId = palomaAccount.getAccountId();
        Double balance = palomaAccount.getBalance();

        //THEN


    }


}
