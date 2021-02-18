import Service.ServiceWhore;
import enity.Whore;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ServiceWhoreTest {

    private ServiceWhore serviceWhore;
    private Whore whore;
     @Before
    public void init(){
         serviceWhore = new ServiceWhore();
     }


     @Test
    public void checkingAdding(){
        whore = new Whore();
        whore.setPrice(10.4);
        whore.setName("Alla");
        assertNotNull(whore);
    }
}
