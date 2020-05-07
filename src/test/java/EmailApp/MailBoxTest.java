package EmailApp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MailBoxTest {

//    MailBox testBox;
//    Email testEmail;
//
//    public void setUp() {
//         testBox = new MailBox(100);
//         testEmail = new Email("noah", "doughty");

    @Test
    public void canCreateMailBox() {
        new MailBox();
    }

    @Test
    public void canReceiveEmail() {
        Email testEmail = new Email("", "");
        MailBox inbox = new MailBox();
        MailBox.receiveEmail(testEmail);
        assertThat(new MailBox());
    }


}
