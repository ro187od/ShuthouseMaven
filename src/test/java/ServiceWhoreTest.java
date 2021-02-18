import Service.ServiceWhore;
import enity.Whore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ServiceWhoreTest {

    private static ServiceWhore serviceWhore = new ServiceWhore();
    private static Whore whore = new Whore("Alla", 10.4);

     @Test
    void checkingAdding(){
        assertNotNull(whore);
    }
}
