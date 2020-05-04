import EmailApp.Email;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmailTest {


    @Test
    public void canCreateEmail() {
        new Email();
    }

    @Test
    public void emailWillContainFirstName() {
        Email email = new Email("firstName");
        email.newEmailAddress();
        assertEquals("noah", result);
    }
}

