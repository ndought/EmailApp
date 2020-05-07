import EmailApp.Email;
import EmailApp.MailBox;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmailTest {

//    MailBox testBox;
    Email testEmail;

    @BeforeEach
    void setUp() {
//        testBox = new MailBox(100);
        testEmail = new Email("", "");
    }

    @Test
    public void canCreateEmail() {
        new Email("", "");
    }

//    @Test
//    public void mailboxHasAMaximumCapacity() {
//        testBox.getMaxCapacity(100);
//        int result = testBox.getMaxCapacity(100);
//        assertEquals(100, result);
//    }
}

